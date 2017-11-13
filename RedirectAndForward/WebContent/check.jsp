<%@page import="com.memberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		memberDTO dto = new memberDTO(name, age, tel, addr);
		request.setAttribute("memberDTO", dto);
	%>
	<%
		if (age < 19) {
			response.sendRedirect("input.html");
		} else {
			//
			//response.sendRedirect("result.jsp?name="+name+"&age="+age+"&tel="+tel+"&addr="+addr);
			RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
			dispatcher.forward(request, response);
			//pageContext.forward("result.jsp");
		}
	%>
</body>
</html>