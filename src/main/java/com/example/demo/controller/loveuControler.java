package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loveuControler {
	
	@GetMapping("/")
	public String getMessage() {
		return "I Love YOU";
	}

}
