package com.example.demo;

import java.util.List;

public class Seller extends User {
    List<Animal> animalList;

    public Seller(String firstName, String lastName, String password, String email, Municipality municipality, String bio, Boolean wantNewsletter, UserType userType, String userImg, AnimalType animalType, List<Animal> animalList) {
        super(firstName, lastName, password, email, municipality, bio, wantNewsletter, userType, userImg);
        this.animalList = animalList;
    }
}
