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
		1.주제를 가져오와 문자열 변수에 저장하는 코드를 작성하시오.
		2.입력한 값들을 가져와 문자열 배열에 저장하는 코드를 작성하시오. 
		3.넘겨받은 입력값 개수에 따른 Random범위 지정 후 정수형 변수에 저장하시오.
	-->
		<%	String subject = request.getParameter("subject");
			 String[] i= request.getParameterValues("i");
			
			Random rd = new Random();
			int result = rd.nextInt(i.length);
			
				%>
				

	<fieldset>
		<legend>랜덤당첨결과</legend>
	<!-- 주제를 출력하고 가져온 입력값을 랜덤으로 출력하시오. -->
						
			<%=subject %><br>
			<%=i[result] %>
	</fieldset>	
	
</body>
</html>