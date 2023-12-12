package com.capstone.Healthifyme.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Healthifyme.entities.Workout;

public interface WorkoutRepo extends JpaRepository<Workout, Integer> {

}
