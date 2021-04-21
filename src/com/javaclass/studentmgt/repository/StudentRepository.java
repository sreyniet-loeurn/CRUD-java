package com.javaclass.studentmgt.repository;

import java.util.ArrayList;

import com.javaclass.studentmgt.dto.Student;

public interface StudentRepository {
	
	
	boolean insert(Student student);
	ArrayList<Student> findAll();

	/** HOMEWORK **/
	boolean update(Student student);
	/** HOMEWORK **/
	boolean deleteById(int id);
	/** HOMEWORK **/
	Student findById(int id);
	
	

}
