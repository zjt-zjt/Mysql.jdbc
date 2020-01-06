package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatement1 {
      //PreparedStatement的增删添加
	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.jdbc.Driver");
//		String url = "jdbc:mysql://localhost:3306/student ";
//		String sql = "insert into stu values(?,?,?,?,?,?,?)";
//		try( Connection con = DriverManager.getConnection(url,"root","zjtzjy137381");
//				PreparedStatement ps = con.prepareStatement(sql);){
//			
//			
//			ps.setInt(1, 30);
//			ps.setInt(2, 52);
//			ps.setString(3, "张三");
//			ps.setString(4, "男");
//			ps.setInt(5, 25);
//			ps.setString(6, "信号与系统");
//			ps.setString(7, "12345678911");
//			ps.executeUpdate();
//			
//		}
//		
        
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/student?useSSL=false";
		String sql = "update stu set name =? ,sex=?,number=? where num=? ";
		try( Connection con = DriverManager.getConnection(url,"root","zjtzjy137381");
				PreparedStatement ps = con.prepareStatement(sql);){
			 ps.setString(1, "张俊涛");
			 ps.setString(2, "男");
			 ps.setString(3, "13037673132");
			 ps.setInt(4, 37);
			 ps.executeUpdate();
			
		
		}	
	}

}
