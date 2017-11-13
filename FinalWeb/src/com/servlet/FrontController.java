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


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String command = uri.substring(context.length());		
		
		System.out.println(uri);
		System.out.println(context);
		System.out.println(command);
		
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		WebDAO webdao = WebDAO.getInstance();
		String moveURL = "";
		try {
			if(command.equals("/Login.do")) {
				WebDTO webdto = webdao.Login(email,pw);
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
			}
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
