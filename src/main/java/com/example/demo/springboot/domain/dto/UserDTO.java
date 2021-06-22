package com.example.demo.springboot.domain.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="test_springboot_user")
public class UserDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long index;
	
	private String name;
	private String id;
	private String password;
	
	@Builder
	public UserDTO(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
}
