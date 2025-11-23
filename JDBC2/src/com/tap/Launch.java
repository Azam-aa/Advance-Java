package com.tap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;  


public class Launch {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "1234"; 
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet = null;
		String query = "SELECT * FROM `employee` WHERE `department`=?";
		Scanner scan = new Scanner(System.in);
		
//		String query = "UPDATE employee SET salary = salary+10000 WHERE department='IT'";

//		String query = "INSERT INTO employee(id,name,email,department,salary) "
//				+ "VALUES(6, 'vishnu', 'vishnu@gmail.com','Finance=', 25000) ";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			connection= DriverManager.getConnection(url,username,password);
			System.out.println("Conncetion Success");
			
			statement=connection.prepareStatement(query);
			System.out.println("Which department emplyee you need");
			String dept = scan.next();
			statement.setString(1,dept);
			resultSet=statement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name")+" "+resultSet.getString("email")
		    	+" "+resultSet.getString("department")+" "+resultSet.getInt("salary"));	
			}

//		    statement = connection.createStatement();
//		    int n = statement.executeUpdate(query);
//		    
//		    resultSet = statement.executeQuery(query);
//		    while(resultSet.next()) {
//		    	System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name")+" "+resultSet.getString("email")
//		    	+" "+resultSet.getString("department")
//		    +" "+resultSet.getInt("salary"));	    
//		    }	
		    
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
