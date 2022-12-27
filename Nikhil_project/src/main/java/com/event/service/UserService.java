package com.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.event.entity.UserDetails;
import com.event.repository.UserDetailsRepository;

@Component
public class UserService {

	
@Autowired
private UserDetailsRepository userDetailsRepository;	
	public void savePage1Details(UserDetails currentuser) {
		System.out.println("Details saved successfully");
		userDetailsRepository.save(currentuser);
	}
	
}
