<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
<!-- 내장객체 -->
	<%
		int sum = 0;
		for(int i = 1 ; i <=100; i++){
			sum += i;
		}
		out.print(sum);
	%>

	<%-- <%
		if(sum==5050){%>
	
			<h1>1부터 100까지의 합은 5050입니다.</h1>
				
		<% }else{
		%>
			<h1>1부터 100까지의 합은?</h1>
	<%} %> --%>
	
	<%
		if(sum==5050){
	
			out.print("<h1>1부터 100까지의 합은 5050입니다.</h1>");
				
		 }else{
			out.print("<h1>1부터 100까지의 합은?</h1>");
			
	} %>
</body>
</html>