package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Department;

import jakarta.transaction.Transactional;
@Transactional
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
