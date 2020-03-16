package com.example.demo;

import java.util.List;

public class Dog extends Animal {
    private DogRace dogRace;

    public Dog(AnimalType animalType, String name, int age, String bio, Boolean isChipped, Boolean isVaccinated, Boolean isSterilized, Boolean isChildFriendly, Boolean isActive, Boolean isAvailable, AnimalSize animalSize, List<Picture> pictureList, List<Buyer> matchList, DogRace dogRace) {
        super(animalType, name, age, bio, isChipped, isVaccinated, isSterilized, isChildFriendly, isActive, isAvailable, animalSize, pictureList, matchList);
        this.dogRace = dogRace;
    }
}
