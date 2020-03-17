package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PetMatchController {

    @Autowired UserRepository userRepository;

    @GetMapping("/")
    public String getHome() {
        User newUser = new User("Halvard", "Bastiansen", "123", "h@lvard.com");
        userRepository.save(newUser);
        return "index";
    }

    @GetMapping("/registrer")
    public String getRegistrer(@ModelAttribute User user) {
        return "nyBruker";
    }

    @PostMapping("/registrer")
    public String postRegistrer(@ModelAttribute User user) {
        userRepository.save(user);
        return "intropage";
    }

}
