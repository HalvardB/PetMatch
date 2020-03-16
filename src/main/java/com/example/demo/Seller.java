package com.example.demo;

import java.util.List;

public class Seller extends User {
    AnimalType animalType;
    List<Animal> animalList;

    public Seller(String firstName, String lastName, String password, String email, Municipality municipality, String bio, Boolean wantNewsletter, UserType userType, List<Picture> pictureList, AnimalType animalType, List<Animal> animalList) {
        super(firstName, lastName, password, email, municipality, bio, wantNewsletter, userType, pictureList);
        this.animalType = animalType;
        this.animalList = animalList;
    }
}
