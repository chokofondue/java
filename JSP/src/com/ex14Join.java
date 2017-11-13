package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex14")
public class ex14Join extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user ="system";
		String pass = "1111";
		String sql = "insert into member values(?,?,?)";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn =DriverManager.getConnection(url, user, pass);
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.setString(3, nick);
			
			int cnt = pst.executeUpdate();
				if(cnt > 0) {
					System.out.println("입력성공");
				}else {
					System.out.println("입력실패");
				}
				pst.close();
				conn.close();
			
		}catch(Exception e){
				e.printStackTrace();
			}
	
	
	
	}
	
	

}
