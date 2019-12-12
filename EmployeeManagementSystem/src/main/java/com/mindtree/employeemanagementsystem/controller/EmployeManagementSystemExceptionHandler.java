package com.mindtree.employeemanagementsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.employeemanagementsystem.dto.ErrorDTO;
import com.mindtree.employeemanagementsystem.exceptions.serviceException.EmployeeManagementServiceException;
import com.mindtree.employeemanagementsystem.exceptions.serviceException.NoEmployeeWithThatCtcException;

@RestControllerAdvice
public class EmployeManagementSystemExceptionHandler {
	@ExceptionHandler(NoEmployeeWithThatCtcException.class)
	public ResponseEntity<ErrorDTO> NoEmployeeExceptionHandler(NoEmployeeWithThatCtcException e, Throwable cause) {
		return new ResponseEntity<ErrorDTO>(new ErrorDTO(e.getMessage()), HttpStatus.NOT_FOUND);
	}
}
