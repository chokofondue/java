package Question5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add_cookie")
public class add_cookie extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cookie_name = request.getParameter("cookie_name");
		String cookie_context = request.getParameter("cookie_context");
		
		int time = Integer.getInteger(request.getParameter("time"));
		
		Cookie cookie = new Cookie(cookie_name, cookie_context);
		cookie.setMaxAge(time);
		
		
	}

}
