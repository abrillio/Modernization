//package com.capstone.Healthifyme.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.capstone.Healthifyme.entities.User;
//import com.capstone.Healthifyme.repos.UserRepo;
//
//public class JwtUserDetailsService implements UserDetailsService{
//	
//	@Autowired
//	private UserRepo userRepo;
//
//
//	@Override
//	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//		User user;
//		
//		user = userRepo.findByemail(email);
//		if(user.getName().equals(email)) return (UserDetails) user;
//		// TODO Auto-generated method stub
//		else throw new UsernameNotFoundException("User Not Found");
//		
//	}
//	
//
//}
