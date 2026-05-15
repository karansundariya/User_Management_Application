package com.example.user_management.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public ResponseEntity<String> homePage(){
		return ResponseEntity.ok("Welcome to the User Management Application");
	}
}
