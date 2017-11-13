package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.WebDAO;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		WebDAO webdao = WebDAO.getInstance();

		String moveURL = "";

		try {
			if (webdao.Update(email, pw, tel, address) > 0) {
				System.out.print("수정 되었습니다");
				moveURL = "main.jsp";
			} else {
				System.out.println("저장되지 않았습니다.");
				moveURL = "main.jsp";
			}
			response.sendRedirect(moveURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
