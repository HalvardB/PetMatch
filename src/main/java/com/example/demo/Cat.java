package com.example.demo;

import java.util.List;

public class Cat extends Animal{
    private CatBreed catBreed;

    public Cat(AnimalType animalType, String name, int age, Boolean isChipped, Boolean isVaccinated, Boolean isSterilized, Boolean isChildFriendly, Boolean isActive, Boolean isAvailable, AnimalSize animalSize, Boolean isFemale, String bio, List<Picture> pictureList, List<Buyer> matchList, CatBreed catBreed) {
        super(animalType, name, age, isChipped, isVaccinated, isSterilized, isChildFriendly, isActive, isAvailable, animalSize, isFemale, bio, pictureList, matchList);
        this.catBreed = catBreed;
    }
}
