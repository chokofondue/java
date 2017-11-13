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
		//만들어진 시간
		long createTime = session.getCreationTime();
		//마지막 사용시간
		long lastAccess = session.getLastAccessedTime();
		//세션 아이디
		String id = session.getId();
		//세션 유효시간(서버내 세션 유효시간)
		int life = session.getMaxInactiveInterval();

	%>
	
	createTime : <%=createTime %><br>
	lastAccess : <%=lastAccess %><br>
	id : <%=id %><br>
	life : <%=life %>
	
</body>
</html>