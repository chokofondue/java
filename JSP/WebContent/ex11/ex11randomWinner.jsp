<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	fieldset,h1{text-align: center;}
</style>
</head>
<body>
	<!-- 
		1.������ �������� ���ڿ� ������ �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		2.�Է��� ������ ������ ���ڿ� �迭�� �����ϴ� �ڵ带 �ۼ��Ͻÿ�. 
		3.�Ѱܹ��� �Է°� ������ ���� Random���� ���� �� ������ ������ �����Ͻÿ�.
	-->
		<%	String subject = request.getParameter("subject");
			 String[] i= request.getParameterValues("i");
			
			Random rd = new Random();
			int result = rd.nextInt(i.length);
			
				%>
				

	<fieldset>
		<legend>������÷���</legend>
	<!-- ������ ����ϰ� ������ �Է°��� �������� ����Ͻÿ�. -->
						
			<%=subject %><br>
			<%=i[result] %>
	</fieldset>	
	
</body>
</html>