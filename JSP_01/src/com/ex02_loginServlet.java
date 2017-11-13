package com;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ex02_loginServlet")
public class ex02_loginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		//String nick = req.getParameter("nick");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id_ = "system";
		String pw_ = "1111";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url, id_, pw_);

			PreparedStatement pst = conn.prepareStatement("select * from user_info where id = ?");
			
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();	
			
			System.out.println(id);
			System.out.println(pw);
			if(rs.next()){
				if(id.equals(rs.getString(1)) && pw.equals(rs.getString(2))) {
					//쿠키
					/*Cookie cookie = new Cookie("nick",URLEncoder.encode(rs.getString(3),"euc-kr"));
					cookie.setMaxAge(600);
					resp.addCookie(cookie);*/
					
					//세션	--> 서블릿에서는 직접 생성
					HttpSession session = req.getSession();
					session.setAttribute("nick",rs.getString(3));
					System.out.println("123");
					resp.sendRedirect("ex02_Main.jsp?nickname=?"+rs.getString(3));
				} else {
					System.out.println("error");
					resp.sendRedirect("ex02_Main.jsp");
				}
			}
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		

		//DB접속 로그인 판별
		
		//response
		//request
		//로그인 성공(쿠키가 있을시 로그인성공 여부를 알수있음)
		
		
	}
	

}
