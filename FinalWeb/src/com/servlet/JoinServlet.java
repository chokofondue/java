package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.WebDAO;

@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("euc-kr");

		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");

		WebDAO webdao = WebDAO.getInstance();

		String moveURL = "";

		try {
			if (webdao.Join(email, pw, tel, address) > 0) {
				System.out.print("���� �Ǿ����ϴ�");
				moveURL = "main.jsp";

			} else {
				System.out.println("������� �ʾҽ��ϴ�.");
				response.sendRedirect("LoginFalse.jsp");
			}
			response.sendRedirect(moveURL);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
