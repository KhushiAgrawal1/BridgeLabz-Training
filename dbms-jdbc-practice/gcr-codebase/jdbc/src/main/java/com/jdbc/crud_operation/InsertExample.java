package com.jdbc.crud_operation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.establishconnection.DatabaseConnection;

public class InsertDemo {

	public static void insertStudent(String name, String email, int age, String grade) {

		String sql = "INSERT INTO students(name, email, age, grade, enrollment_date) VALUES(?,?,?,?,?)";

		try (Connection conn = DatabaseConnection.getConnection()) {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2, email);
			pstmt.setInt(3, age);
			pstmt.setString(4, grade);
			pstmt.setDate(5, new java.sql.Date(System.currentTimeMillis()));
			
			int rowsAffected=pstmt.executeUpdate();
			System.out.println(rowsAffected+"row(s) inserted successfully!");
		} 
		catch (SQLException e) {
			System.err.println("Insert failed: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		insertStudent("Vikash", "vikash.prajapati2026@gmail.com", 22, "B+");
		insertStudent("Vishal", "yadavvishal9464@gmail.com", 22, "A+");
	}
}