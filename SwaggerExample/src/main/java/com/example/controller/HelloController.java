package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Students;
import com.example.repository.StudentsRepo;
import com.example.servicce.StudentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping
public class HelloController {
	
	@Autowired
	private StudentService service;
	@GetMapping("gett")
	public String jj() {
		return "zsdasdsa";
	}

	@PostMapping("/save")
	public Students savestd(@RequestBody Students students) {
		return service.savestd(students);
	}
	
		
}
