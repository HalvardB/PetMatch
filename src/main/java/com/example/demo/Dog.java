package com.example.demo;

import java.util.List;

public class Dog extends Animal {
    private DogBreed dogBreed;

    public Dog(AnimalType animalType, String name, int age, Boolean isChipped, Boolean isVaccinated, Boolean isSterilized, Boolean isChildFriendly, Boolean isActive, Boolean isAvailable, AnimalSize animalSize, Boolean isFemale, String bio, List<Picture> pictureList, List<Buyer> matchList, DogBreed dogBreed) {
        super(animalType, name, age, isChipped, isVaccinated, isSterilized, isChildFriendly, isActive, isAvailable, animalSize, isFemale, bio, pictureList, matchList);
        this.dogBreed = dogBreed;
    }
}
