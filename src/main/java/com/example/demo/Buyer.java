package com.example.demo;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn
public class Buyer extends User {

    @Id
    private int id;

    AnimalType animalType;
    HomeType homeType;
    Boolean isPreviousAnimalOwner;
    Boolean hasChildren;

    public Buyer(){};

    public Buyer(String firstName, String lastName, String password, String email, Municipality municipality, String bio, Boolean wantNewsletter, UserType userType, String userImage, AnimalType animalType, HomeType homeType, Boolean isPreviousAnimalOwner, Boolean hasChildren) {
        super(firstName, lastName, password, email, municipality, bio, wantNewsletter, userType, userImage);
        this.animalType = animalType;
        this.homeType = homeType;
        this.isPreviousAnimalOwner = isPreviousAnimalOwner;
        this.hasChildren = hasChildren;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public HomeType getHomeType() {
        return homeType;
    }

    public void setHomeType(HomeType homeType) {
        this.homeType = homeType;
    }

    public Boolean getIsPreviousAnimalOwner() {
        return isPreviousAnimalOwner;
    }

    public void setIsPreviousAnimalOwner(Boolean isPreviousAnimalOwner) {
        isPreviousAnimalOwner = isPreviousAnimalOwner;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}
