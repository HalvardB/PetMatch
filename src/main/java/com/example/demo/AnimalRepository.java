package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.ownerId = ?1")
    List<Animal> findAllByOwnerId(Integer ownerId);

    List<Animal> findAllByOrderByIdDesc();
}
