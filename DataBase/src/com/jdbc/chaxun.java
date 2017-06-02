package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sun.org.apache.regexp.internal.recompile;

public class chaxun {

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		// 动态导入
		Class.forName("com.mysql.jdbc.Driver");
		// 获取数据库链接
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root1");
		st = conn.createStatement();
		String sql="select * from stu";
		rs = st.executeQuery(sql);
		while (true) {
			// 移动到吓一跳数据
			boolean b = rs.next();
			// 检查下一条数据是否存在
			if (false == b) {
				// 如果下一条数据不存在，就不用遍历了！
				break;

			}
			// 取得用户名
			String userName = rs.getString("name");
			// 取得密码(字段的编号从1开始，密码排第二位)
			String userPwd = rs.getString(2);
			System.out.println(userName + ":" + userPwd);
		}
		st.close();
		rs.close();

	}

}
