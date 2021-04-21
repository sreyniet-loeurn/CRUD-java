package com.javaclass.studentmgt.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.javaclass.studentmgt.dto.Student;
import com.javaclass.studentmgt.repository.DBConnection;
import com.javaclass.studentmgt.repository.StudentRepository;

public class StudentRepositoryImpl implements StudentRepository{

	private Connection cnn;
	private String sql;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public StudentRepositoryImpl() {
		cnn = DBConnection.initDB();
	}
	
	
	@Override
	public boolean insert(Student student) {
		sql = "INSERT INTO student (name, gender, email, phonenumber) values (?,?,?,?)";
		
		try {
			pstmt = cnn.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getGender());
			pstmt.setString(3, student.getEmail());
			pstmt.setString(4, student.getPhonenumber());
			if(pstmt.executeUpdate() != 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	@Override
	public ArrayList<Student> findAll() {
		sql = "SELECT * FROM student";
		ArrayList<Student> students = new ArrayList<>();
		Student student = null;
		try {
			
			pstmt = cnn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				
				students.add(
						new Student(
								rs.getInt("id"),
								rs.getString("name"),
								rs.getString("email"),
								rs.getString("gender"),
								rs.getString("phonenumber")
								)
							
						);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return students;
	}

	@Override
	public boolean update(Student student) {
		try{
			String queryStr = "UPDATE student SET phonenumber=?, gender=? WHERE gender=?";

			// TODO: Using PreparedStatement
			PreparedStatement pstmt = cnn.prepareStatement(queryStr);
			pstmt.setString(1, "99998888");
			pstmt.setString(2, "M");
			pstmt.setString(3, "F");


			int count = pstmt.executeUpdate();
			if(count != 0) {
				System.out.println("Update Success");
			}else {
				System.out.println("Update Fail");
			}
//			cnn.close();
			pstmt.close();


		}catch(Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteById(int id) {
		try{
			String queryStr = "DELETE FROM student WHERE id=?";
			PreparedStatement pstmt = cnn.prepareStatement(queryStr);
			pstmt.setInt(1, id);

			int count = pstmt.executeUpdate();
			if(count != 0) {
				System.out.println("Delete Success");
			}else {
				System.out.println("Delete Fail");
			}

//			cnn.close();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Student findById(int id) {
		try {

			String queryStr = "SELECT * FROM student WHERE id=?";

			PreparedStatement pstmt = cnn.prepareStatement(queryStr);
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {

				System.out.print("ID: " + rs.getInt(1));
				System.out.print(", Name: " + rs.getString(2));
				System.out.print(", Gender: " + rs.getString("gender"));
				System.out.print(", Email: " + rs.getString("email"));
				System.out.println(", PhoneNumber: " + rs.getString("phonenumber"));

			}
			cnn.close();
			pstmt.close();
			rs.close();


		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
