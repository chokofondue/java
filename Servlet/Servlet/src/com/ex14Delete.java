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


@WebServlet("/ex14Delete")
public class ex14Delete extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");


		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id_ = "system";
		String pw_ = "1111";

		String moveURL = "";
		String select = "select * from user_info where id = ?";
		String delete = "delete from user_info where id = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, id_, pw_);
	
				PreparedStatement pst = conn.prepareStatement(select);
				pst.setString(1, id);
				ResultSet rs = pst.executeQuery();
				
				if(rs.next()) {
					if(pw.equals(rs.getString(2))) {
						pst = conn.prepareStatement(delete);
						pst.setString(1, id);
						
						int cnt = pst.executeUpdate();
						if (cnt > 0) {
							System.out.print("수정 되었습니다");
							moveURL = "ex14DeleteTrue.jsp";

						} else {
							System.out.println("수정되지 않았습니다.");
							moveURL = "ex14DeleteFalse.jsp";
							
						}
					} else {
						moveURL = "ex14DeleteFalse.jsp";
					}
				} else {
					moveURL = "ex14DeleteFalse.jsp";
				}

				response.sendRedirect(moveURL);
				
				pst.close();
				conn.close();
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
