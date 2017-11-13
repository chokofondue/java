package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletEx08")
public class ServletEx08 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	int a = Integer.parseInt(request.getParameter("a"));
	
	System.out.println("�Է��� ���ڴ� "+a+"�Դϴ�.");
	
	response.setContentType("text/html; charset= euc-kr");
	
	PrintWriter out = response.getWriter();
	out.print("<html>");
	out.print("<body>");
	out.print("�Է��� ���ڴ� "+a+"�Դϴ�.");
	out.print("</body>");
	out.print("</html>");
	}

}
