package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PetmatchApplicationTests {

    @Autowired
    PetMatchController pmc = new PetMatchController();

    @Test
    void contextLoads() {
    }

    @Test
    void testLoadH2db(){
        assertEquals(true, pmc.userRepository.findAll().iterator().hasNext());
    }

    @Test
    void testCreateUser() {
        User user = new User("Robin", "Dalboy", "Secret", "robin@dalboy.com");
        pmc.userRepository.save(user);
        assertEquals("Robin", pmc.userRepository.findByEmail("robin@dalboy.com").getFirstName());
    }

    @Test
    void testGetAnimalsFromMatches(){
        List<Match> matchList = pmc.matchRepository.findAllByUserId(1);
        List<Animal> animalList = pmc.getAnimalsFromMatches(matchList);
        assertEquals(2, animalList.size());
    }

    @Test
    void testGetUsersFromMatches() {
        List<Match> matchList = pmc.matchRepository.findAllByAnimalId(13);
        List<User> userList = pmc.getUsersFromMatches(matchList);
        assertEquals(3, userList.size());
    }

    @Test
    void testApproveMatch(){
        Match match = pmc.matchRepository.findById(1).get();
        assertEquals(false, match.getApproved());
        pmc.approveMatch(1);

        match = pmc.matchRepository.findById(1).get();
        assertEquals(true, match.getApproved());
    }
}
