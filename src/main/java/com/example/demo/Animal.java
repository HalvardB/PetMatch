package com.example.demo;

import java.util.List;

public class Animal {
    private AnimalType animalType;
    private String name;
    private int age;
    private String bio;
    private Boolean isChipped;
    private Boolean isVaccinated;
    private Boolean isSterilized;
    private Boolean isChildFriendly;
    private Boolean isActive;
    private Boolean isAvailable;
    private AnimalSize animalSize;
    private List<Picture> pictureList;
    private List<Buyer> matchList;

    public Animal(AnimalType animalType, String name, int age, String bio, Boolean isChipped, Boolean isVaccinated, Boolean isSterilized, Boolean isChildFriendly, Boolean isActive, Boolean isAvailable, AnimalSize animalSize, List<Picture> pictureList, List<Buyer> matchList) {
        this.animalType = animalType;
        this.name = name;
        this.age = age;
        this.bio = bio;
        this.isChipped = isChipped;
        this.isVaccinated = isVaccinated;
        this.isSterilized = isSterilized;
        this.isChildFriendly = isChildFriendly;
        this.isActive = isActive;
        this.isAvailable = isAvailable;
        this.animalSize = animalSize;
        this.pictureList = pictureList;
        this.matchList = matchList;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Boolean getChipped() {
        return isChipped;
    }

    public void setChipped(Boolean chipped) {
        isChipped = chipped;
    }

    public Boolean getVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public Boolean getSterilized() {
        return isSterilized;
    }

    public void setSterilized(Boolean sterilized) {
        isSterilized = sterilized;
    }

    public Boolean getChildFriendly() {
        return isChildFriendly;
    }

    public void setChildFriendly(Boolean childFriendly) {
        isChildFriendly = childFriendly;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public AnimalSize getAnimalSize() {
        return animalSize;
    }

    public void setAnimalSize(AnimalSize animalSize) {
        this.animalSize = animalSize;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public List<Buyer> getMatchList() {
        return matchList;
    }

    public void setMatchList(List<Buyer> matchList) {
        this.matchList = matchList;
    }
}
