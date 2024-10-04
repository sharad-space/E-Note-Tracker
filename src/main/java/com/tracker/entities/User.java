package com.tracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserNotes")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String qualification;
	private String email;
	private String address;
	private String gender;
	private String password;
	
	private String role;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String name, String qualification, String email, String address, String gender,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.role=role;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", qualification=" + qualification + ", email=" + email
				+ ", address=" + address + ", gender=" + gender + ", password=" + password + ", role=" + role + "]";
	}



	
	
	
	
	
	
}
