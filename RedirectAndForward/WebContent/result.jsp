<%@page import="com.memberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<!-- 
			redirect vs forward
			1)redirect 내부&외부 페이지 이동 가능
			forward 내부 페이지 이동 가능
			2)redirect 쿼리스트링 -> 텍스트만 전송
			forward 텍스트, 객체 request,response 유지
			3)redirect 페이지 이동(게시판)
			forward 페이지 이동할 때 데이터를 가지고 이동할 때(글쓰기, 로그인)
			
		 -->

		<% memberDTO member = (memberDTO)request.getAttribute("memberDTO"); %>
		이름 : <%=request.getParameter("name") %>
		나이 : <%=request.getParameter("age") %>
		번호 : <%=request.getParameter("tel") %>
		주소 : <%=request.getParameter("addr") %><br>
		이름 : <%=member.getName() %>
		나이 : <%=member.getAge() %>
		번호 : <%=member.getTel() %>
		주소 : <%=member.getAddr() %>
</body>
</html>