package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDAO {
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String id = "system";
	private String pw = "1111";

	private Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	BookDTO dto = null;
	
	private String sql = null;
	
	public BookDTO select_BookAll(int possible) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
		
		sql = "select * from book_info where possible = ?";
		pst = conn.prepareStatement(sql);
		pst.setInt(0, possible);
		
		rs = pst.executeQuery();
		if (rs.next()) {
			dto = new BookDTO(rs.getInt(0), 
					rs.getString(1), 
					rs.getString(2), 
					rs.getString(3), 
					rs.getInt(4));
		} else {

		}
		conn.close();
		pst.close();
		rs.close();
		return dto;
	}
}
