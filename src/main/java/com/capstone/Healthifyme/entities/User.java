package com.capstone.Healthifyme.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
//
//	USER
//	id(int)(PK)
//	name(str)
//	age(int)
//	weight(int)
//	height(int)
//	activatedPlanId(int)(FK)
	@Id
	private int id;
	private String name;
	private int age;
	private int height;// in centimeter
	private int activatedPlanId;
	private int password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getActivatedPlanId() {
		return activatedPlanId;
	}

	public void setActivatedPlanId(int activatedPlanId) {
		this.activatedPlanId = activatedPlanId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + ", activatedPlanId="
				+ activatedPlanId + ", password=" + password + "]";
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
