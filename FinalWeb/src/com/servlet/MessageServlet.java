package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.WebDAO;


@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String send_email = request.getParameter("send_email");
		String receive_email = request.getParameter("receive_email");
		String content = request.getParameter("content");
		
		WebDAO webdao = WebDAO.getInstance();
		
		String moveURL = "";
		
		try {
			if(webdao.Message(send_email, receive_email, content) > 0) {
				System.out.print("저장 되었습니다");
				moveURL = "main.jsp";
			} else {
				System.out.println("저장되지 않았습니다.");
				moveURL = "main.jsp";
			}
			response.sendRedirect(moveURL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
