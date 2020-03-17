package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PetmatchApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void canLoadEmptyH2db(){
        assertEquals(false, userRepository.findAll().iterator().hasNext());
    }

    @Test
    void makeAUserProfile() {
        User user = new User("Robin", "Dalboy", "Secret", "robin@dalboy.com");
        userRepository.save(user);
        assertEquals(true, userRepository.findAll().iterator().hasNext());
    }


}
