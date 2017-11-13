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
		
		//wrapper Ŭ���� : �⺻�ڷ����� ��ü������ ��ȯ���ִ� Ŭ����, �빮�ڻ��
		/*������ : Short , Integer, Long
		 �Ǽ��� : Float, Double
		 ���� : Boolean*/
		
		//Integer .partInt(���ڿ�) : ���ڿ��� ���������� ��ȯ�����ִ� �޼ҵ�.
		int num = Integer.parseInt(data);
		
		System.out.println("�Ѿ�� ������ "+(num+5));
		
	}

}
