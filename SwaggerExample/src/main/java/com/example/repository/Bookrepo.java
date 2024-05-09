package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Books;

@Repository
public interface Bookrepo extends JpaRepository<Books, Long>{

}
