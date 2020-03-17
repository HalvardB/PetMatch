package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByFirstName(String firstName);
    User findByLastName(String lastName);
    User findByPassword(String password);
    User findByEmail (String email);
}
