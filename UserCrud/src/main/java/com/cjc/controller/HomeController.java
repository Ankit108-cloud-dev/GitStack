package com.cjc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping
	public List<String> getData(){
		
		
		
		return null;
	}
	

}
