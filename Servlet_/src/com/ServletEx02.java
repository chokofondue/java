package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletEx02")
public class ServletEx02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String addr = request.getRemoteAddr();
		System.out.println(request.getLocale());
		
		
		if(addr.equals("192.168.0.222")) {
			System.out.println("미소님 환영합니다.");
		}else if(addr.equals("192.168.0.33")) {
			System.out.println("명진쌤 환영합니다.");
		}else {
			System.out.println("손님 환영합니다요");
		}
	}

}
