package com.example.demo;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private AnimalType animalType;
    private String name;
    private Integer age;
    private Boolean isFemale;
    private Boolean isChipped;
    private Boolean isVaccinated;
    private Boolean isSterilized;
    private Boolean isChildFriendly;
    private Boolean isActive;
    private Boolean isAvailable;
    private AnimalSize animalSize;
    private String bio;
    private Integer ownerId;
    private String animalImg1;
    private String animalImg2;
    private String animalImg3;

    // vekt, stueren, hundevennlig, kattevenlig
    public Animal() {
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIsFemale() {
        return isFemale;
    }

    public void setIsFemale(Boolean female) {
        this.isFemale = female;
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

    public Boolean getIsChipped() {
        return isChipped;
    }

    public void setIsChipped(Boolean chipped) {
        isChipped = chipped;
    }

    public Boolean getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public Boolean getIsSterilized() {
        return isSterilized;
    }

    public void setIsSterilized(Boolean sterilized) {
        isSterilized = sterilized;
    }

    public Boolean getIsChildFriendly() {
        return isChildFriendly;
    }

    public void setIsChildFriendly(Boolean childFriendly) {
        isChildFriendly = childFriendly;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean available) {
        isAvailable = available;
    }

    public AnimalSize getAnimalSize() {
        return animalSize;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Boolean getFemale() {
        return isFemale;
    }

    public void setFemale(Boolean female) {
        isFemale = female;
    }

    public void setAnimalSize(AnimalSize animalSize) {
        this.animalSize = animalSize;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getAnimalImg1() {
        return animalImg1;
    }

    public void setAnimalImg1(String animalImg1) {
        this.animalImg1 = animalImg1;
    }

    public String getAnimalImg2() {
        return animalImg2;
    }

    public void setAnimalImg2(String animalImg2) {
        this.animalImg2 = animalImg2;
    }

    public String getAnimalImg3() {
        return animalImg3;
    }

    public void setAnimalImg3(String animalImg3) {
        this.animalImg3 = animalImg3;
    }


}
