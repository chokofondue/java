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
	//192.168.0.33:8081/CookieAndSession/ex05visitor_count.jsp
	Integer cnt = (Integer)application.getAttribute("cnt");
	int tmp = 0;
	if(cnt == null){
		application.setAttribute("cnt",1);
		
	} else {
		tmp = cnt;
		tmp++;
		application.setAttribute("cnt",tmp);
	}
%>
당신은 <%= tmp %>째 방문자 입니다.
</body>
</html>