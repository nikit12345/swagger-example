package com.example.servicce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Students;
import com.example.repository.StudentsRepo;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Service
public class StudentService {
	
	@Autowired
	private StudentsRepo repo;
	
	
	public Students savestd(@RequestBody Students students) {
		return repo.save(students);
	}
}
