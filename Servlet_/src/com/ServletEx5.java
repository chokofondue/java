package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex05")
public class ServletEx5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String data = request.getParameter("data");
		
		//wrapper 클래스 : 기본자료형을 객체형으로 변환해주는 클래스, 대문자사용
		/*정수형 : Short , Integer, Long
		 실수형 : Float, Double
		 논리형 : Boolean*/
		
		//Integer .partInt(문자열) : 문자열을 정수형으로 변환시켜주는 메소드.
		int num = Integer.parseInt(data);
		
		System.out.println("넘어온 데이터 "+(num+5));
		
	}

}
