package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


//单捞磐 贸府
public class WebDAO {
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String id_ = "system";
	private String pw_ = "1111";

	private String sql = "";
	private int cnt = 0;

	private Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private WebDTO webdto = null;	
	
	//教臂沛
	private static WebDAO webdao = new WebDAO();
	
	public static WebDAO getInstance() {
		return webdao;
	}
	
	private void getconn() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id_, pw_);
	}	
	public void close() throws Exception{
		if(rs !=null) rs.close();
		if(pst != null) pst.close();
		if(conn != null) conn.close();
	}
	public int Join(String email, String pw, String tel, String address) throws Exception {
		sql = "insert into web_member values(?,?,?,?)";
		
		getconn();

		pst = conn.prepareStatement(sql);
		pst.setString(1, email);
		pst.setString(2, pw);
		pst.setString(3, tel);
		pst.setString(4, address);
		
		cnt = pst.executeUpdate();
		
		close();

		return cnt;
	}

	
	public WebDTO Login(String email, String pw) throws Exception {
		sql = "select * from web_member where email = ?";
		
		getconn();
		
		pst = conn.prepareStatement(sql);
		pst.setString(1, email);

		rs = pst.executeQuery();
		if (rs.next()) {
			webdto = new WebDTO(rs.getString(1), rs.getString(2));
		} else {

		}

		close();
		return webdto;
	}
	public WebDTO Select(String email) throws Exception{

		getconn();
		
		sql = "select * from web_member where email = ?";
		pst = conn.prepareStatement(sql);
		pst.setString(1, email);
		
		rs = pst.executeQuery();
		if (rs.next()) {
			webdto = new WebDTO(rs.getString(1), rs.getString(3), rs.getString(4));
		} else {

		}
		close();
		return webdto;
		
	}
	
	public int Update(String email, String pw, String tel, String address)throws Exception {
		getconn();
		
		sql = "update web_member set pw = ? , tel = ?, address = ? where email = ?";
		
		pst = conn.prepareStatement(sql);
		pst.setString(1, pw);
		pst.setString(2, tel);
		pst.setString(3, address);
		pst.setString(4, email);
		
		cnt = pst.executeUpdate();
		
		close();
		
		return cnt;
	}
	
	public int Message(String send_email, String receive_email, String content) throws Exception {
		sql = "insert into web_message values(num.NEXTVAL,?,?,?,sysdate)";
		
		getconn();

		pst = conn.prepareStatement(sql);
		pst.setString(1, send_email);
		pst.setString(2, receive_email);
		pst.setString(3, content);
		
		cnt = pst.executeUpdate();
		
		close();

		return cnt;
	}
	public ArrayList<WebDTO> MessageSelect(String email) throws Exception{
		sql = "select * from web_message where receive_email = ?";
		ArrayList<WebDTO> list = new ArrayList<WebDTO>();
		getconn();
	
		pst = conn.prepareStatement(sql);
		pst.setString(1,email);
		
		rs = pst.executeQuery();		 
		
		while (rs.next()) {			
			list.add(new WebDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
		}
		
		close();
		return list;
	}
	public int Delect(String email) throws Exception{
		sql = "delete from web_message where receive_email = ?";
		getconn();
		pst = conn.prepareStatement(sql);
		
		pst.setString(1, email);
		
		cnt = pst.executeUpdate();
		close();
		return cnt;
	}	
	public int SelectDelect(String num) throws Exception{
		sql = "delete from web_message where num = ?";
		getconn();
		pst = conn.prepareStatement(sql);
		pst.setString(1, num);
		
		cnt = pst.executeUpdate();
		close();
		return cnt;
	}
}
