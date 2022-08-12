package com.capstone.Healthifyme.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Healthifyme.entities.Diet;

public interface DietRepo extends JpaRepository<Diet, Integer> {

}
