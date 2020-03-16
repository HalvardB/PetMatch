package com.example.demo;

import java.util.List;

public class Cat extends Animal{
    private CatRace catRace;

    public Cat(AnimalType animalType, String name, int age, String bio, Boolean isChipped, Boolean isVaccinated, Boolean isSterilized, Boolean isChildFriendly, Boolean isActive, Boolean isAvailable, AnimalSize animalSize, List<Picture> pictureList, List<Buyer> matchList, CatRace catRace) {
        super(animalType, name, age, bio, isChipped, isVaccinated, isSterilized, isChildFriendly, isActive, isAvailable, animalSize, pictureList, matchList);
        this.catRace = catRace;
    }
}
