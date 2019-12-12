package com.mindtree.employeemanagementsystem.service.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employeemanagementsystem.dto.DepartmentDto;
import com.mindtree.employeemanagementsystem.dto.EmployeeDto;
import com.mindtree.employeemanagementsystem.entity.*;
import com.mindtree.employeemanagementsystem.exceptions.serviceException.EmployeeManagementServiceException;
import com.mindtree.employeemanagementsystem.exceptions.serviceException.NoEmployeeWithThatCtcException;
import com.mindtree.employeemanagementsystem.repository.DepartmentRepository;
import com.mindtree.employeemanagementsystem.repository.EmployeeRepository;
import com.mindtree.employeemanagementsystem.service.EmployeeManagementService;

@Service
public class EmployeeManagementServiceImplementation implements EmployeeManagementService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public void addDepartment(Department department) {

		Department newDept = department;
		newDept.getEmployees().forEach(e -> e.setDepartment(department));
		newDept.getEmployees().forEach(e -> e.setSalary(e.getExperience() * 200000));
		departmentRepository.save(newDept);

	}

	@Override
	public List<DepartmentDto> getAllDepartments() throws EmployeeManagementServiceException {
		List<DepartmentDto> departmentDto = new ArrayList<DepartmentDto>();
		double ctc = 0;
		// List<Department> depts = new ArrayList<Department>();
		// depts=departmentRepository.findAll();
		for (Department dep : departmentRepository.findAll()) {
			DepartmentDto depdto = new DepartmentDto();
			depdto.setDepartmentId(dep.getDepartmentId());
			depdto.setDepartmentName(dep.getDepartmentName());
			List<EmployeeDto> employeeDtos = new ArrayList<EmployeeDto>();

			for (Employee e : dep.getEmployees()) {
				{
					EmployeeDto empDto = new EmployeeDto();
					empDto.setEmployeeId(e.getEmployeeId());
					empDto.setEmployeeName(e.getEmployeeName());
					empDto.setExperience(e.getExperience());
					empDto.setSalary(e.getSalary());

					employeeDtos.add(empDto);
					ctc+= empDto.getSalary();

				}
			}
			depdto.setEmployeeDtos(employeeDtos);
			if (ctc > 5000000) {
				departmentDto.add(depdto);
			}
		}
		if (departmentDto.isEmpty()) {
			throw new NoEmployeeWithThatCtcException("there is no employee with that ctc");
		}
		return departmentDto;
	}

}
