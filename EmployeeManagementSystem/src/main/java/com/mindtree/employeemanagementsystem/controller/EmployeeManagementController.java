package com.mindtree.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.employeemanagementsystem.dto.DepartmentDto;
import com.mindtree.employeemanagementsystem.entity.Department;
import com.mindtree.employeemanagementsystem.exceptions.serviceException.EmployeeManagementServiceException;
import com.mindtree.employeemanagementsystem.service.EmployeeManagementService;

@RestController
public class EmployeeManagementController {

	@Autowired
	EmployeeManagementService employeeServiceimpl;

	@RequestMapping("/addDepartment")
	public String addDepartment(@RequestBody Department department) {
		employeeServiceimpl.addDepartment(department);
		return "department added successfully....";
	}

	@RequestMapping("/getAllDepartments")
	public ResponseEntity<List<DepartmentDto>> getAllDepartments() throws EmployeeManagementServiceException {

		List<DepartmentDto> dDto = employeeServiceimpl.getAllDepartments();
		return (ResponseEntity<List<DepartmentDto>>) dDto;

	}

}
