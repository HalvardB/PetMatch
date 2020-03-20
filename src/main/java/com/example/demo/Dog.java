package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn
public class Dog extends Animal {

    @Id
    private int id;
//    private DogBreed dogBreed;

    public Dog(){};

    @Override
    public int getId() {
        return id;
    }
    //    public Dog(AnimalType animalType, String name, int age, Boolean isChipped, Boolean isVaccinated, Boolean isSterilized, Boolean isChildFriendly, Boolean isActive, Boolean isAvailable, AnimalSize animalSize, Boolean isFemale, String bio, List<Picture> pictureList, List<Buyer> matchList, DogBreed dogBreed) {
//        super(animalType, name, age, isChipped, isVaccinated, isSterilized, isChildFriendly, isActive, isAvailable, animalSize, isFemale, bio, pictureList, matchList);
//        this.dogBreed = dogBreed;
//    }
}
