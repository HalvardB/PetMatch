package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String postRegistrer(@ModelAttribute User user, HttpSession session) {
        userRepository.save(user);
        session.setAttribute("currentUser", user);
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
    public String postNyttDyr(@ModelAttribute Animal animal) {
        animalRepository.save(animal);
        return("redirect:/nyttdyr");
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

}