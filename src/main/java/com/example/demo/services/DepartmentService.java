package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Department;

public interface DepartmentService {

	public Department createOneDepartment(Department dep);
	public Department getOneDepartment(long id);
	public List<Department> getAllDepartments();
	public void deleteOneDepartment(long id);
}
