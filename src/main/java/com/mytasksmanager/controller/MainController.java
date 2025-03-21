package com.mytasksmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/Hello")
	
	public String sayHello() {

	return "Hello";
	
	}
}
