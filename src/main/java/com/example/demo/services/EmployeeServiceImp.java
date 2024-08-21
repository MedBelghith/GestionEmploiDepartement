package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;
@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository; 
	@Override
	public Employee createOneEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}

	@Override
	public Employee getOneEmployee(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public void deleteOneEmployee(long id) {
		// TODO Auto-generated method stub
		if (employeeRepository.findById(id)!=null)
			employeeRepository.deleteById(id);
	}

}
