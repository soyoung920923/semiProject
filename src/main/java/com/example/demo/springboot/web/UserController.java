package com.example.demo.springboot.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.springboot.domain.dto.UserDTO;
import com.example.demo.springboot.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/join")
	public String join() {
		return "join";
	}
	
	// 회원가입 
	@PostMapping(value="/saveUser") 
	public ResponseEntity<UserDTO> save(UserDTO user){
		return new ResponseEntity<UserDTO>(userService.save(user), HttpStatus.OK); 
	}


}
