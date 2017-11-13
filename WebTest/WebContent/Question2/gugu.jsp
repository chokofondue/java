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
		int dan = Integer.parseInt(request.getParameter("dan"));
	%>
	<table border="1">
		<tr>
			<td colspan="9" align="center"><%=dan%>단</td>
		</tr>
		<tr>
			
			<%for(int i = 1; i < 10; i++){%>
				<td><%=dan%>*<%=i%>=<%=dan*i %></td>
			<%}%>			
			
		</tr>
	</table>
	 
</body>
</html>