<%@page import="java.util.ArrayList"%>
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
	  int num1=Integer.parseInt(request.getParameter("a")); 
	  int num2=Integer.parseInt(request.getParameter("b")); %>
	<%! public int add(int a, int b){
		
		return a+b;
	} %>
<%! public int	min(int a, int b){
		
		return a-b;
	} %>
	<%! public int mul(int a, int b){
		
		return a*b;
	} %>
	<%! public int div(int a, int b){
		
		return a/b;
	} %>
	
	<%=num1 %>+<%=num2 %>=<%=add(num1,num2)%><br>
	<%=num1 %>-<%=num2 %>=<%=min(num1,num2)%><br>
	<%=num1 %>*<%=num2 %>=<%=mul(num1,num2)%><br>
	<%=num1 %>/<%=num2 %>=<%=div(num1,num2)%><br>

</body>
</html>