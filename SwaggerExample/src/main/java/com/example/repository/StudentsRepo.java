package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Students;

@Repository
public interface StudentsRepo extends JpaRepository<Students, Long>{

}
