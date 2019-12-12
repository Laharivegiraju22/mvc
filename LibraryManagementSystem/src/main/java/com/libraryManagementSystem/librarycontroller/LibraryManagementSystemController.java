package com.libraryManagementSystem.librarycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libraryManagementSystem.entity.Library;
import com.libraryManagementSystem.libraryService.LibraryManagementService;
import com.libraryManagementSystem.libraryService.libraryServiceImpl.LibraryManagementServiceImplementation;

@RestController
public class LibraryManagementSystemController {
	
	@Autowired
	LibraryManagementService libraryimpl;

	@RequestMapping("/registerUser")
	public String registerLibrary(@RequestBody Library library) {
		libraryimpl.registerLibrary(library);
		return "added successfully";
	}
}
