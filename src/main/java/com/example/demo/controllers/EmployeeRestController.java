package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.models.EmployeeModel;
import com.example.demo.services.DepartmentService;
import com.example.demo.services.EmployeeService;
@RequestMapping(value="/api")
@RestController
@CrossOrigin(value = "*")
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService; 
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	@PostMapping("/employees")
	public Employee createOneEmployee(@RequestBody EmployeeModel emp)
	{
		Employee e= new Employee();
		e.setEmployeeFirstName(emp.getEmployeeFirstName());
		e.setEmployeeLastName(emp.getEmployeeLastName());
		e.setEmployeePhone(emp.getEmployeePhone());
		e.setDepartment(this.departmentService.getOneDepartment(emp.getDepartmentId()));
		return employeeService.createOneEmployee(e);
	}
	@GetMapping("/employees/{id}")
	public Employee getOneEmployee(@PathVariable  long id)
	{
		return employeeService.getOneEmployee(id);
	}
	@DeleteMapping("/employees/{id}")
	public void deleteOneEmployee(@PathVariable  long id)
	{
		employeeService.deleteOneEmployee(id);
	}
}
