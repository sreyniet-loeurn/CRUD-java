package com.javaclass.studentmgt.controller;

import java.util.ArrayList;

import com.javaclass.studentmgt.dto.Student;
import com.javaclass.studentmgt.repository.StudentRepository;
import com.javaclass.studentmgt.repository.impl.StudentRepositoryImpl;


public class StudentController {
	
	public static void main(String args[]) {
		
		StudentRepository studentRepo = new StudentRepositoryImpl();


		Student student = new Student(0, "naa", "kaka@gmail.com", "F","123456789");


		if(studentRepo.insert(student)) {
			System.out.println("INSERT Success!");
		}
		else {
			System.out.println("INSERT Fail!");
		}

		ArrayList<Student> students = studentRepo.findAll();
		for(Student s : students) {
			System.out.println(s.toString());
		}

		// Delete student by Id
		studentRepo.deleteById(9);

		// Update student
		studentRepo.update(student);

		// Find student by Id
		studentRepo.findById(5);
	}

}
