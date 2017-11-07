<%@page import="java.util.ArrayList"%>
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
	<% String title = request.getParameter("title");
		ArrayList<String> input = new ArrayList<String> ();
		
		int i = 1 ;
		
		while(null != request.getParameter("item"+i)){
			input.add(request.getParameter("item"+i));
			i++;
		}
		
		Random random = new Random();
		int ran = random.nextInt(input.size());
		
		
	%>


	<fieldset>
		<legend>랜덤당첨결과</legend>
	<!-- 주제를 출력하고 가져온 입력값을 랜덤으로 출력하시오. -->
	<%=title %><br>
	<%=input.get(ran) %>
	</fieldset>	
	
</body>
</html>