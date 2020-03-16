package com.example.demo;

public class Buyer implements User {
    AnimalType animalType;
    HomeType homeType;
    Boolean isPreviousAnimalOwner;
    Boolean hasChildren;

    public Buyer(AnimalType animalType, HomeType homeType, Boolean isPreviousAnimalOwner, Boolean hasChildren) {
        this.animalType = animalType;
        this.homeType = homeType;
        this.isPreviousAnimalOwner = isPreviousAnimalOwner;
        this.hasChildren = hasChildren;
    }
}
