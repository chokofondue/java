package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex01")
public class ServletEx01 extends HttpServlet {
	/*
@는 어노테이션이라고 한다. 서블릿클래스명이 주소창에 노출되지 않도록 해킹방지를 위해 별칭을 달아주는 것.
*/	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request : 클라이언트가 요청한 정보들을 담고 있는 객체;ㅣ
		
		String client_addr = request.getRemoteAddr();
		String client_name = request.getRemoteHost();
		int client_port = request.getRemotePort();
		
		System.out.println();
		
		
		/*System.out.println("클라이언트주소 : "+client_addr);
		System.out.println("클라이언트 호스트명 : "+client_name);
		System.out.println("클라이언트 포트 : "+client_port);
		*/
	
	
	
	}

}
