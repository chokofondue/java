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

@WebServlet("/ex14update")
public class ex14update extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String repw = request.getParameter("repw");
		String nickname = request.getParameter("nickname");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id_ = "system";
		String pw_ = "1111";

		String sql = "update user_info set pw = ? , nick = ? where id = ?";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, id_, pw_);
			if (pw.equals(repw)) {
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, pw);
				pst.setString(2, nickname);
				pst.setString(3, id);

				int cnt = pst.executeUpdate();

				if (cnt > 0) {
					System.out.print("수정 되었습니다");
					response.sendRedirect("ex14UpdateTrue.jsp?nickname=" + nickname);

				} else {
					System.out.println("수정되지 않았습니다.");
					response.sendRedirect("ex14UpdateFalse.jsp");
				}
				pst.close();
				conn.close();
			} else {
				System.out.println("수정되지 않았습니다.");
				response.sendRedirect("ex14LoginFalse.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
