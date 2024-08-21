package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Department;
import com.example.demo.repositories.DepartmentRepository;
@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	public Department createOneDepartment(Department dep) {
		// TODO Auto-generated method stub
		return departmentRepository.save(dep);
	}

	@Override
	public Department getOneDepartment(long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id).get();
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public void deleteOneDepartment(long id) {
		// TODO Auto-generated method stub
		if (departmentRepository.findById(id)!=null)
			departmentRepository.deleteById(id);
	}

}
