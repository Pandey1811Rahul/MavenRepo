package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")
public class Controller {
	
	@RequestMapping("/save")
	public String save() {
		System.out.println("Finally get success");
		return "Now Access Denied Error Resolved";
		
		
	}

}
