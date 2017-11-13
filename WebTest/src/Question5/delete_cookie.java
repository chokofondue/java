package Question5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/delete_cookie")
public class delete_cookie extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String del_name = request.getParameter("del_name");
		
		Cookie cookie = new Cookie(del_name, del_name);
		
		cookie.setMaxAge(0);
	}

}
