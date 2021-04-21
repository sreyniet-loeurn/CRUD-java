package com.javaclass.studentmgt.dto;

public class Student {
	
	
	private int id;
	private String name;
	private String email;
	private String gender;
	private String phonenumber;
	
	
	public Student() {
		
	}


	public Student(int id, String name, String email, String gender, String phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phonenumber = phonenumber;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", phonenumber="
				+ phonenumber + "]";
	}
	
	
	

}
