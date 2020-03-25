package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="FIRST_NAME")
    @Size(min=3, max=20)
    private String firstName;
    @Column(name="LAST_NAME")
    @Size(min=3, max=30)
    private String lastName;
    @Size(min=6, max=50)
    private String password;
    @Column(name = "EMAIL")
    @Email
    private String email;
    @Enumerated(EnumType.STRING)
    private Municipality municipality;
    private Boolean wantNewsletter;
    @Enumerated(EnumType.STRING)
    private UserType userType;
    private String bio;
    private String userImg;


    public User(){}

    public User(String firstName, String lastName, String password, String email, Municipality municipality, String bio, Boolean wantNewsletter, UserType userType, String userImg) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.municipality = municipality;
        this.wantNewsletter = wantNewsletter;
        this.userType = userType;
        this.bio = bio;
        this.userImg = userImg;
    }

    public User(String firstName, String lastName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }
}
