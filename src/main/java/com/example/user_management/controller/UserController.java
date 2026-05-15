package com.example.user_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user_management.entities.User;
import com.example.user_management.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id){
		return ResponseEntity.ok(userService.getUserById(id));
	}
}
