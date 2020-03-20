package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


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

    @GetMapping("/loggInn")
    public String getLoggInn(@ModelAttribute User user) {
        User userEmail = userRepository.findByEmail(user.getEmail());
        return "login";
    }

    @GetMapping("/testing")
    public String getTesting() {
        return "testing";
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