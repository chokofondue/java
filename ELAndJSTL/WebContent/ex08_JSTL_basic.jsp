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
 <c:out value="Hello World!"></c:out>
 <c:set var = "name" value="c:set" scope="request"></c:set>
 <!-- remove = �Ӽ����� -->
 <c:remove var="name"/>
 <c:out value="${name}"></c:out>
</body>
</html>