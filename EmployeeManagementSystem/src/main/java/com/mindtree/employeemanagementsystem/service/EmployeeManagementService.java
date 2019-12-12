package com.mindtree.employeemanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.employeemanagementsystem.dto.DepartmentDto;
import com.mindtree.employeemanagementsystem.entity.Department;
import com.mindtree.employeemanagementsystem.exceptions.serviceException.EmployeeManagementServiceException;

@Service
public interface EmployeeManagementService {

	void addDepartment(Department department);

	List<DepartmentDto> getAllDepartments() throws EmployeeManagementServiceException;

}
