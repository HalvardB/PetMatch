package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    Iterable<User> findByFirstName(String firstName);
    Iterable<User> findByLastName(String lastName);
    Iterable<User> findByPassword(String password);
    Iterable<User> findByEmail(String email);
}
