package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		

	}
      //Statement的查找
	public static void select() throws Exception {
		Class.forName("com.mysql.jdbs.Driver");
		String url = "jdbc:mysql://localhost:3306/student";
		Connection con = DriverManager.getConnection(url, "root", "zjtzjy137381");
		Statement st = con.createStatement();
		 
		
		
	}
	
	
}
