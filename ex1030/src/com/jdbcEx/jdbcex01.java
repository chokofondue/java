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
			String sql = "insert into student values('test_02', 50, '����',11)";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
			
			int con = stmt.executeUpdate(sql);
			
			if(con > 0) {
				System.out.println("�Ϸ�");
			} else {
				System.out.println("����");
			}
			/*if(conn == null) {
				System.out.println("�������");
			} else {
				System.out.println("���Ἲ��");
			}*/
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("����� ������� �ʾҽ��ϴ�.");
			e.printStackTrace();
		}
		
	}

}
