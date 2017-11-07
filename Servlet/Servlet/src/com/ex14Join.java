package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex14Join")
public class ex14Join extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nickname = request.getParameter("nickname");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id_ = "system";
		String pw_ = "1111";
		
		String sql = "insert into user_info values(?,?,?)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, id_, pw_);

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.setString(3, nickname);
			
			int cnt = pst.executeUpdate();

			if(cnt>0) {
				System.out.print("저장 되었습니다");
			} else {
				System.out.println("저장되지 않았습니다.");
			}
			
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
