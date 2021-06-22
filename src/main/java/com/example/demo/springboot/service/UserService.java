package com.example.demo.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.springboot.domain.dto.UserDTO;
import com.example.demo.springboot.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<UserDTO> findAll() { 
		List<UserDTO> users = new ArrayList<>(); 
		userRepository.findAll().forEach(e -> users.add(e)); 
		return users; 
	} 
	
	public UserDTO findById(String id) { 
		UserDTO user = userRepository.findById(id); 
		return user; 
	} 
	
	
	public UserDTO save(UserDTO user) {
		userRepository.save(user); 
		return user; 
	} 
	
	
}
