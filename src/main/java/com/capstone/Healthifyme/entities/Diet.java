package com.capstone.Healthifyme.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diet {
	@Id
	private int id;
	private String breakfast;
	private String lunch;
	private String dinner;
	private String calorieIntake;
	private int protein;
	private int fat;
	private int carb;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public String getCalorieIntake() {
		return calorieIntake;
	}

	public void setCalorieIntake(String calorieIntake) {
		this.calorieIntake = calorieIntake;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getCarb() {
		return carb;
	}

	public void setCarb(int carb) {
		this.carb = carb;
	}

	@Override
	public String toString() {
		return "Diet [id=" + id + ", breakfast=" + breakfast + ", lunch=" + lunch + ", dinner=" + dinner
				+ ", calorieIntake=" + calorieIntake + ", protein=" + protein + ", fat=" + fat + ", carb=" + carb + "]";
	}

}
