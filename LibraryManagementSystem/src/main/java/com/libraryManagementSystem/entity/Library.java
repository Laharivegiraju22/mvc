package com.libraryManagementSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Library {

	@Id
	private int libraryId;
	private String libraryName;
	private String libraryAddress;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<User> users;

	public Library() {
		super();
	}

	public Library(int libraryId, String libraryName, String libraryAddress, List<User> users) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.users = users;
	}

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryAddress() {
		return libraryAddress;
	}

	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", libraryAddress=" + libraryAddress
				+ ", users=" + users + "]";
	}

}
