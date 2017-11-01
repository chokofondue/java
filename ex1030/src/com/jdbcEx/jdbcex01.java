package com.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcex01 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "system";
			String password = "1111";
			String sql = "insert into student values('test_02', 50, '여자',11)";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
			
			int con = stmt.executeUpdate(sql);
			
			if(con > 0) {
				System.out.println("완료");
			} else {
				System.out.println("실패");
			}
			/*if(conn == null) {
				System.out.println("연결실패");
			} else {
				System.out.println("연결성공");
			}*/
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("제대로 연결되지 않았습니다.");
			e.printStackTrace();
		}
		
	}

}
