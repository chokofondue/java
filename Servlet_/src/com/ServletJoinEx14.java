package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex14")
public class ServletJoinEx14 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String choice = request.getParameter("choice");
		String gender = request.getParameter("gender");
		
		//üũ�� üũ�ڽ� ������ ���ڿ� �迭���·� �������� �޼ҵ�
		String[] hobby = request.getParameterValues("hobby");
		
		System.out.println(choice);
		System.out.println(gender);
		for(int i = 0; i<hobby.length; i++) {
		System.out.println(hobby[i]);
		
		
		}
	}

}
