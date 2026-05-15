package com.example.user_management.service;

import org.springframework.stereotype.Service;

import com.example.user_management.entities.User;
import com.example.user_management.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public User createUser(User user) {
		if(userRepository.findByEmail(user.getEmail()).isPresent()) {
			throw new RuntimeException("User already registered, please login");
		}
		
		return userRepository.save(user);
	}
	
	public User getUserById(Long id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("User not found"));
	}
}
