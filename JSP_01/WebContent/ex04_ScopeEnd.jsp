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
		//������
		String pageScope = (String) pageContext.getAttribute("pageScope");
		String requestScope = (String) request.getAttribute("requestScope");
		String sessionScope = (String) session.getAttribute("sessionScope");
		String applicationScope = (String) application.getAttribute("applicationScope");
	%>
	
	<%=pageScope%>
	<%=requestScope%>
	<%=sessionScope%>
	<%=applicationScope%>

</body>
</html>