package com.capstone.Healthifyme.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plan {
	@Id
	private int id;
	private String plan;
	private int dietId;
	private int workoutId;

	public int getDietId() {
		return dietId;
	}

	public void setDietId(int dietId) {
		this.dietId = dietId;
	}

	public int getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", plan=" + plan + ", dietId=" + dietId + ", workoutId=" + workoutId + "]";
	}
	
}
