package com.capstone.Healthifyme.services;

import java.util.List;

import com.capstone.Healthifyme.entities.User;

public interface UserService {
	public List<User> getUsers();
	
	public String registerUser(User user);

}
