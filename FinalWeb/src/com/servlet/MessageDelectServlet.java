package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.WebDAO;


@WebServlet("/MessageDelectServlet")
public class MessageDelectServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		
		WebDAO webdao = WebDAO.getInstance();

		String moveURL = "";
		
		try {			
			if (webdao.Delect(email) > 0) {
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
