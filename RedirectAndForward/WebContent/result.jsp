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
			1)redirect ����&�ܺ� ������ �̵� ����
			forward ���� ������ �̵� ����
			2)redirect ������Ʈ�� -> �ؽ�Ʈ�� ����
			forward �ؽ�Ʈ, ��ü request,response ����
			3)redirect ������ �̵�(�Խ���)
			forward ������ �̵��� �� �����͸� ������ �̵��� ��(�۾���, �α���)
			
		 -->

		<% memberDTO member = (memberDTO)request.getAttribute("memberDTO"); %>
		�̸� : <%=request.getParameter("name") %>
		���� : <%=request.getParameter("age") %>
		��ȣ : <%=request.getParameter("tel") %>
		�ּ� : <%=request.getParameter("addr") %><br>
		�̸� : <%=member.getName() %>
		���� : <%=member.getAge() %>
		��ȣ : <%=member.getTel() %>
		�ּ� : <%=member.getAddr() %>
</body>
</html>