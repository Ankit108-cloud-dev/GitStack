package com.cjc.controller;



import com.cjc.modle.User;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@PostMapping
	public String postData(@RequestBody User user) {
		
		
		
		return "Data Added";
	}

	
	@GetMapping
	public List<String> getData(){
		
		
		
		return null;
	}
	

}
