package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.entity.UserDetails;
import com.event.service.UserService;

@RestController
@CrossOrigin(origins="*")
public class AppController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/mainPage")
	public String page1(@RequestBody UserDetails page1)
	{
		System.out.println("Details Saved successfully");
		userService.savePage1Details(page1);
		return "Details Saved successfully";
		
	}
	
}
