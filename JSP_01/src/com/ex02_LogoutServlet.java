package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ex02_LogoutServlet")
public class ex02_LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//쿠키
		/*Cookie cookie = new Cookie("nick","테스트");
		cookie.setMaxAge(0);
		response.addCookie(cookie);*/
		
		//세션
		HttpSession session = request.getSession();
		//세션 즉시 만료
		session.invalidate();
		
		response.sendRedirect("ex02_Main.jsp");
	}
}
