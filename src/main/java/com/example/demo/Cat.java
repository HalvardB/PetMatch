package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn
public class Cat extends Animal{

    @Id
    private int id;
//    private CatBreed catBreed;

    public Cat(){};

    @Override
    public int getId() {
        return id;
    }

    //    public Cat(AnimalType animalType, String name, int age, Boolean isChipped, Boolean isVaccinated, Boolean isSterilized, Boolean isChildFriendly, Boolean isActive, Boolean isAvailable, AnimalSize animalSize, Boolean isFemale, String bio, CatBreed catBreed) {
//            super(animalType, name, age, isChipped, isVaccinated, isSterilized, isChildFriendly, isActive, isAvailable, animalSize, isFemale, bio);
//            this.catBreed = catBreed;
//
//    }
}
