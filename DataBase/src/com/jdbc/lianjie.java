package com.jdbc;

import java.sql.DriverManager;

import java.sql.Statement;

import org.omg.CORBA.PUBLIC_MEMBER;

/*import com.mysql.jdbc.Connection;*/


import java.sql.Connection;

public class lianjie {
	
	public static final String DBDRiVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/test";
	public static final String DBUSER="root";
	public static final String DBPWD="root1";

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName(DBDRiVER);
		
		//建立连接
		Connection conn=DriverManager.getConnection(DBURL, DBUSER, DBPWD);
	/*	Statement st=conn.createStatement();*/
		Statement st= conn.createStatement();
		String sql="delete from stu where id=1;";
		System.out.println("结束！");
		st.executeUpdate(sql);
		st.close();
		conn.close();

	}

}
