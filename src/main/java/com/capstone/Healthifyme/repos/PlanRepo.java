package com.capstone.Healthifyme.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Healthifyme.entities.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
