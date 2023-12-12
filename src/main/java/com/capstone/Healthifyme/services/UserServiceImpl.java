package com.capstone.Healthifyme.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capstone.Healthifyme.entities.User;
import com.capstone.Healthifyme.repos.UserRepo;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}

	@Override
	public String registerUser(User user) {
		try {
			userRepo.save(user);
			return "User inserted successfully";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error Occurred";
		}
	}

}
