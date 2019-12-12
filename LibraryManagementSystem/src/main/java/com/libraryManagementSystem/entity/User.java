package com.libraryManagementSystem.entity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {

	@Id
	private int userId;
	private String userName;
	private String address;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "users")
	List<Library> libraries;

	public User() {
		super();
	}

	public User(int userId, String userName, String address, List<Library> libraries) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.libraries = libraries;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Library> getLibraries() {
		return libraries;
	}

	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", libraries=" + libraries
				+ "]";
	}

}
