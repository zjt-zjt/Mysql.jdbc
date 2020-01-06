package com.lanou.jdbc;

import java.util.List;

public class Test {

	public static void main(String[] args) throws Exception {
//		String sql = "insert into teacher (tno,tname,tsex)values(?,?,?)";
//         jdbcUtils.UpDate(sql, 870,"张三","男");
//        String sql  = "update teacher set tname = ?,tsex=?where tno=?";
//        jdbcUtils.UpDate(sql,"李四","女",870);
//         String sql = "delete from teacher where tno =?";
//		jdbcUtils.UpDate(sql,860);
		
		String sql= "select num snum,name sname,sex ssex,age sage ,number sphone, professional smajor from stu";
		List<Student> list = jdbcUtils.query(sql, Student.class);
		for(Student s:list) {
			System.out.println(s);
		}
		
		
	}

}
