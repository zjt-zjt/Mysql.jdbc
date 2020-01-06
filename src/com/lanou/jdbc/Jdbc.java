package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//加载驱动
      Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/student";
      //连接数据库
      try(  Connection con = DriverManager.getConnection(url, "root", "zjtzjy137381")){
//    	  System.out.println(con);
  		Statement st = con.createStatement();
          String sql = "update stu set age = 20 where num =37";
          st.executeUpdate(sql);
      }
      
	}

}
