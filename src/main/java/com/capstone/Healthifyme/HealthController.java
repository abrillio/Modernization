package com.capstone.Healthifyme;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.POJOS.User;

@RestController
@Controller
public class HealthController {
	@Autowired
	User user;
	
	//just creating a sample program for getting all the users
	@GetMapping(path="/Users")
	public List<User> getUsers(){
		return null;// we need to return user.findAll();
	}
	

}
