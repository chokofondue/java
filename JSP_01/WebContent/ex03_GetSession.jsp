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
		//session.getAttribute("이름"); --> 다운캐스팅 필요
		String name_01 = (String)session.getAttribute("name_01");
		String name_02 = (String)session.getAttribute("name_02");
	%>
	<%= name_01 %>
	<%= name_02 %>
</body>
</html>