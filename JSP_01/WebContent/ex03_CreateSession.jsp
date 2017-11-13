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
		//session.setMaxInactiveInterval(arg0);		--> 세션 유효시간 설정(초단위)
		session.setMaxInactiveInterval(5);
		//session.setAttribute("이름","값");			--> 세션 생성
		session.setAttribute("name_01", "session_Value_01");
		session.setAttribute("name_02", "session_Value_02");
	%>
</body>
</html>