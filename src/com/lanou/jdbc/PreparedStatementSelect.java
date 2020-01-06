package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

public class PreparedStatementSelect {

	public static void main(String[] args) throws Exception {
		 Class.forName("com.mysql.jdbc.Driver");
         String url = "jdbc:mysql://localhost:3306/student?useSSL=false";
         String sql = "select*from stu where num=?";
         try(Connection con = DriverManager.getConnection(url, "root", "zjtzjy137381");
             PreparedStatement ps = con.prepareStatement(sql);){
        	 ps.setObject(1, 37);
        	 
        	 ResultSet rs = ps.executeQuery();
        	 
        	 while(rs.next()) {
        		 int snum = rs.getInt("num");
             String sname = rs.getString("name");
        		 String ssex = rs.getString("sex");
        		 int sage = rs.getInt("age");
        		 
        		 String smajor = rs.getString("professional");
        		 String sphone = rs.getString("number");
        		 Student student = new Student(snum, sname, ssex, sage, smajor, sphone);
        		 System.out.println(student);
        	 }
         }
         
	}

}
