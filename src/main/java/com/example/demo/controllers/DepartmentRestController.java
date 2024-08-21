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

import com.example.demo.entities.Department;
import com.example.demo.models.DepartmentModel;
import com.example.demo.services.DepartmentService;

@RequestMapping(value="/api")
@RestController
@CrossOrigin
public class DepartmentRestController {

	@Autowired
	DepartmentService departmentService; 
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments()
	{
		return departmentService.getAllDepartments();
	}
	@PostMapping("/departments")
	public Department createOneDepartment(@RequestBody DepartmentModel dep)
	{
		Department d= new Department();
		d.setDepartmentName(dep.getDepartmentName());
		return departmentService.createOneDepartment(d);
	}
	@GetMapping("/departments/{id}")
	public Department getOneDepartment(@PathVariable  long id)
	{
		return departmentService.getOneDepartment(id);
	}
	@DeleteMapping("/departments/{id}")
	public void deleteOneDepartment(@PathVariable  long id)
	{
		departmentService.deleteOneDepartment(id);
	}
}
