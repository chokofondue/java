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
		//���� �����
		
		//pageContext.setAttribute("�̸�","��")
		pageContext.setAttribute("page", "page");
		//request.setAttribute("�̸�", "��");
		request.setAttribute("request", "request");
		//session.setAttribute("�̸�", "��");
		session.setAttribute("session", "session");
		//application.setAttribute("�̸�", "��");
		application.setAttribute("application", "application");
		
		//�̵�
		//response.sendRedirect("ex04_ScopeEnd.jsp");
		
		request.getRequestDispatcher("ex04_ScopeEnd.jsp").forward(request, response);
		
	%>
</body>
</html>