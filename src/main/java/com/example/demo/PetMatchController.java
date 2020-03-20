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
import java.util.List;


@Controller
public class PetMatchController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    BuyerRepository buyerRepository;

    @GetMapping("/")
    public String getHome() {
//        User newUser = new User("Halvard", "Bastiansen", "123", "h@lvard.com");
//        userRepository.save(newUser);
        return "intropage";
    }

    @GetMapping("animal/{id}")
    public String getAnimalProfile(@PathVariable Integer id, Model m){
        Animal animal = animalRepository.findById(id).get();
        m.addAttribute("animal", animal);
        return "animalProfile";
    }

    @GetMapping("animals")
    public String getAnimalProfile(Model m){
        List<Animal> animals = (List<Animal>) animalRepository.findAll();
        m.addAttribute("animals", animals);
        return "buyersAllAnimalsView";
    }

    @GetMapping("/animalProfile")
    public String getAnimalProfile(@ModelAttribute User user) {
        return "animalProfile";
    }

    @GetMapping("/userProfile")
    public String getUserProfile(@ModelAttribute User user) {
        return "userProfile";
    }

    @GetMapping("/registrer")
    public String getRegistrer(@ModelAttribute User user) {
        return "reg1_newUser";
    }

    @PostMapping("/registrer")
    public String postRegistrer(@ModelAttribute User user, HttpSession s) {
        userRepository.save(user);
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
        animal.setOwnerId((Integer) s.getAttribute("userId"));
        animal.setIsAvailable(true);
        animalRepository.save(animal);

        User user = userRepository.findById((Integer) s.getAttribute("userId")).get();
        user.setUserType(UserType.SELLER);
        userRepository.save(user);

        return("redirect:/");
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }


    @PostMapping("/login")
    public String postLogin(@ModelAttribute User user, HttpSession s) {
        User logger = userRepository.findByEmail(user.getEmail());

        if (logger.equals(user.getEmail()) && logger.getPassword().equals(user.getPassword())){
    s.setAttribute("logger", user.getEmail());
        }
        return "/buyerAllAnimalsView";
    }

    @GetMapping("/testing")
    public String getTesting() {
        return "testing";
    }

    @GetMapping("/buyerMatches")
    public String getBuyerMatches() {
        return "buyerMatches";
    }

    @GetMapping("/buyerAllAnimalsView")
    public String getBuyerAllAnimalsView() {
        return "buyerAllAnimalsView";
    }

    @GetMapping("/kjoper")
    public String getSellerPreferanser(@ModelAttribute Buyer buyer) {
        return "reg4_buyer";
    }

    @PostMapping("/kjoper")
    public String postSellerPreferanser(@ModelAttribute Buyer buyer, HttpSession s) {
        User user = userRepository.findById((Integer) s.getAttribute("userId")).get();

        buyer.setId(user.getId());
        buyerRepository.save(buyer);

        user.setUserType(UserType.BUYER);
        userRepository.save(user);
        return "redirect:/";
    }

}