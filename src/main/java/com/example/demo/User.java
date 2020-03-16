package com.example.demo;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private Municipality municipality;
    private String bio;
    private Boolean wantNewsletter;
    private UserType userType;
    private List<Picture> pictureList; // Only profile picture? Remove list

    public User(String firstName, String lastName, String password, String email, Municipality municipality, String bio, Boolean wantNewsletter, UserType userType, List<Picture> pictureList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.municipality = municipality;
        this.bio = bio;
        this.wantNewsletter = wantNewsletter;
        this.userType = userType;
        this.pictureList = pictureList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Boolean getWantNewsletter() {
        return wantNewsletter;
    }

    public void setWantNewsletter(Boolean wantNewsletter) {
        this.wantNewsletter = wantNewsletter;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }


}
