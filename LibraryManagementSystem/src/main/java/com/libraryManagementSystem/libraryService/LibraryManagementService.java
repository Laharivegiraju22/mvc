package com.libraryManagementSystem.libraryService;

import org.springframework.stereotype.Service;

import com.libraryManagementSystem.entity.Library;

@Service
public interface LibraryManagementService {

	void registerLibrary(Library library);

}
