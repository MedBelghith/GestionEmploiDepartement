package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Employee;

public interface EmployeeService {

	public Employee createOneEmployee(Employee emp);
	public Employee getOneEmployee(long id);
	public List<Employee> getAllEmployees();
	public void deleteOneEmployee(long id);
}
