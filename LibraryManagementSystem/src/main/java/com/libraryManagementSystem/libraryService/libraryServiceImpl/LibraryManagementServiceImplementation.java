package com.libraryManagementSystem.libraryService.libraryServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagementSystem.entity.Library;
import com.libraryManagementSystem.libraryService.LibraryManagementService;
import com.libraryManagementSystem.libraryrepository.LibraryRepository;

@Service
public class LibraryManagementServiceImplementation implements LibraryManagementService{
    
	@Autowired
	LibraryRepository libraryRepository;
	@Override
	public void registerLibrary(Library library) {
		libraryRepository.save(library);
	}

}
