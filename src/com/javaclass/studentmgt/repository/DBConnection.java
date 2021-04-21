package com.javaclass.studentmgt.repository;

import java.sql.*;


public class DBConnection {
	
	public static Connection cnn;
	
	public static Connection initDB() {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cnn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student_db",

					"root",
					""
			);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return cnn;
		
	}
	

}
