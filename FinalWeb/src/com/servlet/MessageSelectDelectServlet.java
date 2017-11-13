package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.WebDAO;


@WebServlet("/MessageSelectDelectServlet")
public class MessageSelectDelectServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num =request.getParameter("num");

		WebDAO webdao = WebDAO.getInstance();

		String moveURL = "";
		
		try {
			if (webdao.SelectDelect(num)> 0) {
				System.out.print("���� �Ǿ����ϴ�");
				moveURL = "main.jsp";
			} else {
				System.out.println("�������� �ʾҽ��ϴ�.");
				moveURL = "main.jsp";
			}
			response.sendRedirect(moveURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
