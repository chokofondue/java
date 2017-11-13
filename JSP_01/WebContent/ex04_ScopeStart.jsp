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
		//각각 만들기
		
		//pageContext.setAttribute("이름","값")
		pageContext.setAttribute("page", "page");
		//request.setAttribute("이름", "값");
		request.setAttribute("request", "request");
		//session.setAttribute("이름", "값");
		session.setAttribute("session", "session");
		//application.setAttribute("이름", "값");
		application.setAttribute("application", "application");
		
		//이동
		//response.sendRedirect("ex04_ScopeEnd.jsp");
		
		request.getRequestDispatcher("ex04_ScopeEnd.jsp").forward(request, response);
		
	%>
</body>
</html>