package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmail (String email);

 /*   @Query("SELECT u.id , a.animalId, a.name, a.age, a.animalImg1, count(m.userId)" +
            "FROM User u " +
            "LEFT JOIN Animal a ON a.owner = " +
            "LEFT JOIN Matches m on m.user" +
            "WHERE user.id = ?1" +
            "group by a.id")

   User findCountByUserId(Integer userId);*/
}
