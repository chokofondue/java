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
@�� ������̼��̶�� �Ѵ�. ����Ŭ�������� �ּ�â�� ������� �ʵ��� ��ŷ������ ���� ��Ī�� �޾��ִ� ��.
*/	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request : Ŭ���̾�Ʈ�� ��û�� �������� ��� �ִ� ��ü;��
		
		String client_addr = request.getRemoteAddr();
		String client_name = request.getRemoteHost();
		int client_port = request.getRemotePort();
		
		System.out.println();
		
		
		/*System.out.println("Ŭ���̾�Ʈ�ּ� : "+client_addr);
		System.out.println("Ŭ���̾�Ʈ ȣ��Ʈ�� : "+client_name);
		System.out.println("Ŭ���̾�Ʈ ��Ʈ : "+client_port);
		*/
	
	
	
	}

}
