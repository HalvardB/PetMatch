package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class PetMatchController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    BuyerRepository buyerRepository;

    @Autowired
    MatchRepository matchRepository;

    @GetMapping("/")
    public String getHome() {
//        User newUser = new User("Halvard", "Bastiansen", "123", "h@lvard.com");
//        userRepository.save(newUser);
        return "intropage";
    }


    @GetMapping("/animalProfile/{id}")
    public String getAnimalProfile(@PathVariable int id, Model m) {
        Animal animal = animalRepository.findById(id).get();
        int getOwnerId = animal.getOwnerId();
        User theAnimalUser = userRepository.findById(getOwnerId).get();

        m.addAttribute("animal", animal);
        m.addAttribute("theAnimalUser", theAnimalUser);
        return "animalProfile";
    }


    @GetMapping("/userProfile/{userId}")
    public String getUserProfile(@PathVariable int userId, Model m) {
        User user = userRepository.findById(userId).get();
        m.addAttribute("user", user);
        return "userProfile";
    }

    @GetMapping("/registrer")
    public String getRegistrer(@ModelAttribute User user) {
        return "reg1_newUser";
    }

    @PostMapping("/registrer")
    public String postRegistrer(@ModelAttribute User user, HttpSession s) {
        s.setAttribute("currentUser", user);
        s.setAttribute("userId", user.getId());
        return "redirect:/preferanser";
    }

    @GetMapping("/preferanser")
    public String getPreferanser() {
        return "reg2_userType";
    }

    @GetMapping("/nyttdyr")
    public String getNyttDyr(@ModelAttribute Animal animal) {
        return "reg3_newAnimal";
    }

    @PostMapping("/nyttdyr")
    public String postNyttDyr(@ModelAttribute Animal animal, HttpSession s) {
        User user = (User) s.getAttribute("currentUser");

        user.setUserType(UserType.SELLER);
        user.setUserImg("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png");
        userRepository.save(user);

        animal.setOwnerId(user.getId());
        animal.setIsAvailable(true);
        animal.setAnimalImg1("https://cdn.pixabay.com/photo/2015/06/12/18/44/fox-807315_1280.png");
        animalRepository.save(animal);

        // Updating session
        s.setAttribute("currentUser", user);
        s.setAttribute("userId", user.getId());

        return("redirect:/sellersAnimalsView");
    }

    @GetMapping("/login")
    public String getLogin(@ModelAttribute User user) {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@ModelAttribute User user, HttpSession s) {
        User logger = userRepository.findByEmail(user.getEmail());

        if (logger != null && logger.getEmail().equals(user.getEmail()) && logger.getPassword().equals(user.getPassword())) {
            s.setAttribute("currentUser", logger);

            if (logger.getUserType() == UserType.BUYER) {
            return "redirect:/buyerAllAnimalsView";
            }

            return "redirect:/sellersAnimalsView";
        }
        return "login";

    }

    @GetMapping("/testing")
    public String getTesting() {
        return "testing";
    }

    @GetMapping("/buyerMatches")
    public String getBuyerMatches(HttpSession s, Model m) {
        User user = (User) s.getAttribute("currentUser");

        List<Match> allMatches = matchRepository.findAllApprovedMatches(user.getId());
        List<Animal> matchedAnimals = getAnimalsFromMatches(allMatches);
        m.addAttribute("matchedAnimals", matchedAnimals);

        return "buyerMatches";
    }

    @GetMapping("/buyerAllAnimalsView")
    public String getBuyerAllAnimalsView(Model m, HttpSession s) {
        User user = (User) s.getAttribute("currentUser");

        List<Match> allMatches = matchRepository.findAllByUserId(user.getId());
        List<Animal> matchedAnimals = getAnimalsFromMatches(allMatches);

        List<Animal> allAnimals = (List<Animal>) animalRepository.findAll();

        m.addAttribute("allAnimals", allAnimals);
        m.addAttribute("matchedAnimals", matchedAnimals);
        m.addAttribute("user", user);

        return "buyerAllAnimalsView";
    }

    @GetMapping("/kjoper")
    public String getSellerPreferanser(@ModelAttribute Buyer buyer) {
        return "reg4_buyer";
    }

    @PostMapping("/kjoper")
    public String postSellerPreferanser(@ModelAttribute Buyer buyer, HttpSession s) {
        User user = (User) s.getAttribute("currentUser");

        // Update user fields
        buyer.setFirstName(user.getFirstName());
        buyer.setLastName(user.getLastName());
        buyer.setPassword(user.getPassword());
        buyer.setEmail(user.getEmail());
        buyer.setUserType(UserType.BUYER);
        buyer.setUserImg("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png");

        buyerRepository.save(buyer);
        user = userRepository.findById(buyer.getId()).get();

        // Updating session
        s.setAttribute("currentUser", user);
        s.setAttribute("userId", user.getId());
        return "redirect:/buyerAllAnimalsView";
    }

    @GetMapping("/sellersAnimalLikes/{animalId}")
    public String getsellersAnimalLikes(@PathVariable int animalId, Model m, HttpSession s) {
        User user = (User) s.getAttribute("currentUser");

        Animal animal = animalRepository.findById(animalId).get();
        List<Match> allMatches = matchRepository.findAllByAnimalId(animal.getId());
        List<User> matchedUsers = getUsersFromMatches(allMatches);

        m.addAttribute("animal", animal);
        m.addAttribute("theAnimalUser", user);
        m.addAttribute("matchedUsers", matchedUsers);
        return "sellersAnimalLikes";
    }

    @GetMapping("/sellersAnimalsView")
    public String getsellersAnimalsView(Model m, HttpSession s) {
        User user = (User) s.getAttribute("currentUser");

        List<Animal> myAnimals = animalRepository.findAllByOwnerId(user.getId());
        m.addAttribute("myAnimals", myAnimals);
        return "sellersAnimalsView";
    }

    @GetMapping("/match/{animalId}/{userId}")
    public String getMatch(@PathVariable int animalId, @PathVariable int userId){
        Match match = new Match(animalId, userId, false);
        matchRepository.save(match);
        return "redirect:/buyerAllAnimalsView";
    }

    @GetMapping("/approve/{animalId}/{userId}")
    public String approveMatch(@PathVariable int animalId, @PathVariable int userId){

        Match match = matchRepository.findByAnimalIdAndUserId(animalId, userId);
        approveMatch(match.getId());
        System.out.println("Match id: " + match.getId());

        return "redirect:/sellersAnimalLikes/" + animalId;
    }


    public List<Animal> getAnimalsFromMatches(List<Match> matchList){
        List<Animal> matchedAnimals = new ArrayList<>();

        for(Match match : matchList){
            Animal animal = animalRepository.findById(match.getAnimalId()).get();
            matchedAnimals.add(animal);
        }

        return matchedAnimals;
    }

    public List<User> getUsersFromMatches(List<Match> matchList){
        List<User> matchedUsers = new ArrayList<>();

        for(Match match : matchList){
            User user  = userRepository.findById(match.getUserId()).get();
            matchedUsers.add(user);
        }

        return matchedUsers;
    }

    public void approveMatch(int matchId){
        Match match = matchRepository.findById(matchId).get();
        match.setApproved(Boolean.TRUE);
        matchRepository.save(match);
    }

}