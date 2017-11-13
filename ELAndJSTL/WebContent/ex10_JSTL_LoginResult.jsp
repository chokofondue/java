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
<!-- ${empty sessionScope.login } = 세션이 null일 경우 -->
	<c:choose>
		<c:when test="${empty sessionScope.login }">
			로그인 실패
		</c:when>
		<c:otherwise>
			로그인 성공
		</c:otherwise>
	</c:choose>
</body>
</html>