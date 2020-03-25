package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private AnimalType animalType;

    @Column(name="NAME")
    @Size(min=3, max=20)
    private String name;

    @Column(name="AGE")
    @Positive
    @Max(value = 20)
    private Integer age;

    private Boolean isFemale;
    private Boolean isChipped;
    private Boolean isVaccinated;
    private Boolean isSterilized;
    private Boolean isChildFriendly;
    private Boolean isActive;
    private Boolean isAvailable;

    @Enumerated(EnumType.STRING)
    private AnimalSize animalSize;

    @Column(name="BIO")
    @Size(max = 500)
    private String bio;

    private Integer ownerId;

    @Column(name="ANIMAL_IMG1")
    @Size(max = 100)
    private String animalImg1;
    private String animalImg2;
    private String animalImg3;

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Integer getAge() {
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
        this.isVaccinated = vaccinated;
    }

    public Boolean getIsSterilized() {
        return isSterilized;
    }

    public void setIsSterilized(Boolean sterilized) {
        this.isSterilized = sterilized;
    }

    public Boolean getIsChildFriendly() {
        return isChildFriendly;
    }

    public void setIsChildFriendly(Boolean childFriendly) {
        this.isChildFriendly = childFriendly;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        this.isActive = active;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean available) {
        this.isAvailable = available;
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
        this.isFemale = female;
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
