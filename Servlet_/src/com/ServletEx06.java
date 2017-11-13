package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex06")
public class ServletEx06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String a = request.getParameter("num1");
//		String b = request.getParameter("num2");
//		
//		int num1 = Integer.parseInt(a);
//		int num2 = Integer.parseInt(b);
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 =Integer.parseInt(request.getParameter("num2"));
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		
		//응답해줄 형식과 한글 처리
		response.setContentType("text/html charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println(num1+"+"+num2+"="+(num1+num2));
		out.println("</body>");
		out.println("</html>");
	}

}
