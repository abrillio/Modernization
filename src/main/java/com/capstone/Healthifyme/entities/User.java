package com.capstone.Healthifyme.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
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
	private String email;
	private String name;
	private int age;
	private int weight;
	private int height;// in centimeter
	private int activatedPlanId;
	private String password;

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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", name=" + name + ", age=" + age + ", weight="
				+ weight + ", height=" + height + ", plan=" + plan + "]";
	}

}
