package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Books;
import com.example.repository.Bookrepo;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping
public class BooksController {
	
	@Autowired
	private Bookrepo repo;
	
	@PostMapping("/saveBook")
	public Books saveBook(@RequestBody Books books) {
		return repo.save(books);
	}

}
