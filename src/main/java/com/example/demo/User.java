package com.example.demo;

import java.util.List;

public interface User {
    String firstName;
    String lastName;
    String password;
    String email;
    Municipality municipality;
    String bio;
    Boolean wantNewsletter;
    UserType userType;
    List<Picture> pictureList;
}
