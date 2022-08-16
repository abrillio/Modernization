package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.entities.User;
import com.capstone.Healthifyme.repos.UserRepo;
import com.capstone.Healthifyme.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	// just creating a sample program for getting all the users
	@GetMapping(path = "/users")
	public List<User> getUsers() {
		return this.userService.
	}
	
	@PostMapping(path = "/register")
	public 

//	@PostMapping(path="/users")
//	public void addUser() {
//		userRepo.save(user);
//	}
}
