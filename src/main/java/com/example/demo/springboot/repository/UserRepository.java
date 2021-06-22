package com.example.demo.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.springboot.domain.dto.UserDTO;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long> {
	
	// findBy뒤에 컬럼명을 붙여주면 이를 이용한 검색이 가능하다
	public UserDTO findById(String id);
	public List<UserDTO> findByName(String name); 

	//like검색도 가능 
	public List<UserDTO> findByIdLike(String keyword);

}
