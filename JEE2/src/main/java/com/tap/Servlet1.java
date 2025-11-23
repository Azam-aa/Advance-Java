package com.tap;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String url = "jdbc:mysql://localhost:3306/jee";
			String uname = "root";
			String passWd = "1234";
			String sql = "INSERT INTO `employee`(`id`,`name`,`email`,`password`,`phonenumber`,`address`) VALUES(?,?,?,?,?,?)";
			
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			String phonenumber = req.getParameter("phonenumber");
			String address = req.getParameter("address");
			
			PrintWriter out =resp.getWriter();
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(url, uname, passWd);
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setInt(1, 2);
				stmt.setString(2,name);
				stmt.setString(3,email);
				stmt.setString(4,password);
				stmt.setString(5,phonenumber);
				stmt.setString(6,address);
				
				int n = stmt.executeUpdate();
				
				if(n==1) {
					out.println("Registration success");
					out.println("YOU HAVE BUILT YOUR FIRST FULL STACK APPLICATION");
				}else {
					out.println("Registration Failure");
				}
				
				
			} catch (Exception e) {
				out.println("Registration Failure");
				e.printStackTrace();
			}
			
		}
}
