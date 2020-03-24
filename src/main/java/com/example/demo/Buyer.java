package com.example.demo;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn
public class Buyer extends User {

    @Id
    private int id;

    @Enumerated(EnumType.STRING)
    private AnimalType animalType;
    @Enumerated(EnumType.STRING)
    private HomeType homeType;
    private Boolean isPreviousAnimalOwner;
    private Boolean hasChildren;

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
        this.isPreviousAnimalOwner = isPreviousAnimalOwner;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}
