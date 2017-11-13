<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String[] array = {"apple","banana","orange"}; 
	session.setAttribute("array", array);
	%>
	
	<c:forEach var="item" items="${array}">
		<c:out value="${item }"></c:out>
	</c:forEach>
	
	<!-- 음수로 step 지원 X  -->
	<c:forEach var="i" begin="0" end="10" step="1">
		<c:out value="${i }"></c:out>
	</c:forEach>
	
</body>
</html>