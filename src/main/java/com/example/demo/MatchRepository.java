package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MatchRepository extends CrudRepository<Match, Integer> {

    @Query("SELECT m FROM Match m WHERE m.userId = ?1")
    List<Match> findAllByUserId(Integer userId);

    @Query("SELECT m FROM Match m WHERE m.userId = ?1 and m.approved = TRUE")
    List<Match> findAllApprovedMatches(Integer userId);

    @Query("SELECT m FROM Match m WHERE m.animalId = ?1")
    List<Match> findAllByAnimalId(Integer animalId);

    @Query("SELECT m FROM Match m WHERE m.animalId = ?1 and m.userId = ?2")
    Match findByAnimalIdAndUserId(Integer animalId, Integer userId);

}
