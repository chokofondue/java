package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Table")
public class Ex06Table extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a = Integer.parseInt(request.getParameter("a"));
		int gugu = Integer.parseInt(request.getParameter("gugu"));
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border = '1'>");
		out.print("<tr>");
		
		for(int i = 1 ; i<=a; i++) {
			out.print("<td>"+i+"</td>");
		}
		out.print("</tr>");
		out.print("</table>");
		out.print("<br>");
		out.print("<table border = '1'>");
		
		for(int i = 1 ; i<=9; i++) {
			out.print("<tr>"+"<td>"+gugu+"*"+i+"="+(gugu*i)+"</td>"+"</tr>");

		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
