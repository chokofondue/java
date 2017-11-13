<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" errorPage="Ex06Err.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		GregorianCalendar gc = new GregorianCalendar();
		Date date = gc.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
	%>
	<%= format.format(date) %>
	<%
		int num = 10/0;
	%>
</body>
</html>