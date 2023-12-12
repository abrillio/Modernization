///**
// * 
// */
//package com.capstone.Healthifyme.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.capstone.Healthifyme.services.JwtUserDetailsService;
//
///**
// * @author Utkarsh.Chaurasia
// *
// */
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
//
//	@Autowired
//	private JwtRequestFilter jwtRequestFilter;
//
//	@Autowired
//	private JwtUserDetailsService jwtUserDetailsService;
//	
//	
//
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////		// TODO Auto-generated method stub
////		http.csrf().disable().cors().disable().authorizeRequests().antMatchers("/token").permitAll().anyRequest()
////				.authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
////		super.configure(http);
////	}
//	
//	@Override
//	protected void configure(HttpSecurity httpSecurity) throws Exception {
//		// We don't need CSRF for this example
//		httpSecurity.csrf().disable()
//				// dont authenticate this particular request
//				.authorizeRequests().antMatchers("/authenticate", "/register").permitAll().
//				// all other requests need to be authenticated
//				anyRequest().authenticated().and().
//				// make sure we use stateless session; session won't be used to
//				// store user's state.
//				exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement()
//				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//		// Add a filter to validate the tokens with every request
//		httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//	}
//
//	@Autowired
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		// configure AuthenticationManager so that it knows from where to load
//		// user for matching credentials
//		// Use BCryptPasswordEncoder
//		auth.userDetailsService(jwtUserDetailsService).passwordEncoder(passwordEncoder());
//	}
//	
//	@Bean
//	@Override
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//} 
