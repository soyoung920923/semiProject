package com.example.demo.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.springboot.domain.dto.UserDTO;
import com.example.demo.springboot.service.UserService;

@Controller
public class WelcomeController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@PostMapping(value="/login") 
	public String login(UserDTO user){
		String id = user.getId();
		String pw = user.getPassword();
		UserDTO realUser = userService.findById(id);
		String realPw = realUser.getPassword();
		if (pw.equals(realPw)) {
			
		}
		return ""; 
	}

}
