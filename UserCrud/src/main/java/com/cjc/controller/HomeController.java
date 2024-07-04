package com.cjc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.modle.User;

@RestController
public class HomeController {
	
	@PostMapping
	public String postData(@RequestBody User user) {
		
		
		
		return "Data Added";
	}


}
