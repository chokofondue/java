package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ex10_JSTL_LoginServlet")
public class ex10_JSTL_LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//DB check
			
		
		//DAO »£√‚
		boolean isSuccess = true;
			
		if(isSuccess) {
			HttpSession session = request.getSession();
			session.setAttribute("login", "login_success");
		}
		response.sendRedirect("ex10_JSTL_LoginResult.jsp");
	}
}
