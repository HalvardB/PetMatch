package com.example.demo;

import java.util.List;

public class Buyer extends User {
    AnimalType animalType;
    HomeType homeType;
    Boolean isPreviousAnimalOwner;
    Boolean hasChildren;

    public Buyer(String firstName, String lastName, String password, String email, Municipality municipality, String bio, Boolean wantNewsletter, UserType userType, List<Picture> pictureList, AnimalType animalType, HomeType homeType, Boolean isPreviousAnimalOwner, Boolean hasChildren) {
        super(firstName, lastName, password, email, municipality, bio, wantNewsletter, userType, pictureList);
        this.animalType = animalType;
        this.homeType = homeType;
        this.isPreviousAnimalOwner = isPreviousAnimalOwner;
        this.hasChildren = hasChildren;
    }
}
