package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

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
        return "intropage";
    }

    @GetMapping("/animalProfile/{id}")
    public String getAnimalProfile(@PathVariable int id, Model m, HttpSession s) {
        User user = (User) s.getAttribute("currentUser");

        Animal animal = animalRepository.findById(id).get();
        int getOwnerId = animal.getOwnerId();
        User theAnimalUser = userRepository.findById(getOwnerId).get();

        m.addAttribute("animal", animal);
        m.addAttribute("user", user);
        m.addAttribute("theAnimalUser", theAnimalUser);
        m.addAttribute("currentUser", user);
        return "animalProfile";
    }

    @GetMapping("/animalProfile/{animalId}/bilde")
    public String getAnimalPicture(HttpSession s, @PathVariable int animalId, Model m) {
        Animal animal = animalRepository.findById(animalId).get();
        m.addAttribute("animal", animal);
        return "reg6_animalPicture";
    }

    @PostMapping("/animalProfile/{id}/bilde")
    public String postAnimalPicture(@RequestParam String imageUrl, HttpSession s, @PathVariable int id) {
        Animal animal = animalRepository.findById(id).get();
        animal.setAnimalImg1(imageUrl);
        animalRepository.save(animal);
        return "redirect:/animalProfile/" + id;
    }

    @GetMapping("/userProfile/{userId}")
    public String getUserProfile(@PathVariable int userId, Model m, HttpSession s) {
        User user = userRepository.findById(userId).get();

        User currentUser = (User) s.getAttribute("currentUser");

        m.addAttribute("isApprovedMatch", false);
        m.addAttribute("animalId", null);
        m.addAttribute("user", user);
        m.addAttribute("currentUser", currentUser);

        return "userProfile";
    }

    @GetMapping("/userProfile/{userId}/{animalId}")
    public String getUserProfileAndAnimal(@PathVariable int userId, @PathVariable int animalId, Model m, HttpSession s) {
        User user = userRepository.findById(userId).get();

        User currentUser = (User) s.getAttribute("currentUser");

        Boolean isApprovedMatch = isApprovedMatch(animalId, userId);
        User owner = userRepository.findById(animalId).get();
        m.addAttribute("isApprovedMatch", isApprovedMatch);
        m.addAttribute("owner", owner);
        m.addAttribute("animalId", animalId);
        m.addAttribute("user", user);
        m.addAttribute("currentUser", currentUser);


        return "userProfile";
    }

    @GetMapping("/userProfile/{userId}/bilde")
    public String getProfilePicture(HttpSession s, Model m, @PathVariable int userId) {
        User user = userRepository.findById(userId).get();
        m.addAttribute("user", user);
        return "reg5_profilePicture";
    }

    @PostMapping("/userProfile/{userId}/bilde")
    public String postProfilePicture(@RequestParam String imageUrl, HttpSession s, @PathVariable int userId) {
        User user = userRepository.findById(userId).get();
        user.setUserImg(imageUrl);
        userRepository.save(user);
        s.setAttribute("currentUser", user);
        return "redirect:/userProfile/" + user.getId();
    }

    @GetMapping("/registrer")
    public String getRegistrer(@ModelAttribute User user) {
        return "reg1_newUser";
    }

    /*
        @PostMapping("/registrer")
        public String postRegistrer(@ModelAttribute User user, HttpSession s, Model m, BindingResult result) {
            LoginValidator loginValidator = new LoginValidator();
            if (loginValidator.supports(user.getClass())) {
                loginValidator.validate(user, result);
            }
            if (result.hasErrors()) {
                m.addAttribute("errorMsg", "Feil i utfylling av skjema!");
                return "reg1_newUser";
            }
            s.setAttribute("currentUser", user);
            s.setAttribute("userId", user.getId());
            return "redirect:/preferanser";
        }
    */
    @PostMapping("/registrer")
    public String postRegistrer(@Valid User user, BindingResult result, HttpSession s) {
        if (result.hasErrors()) {
            return "reg1_newUser";
        }
        s.setAttribute("currentUser", user);
        s.setAttribute("userId", user.getId());
        return "redirect:/preferanser";
    }

    @GetMapping("/preferanser")
    public String getPreferanser() {
        return "reg2_userType";
    }

    @GetMapping("/nyttdyr")
    public String getNyttDyr(@ModelAttribute Animal animal, HttpSession s, Model m) {
        User user = (User) s.getAttribute("currentUser");
        m.addAttribute("user", user);
        return "reg3_newAnimal";
    }

    @PostMapping("/nyttdyr")
    public String postNyttDyr(@Valid User user, @Valid Animal animal, BindingResult result, HttpSession s) {

        if (result.hasErrors()) {
            return "reg3_newAnimal";
        }

        // Create user
        User currentUser = (User) s.getAttribute("currentUser");
        currentUser.setMunicipality(user.getMunicipality());
        currentUser.setUserType(UserType.SELLER);
        currentUser.setUserImg("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png");
        userRepository.save(currentUser);

        // Create animal
        animal.setOwnerId(currentUser.getId());
        animal.setIsAvailable(true);

        if (animal.getAnimalType() == AnimalType.CAT) {
            animal.setAnimalImg1("https://petmatch-academy.herokuapp.com/image/cat.png");
        } else {
            animal.setAnimalImg1("https://petmatch-academy.herokuapp.com/image/dog.png");
        }
        animalRepository.save(animal);

        s.setAttribute("currentUser", currentUser);
        return ("redirect:/sellersAnimalsView");

    }

    @GetMapping("/leggtil")
    public String getLeggtil(@ModelAttribute Animal animal, HttpSession s, Model m) {
        User user = (User) s.getAttribute("currentUser");
        m.addAttribute("user", user);
        return "reg3_newAnimal2";
    }

    @PostMapping("/leggtil")
    public String postLeggtil(@Valid Animal animal, BindingResult result, HttpSession s) {

        if (result.hasErrors()) {
            return "reg3_newAnimal2";
        }

        // Create animal
        User currentUser = (User) s.getAttribute("currentUser");
        animal.setOwnerId(currentUser.getId());
        animal.setIsAvailable(true);

        if (animal.getAnimalType() == AnimalType.CAT) {
            animal.setAnimalImg1("https://petmatch-academy.herokuapp.com/image/cat.png");
        } else {
            animal.setAnimalImg1("https://petmatch-academy.herokuapp.com/image/dog.png");
        }
        animalRepository.save(animal);
        return ("redirect:/sellersAnimalsView");

    }

    @GetMapping("/kjoper")
    public String getSellerPreferanser(@ModelAttribute Buyer buyer) {
        return "reg4_buyer";
    }

    @PostMapping("/kjoper")
    public String postSellerPreferanser(@ModelAttribute Buyer buyer, HttpSession s) {
        User user = (User) s.getAttribute("currentUser");

        // Update buyer fields
        buyer.setFirstName(user.getFirstName());
        buyer.setLastName(user.getLastName());
        buyer.setPassword(user.getPassword());
        buyer.setEmail(user.getEmail());
        buyer.setBio(buyer.getBio());
        buyer.setMunicipality(buyer.getMunicipality());
        buyer.setUserType(UserType.BUYER);
        buyer.setIsPreviousAnimalOwner(buyer.getIsPreviousAnimalOwner());
        buyer.setUserImg("https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png");
        buyerRepository.save(buyer);

        user = userRepository.findById(buyer.getId()).get();
        s.setAttribute("currentUser", user);
        return "redirect:/buyerAllAnimalsView";
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

    @GetMapping("/buyerMatches")
    public String getBuyerMatches(HttpSession s, Model m) {
        User user = (User) s.getAttribute("currentUser");
        User currentUser = (User) s.getAttribute("currentUser");

        List<Matches> allMatches = matchRepository.findAllApprovedMatches(user.getId());

        List<Animal> matchedAnimals = getAnimalsFromMatches(allMatches);

        m.addAttribute("user", user);
        m.addAttribute("matchedAnimals", matchedAnimals);
        m.addAttribute("currentUser", currentUser);

        return "buyerMatches";
    }

    @GetMapping("/buyerAllAnimalsView")
    public String getBuyerAllAnimalsView(Model m, HttpSession s) {
        User user = (User) s.getAttribute("currentUser");
        User currentUser = (User) s.getAttribute("currentUser");

        List<Matches> allMatches = matchRepository.findAllByUserId(user.getId());
        List<Animal> matchedAnimals = getAnimalsFromMatches(allMatches);

        List<Animal> allAnimals = (List<Animal>) animalRepository.findAll();

        m.addAttribute("allAnimals", allAnimals);
        m.addAttribute("matchedAnimals", matchedAnimals);
        m.addAttribute("user", user);
        m.addAttribute("currentUser", currentUser);

        return "buyerAllAnimalsView";
    }

    @GetMapping("/allAnimals")
    public String getAllAnimals(Model m, HttpSession s) {
        List<Animal> allAnimals = (List<Animal>) animalRepository.findAll();
        m.addAttribute("allAnimals", allAnimals);
        return "allAnimals";
    }

    @GetMapping("/sellersAnimalLikes/{animalId}")
    public String getsellersAnimalLikes(@PathVariable int animalId, Model m, HttpSession s) {
        User user = (User) s.getAttribute("currentUser");

        Animal animal = animalRepository.findById(animalId).get();
        List<Matches> allMatches = matchRepository.findAllByAnimalId(animal.getId());
        List<User> matchedUsers = getUsersFromMatches(allMatches);

        List<Matches> allApprovedMatches = matchRepository.findAllApprovedMatchesByAnimalId(animalId);
        List<User> approvedUsers = getUsersFromMatches(allApprovedMatches);

        m.addAttribute("animal", animal);
        m.addAttribute("user", user);
        m.addAttribute("matchedUsers", matchedUsers);
        m.addAttribute("approvedUsers", approvedUsers);
        m.addAttribute("currentUser", user);

        return "sellersAnimalLikes";
    }

    @GetMapping("/sellersAnimalsView")
    public String getsellersAnimalsView(Model m, HttpSession s) {
        User user = (User) s.getAttribute("currentUser");


        List<Animal> myAnimals = animalRepository.findAllByOwnerId(user.getId());

        m.addAttribute("myAnimals", myAnimals);
        m.addAttribute("user", user);
        m.addAttribute("currentUser", user);


        return "sellersAnimalsView";
    }

    @GetMapping("/match/{animalId}/{userId}")
    public String getMatch(@PathVariable int animalId, @PathVariable int userId) {
        Matches match = new Matches(animalId, userId, false);
        matchRepository.save(match);
        return "redirect:/buyerAllAnimalsView";
    }

    @GetMapping("/approve/{animalId}/{userId}")
    public String approveMatch(@PathVariable int animalId, @PathVariable int userId) {

        Matches match = matchRepository.findByAnimalIdAndUserId(animalId, userId);
        approveMatch(match.getId());
        System.out.println("Match id: " + match.getId());

        return "redirect:/sellersAnimalLikes/" + animalId;
    }


    public List<Animal> getAnimalsFromMatches(List<Matches> matchList) {
        List<Animal> matchedAnimals = new ArrayList<>();

        for (Matches match : matchList) {
            Animal animal = animalRepository.findById(match.getAnimalId()).get();
            matchedAnimals.add(animal);
        }

        return matchedAnimals;
    }

    public List<User> getUsersFromMatches(List<Matches> matchList) {
        List<User> matchedUsers = new ArrayList<>();

        for (Matches match : matchList) {
            User user = userRepository.findById(match.getUserId()).get();
            matchedUsers.add(user);
        }
        return matchedUsers;
    }

    public void approveMatch(int matchId) {
        Matches match = matchRepository.findById(matchId).get();
        match.setApproved(Boolean.TRUE);
        matchRepository.save(match);
    }

    public Boolean isApprovedMatch(int animalId, int userId) {
        Matches match = matchRepository.findApprovedByAnimalIdAndUserId(animalId, userId);

        if (match != null) {
            return true;
        }

        return false;
    }

}