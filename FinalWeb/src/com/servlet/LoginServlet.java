package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.WebDAO;
import com.model.WebDTO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");

		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		WebDAO webdao = WebDAO.getInstance();
		WebDTO webdto = null;
		
		String moveURL = "";
		try  {
			webdto = webdao.Login(email,pw);
			if (email.equals(webdto.getEmail()) && pw.equals(webdto.getPw())) {
				HttpSession session = request.getSession();
				session.setAttribute("email", webdto.getEmail());
				
				System.out.println(1234);
				// response.sendRedirect("main.jsp?email="+rs.getString(1));
				moveURL = "main.jsp";
			} else {
				System.out.println(12345);
				moveURL = "main.jsp";
			}
			response.sendRedirect(moveURL);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
