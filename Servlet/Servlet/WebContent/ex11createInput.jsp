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
	<!-- number type의 값을 넘겨받아 정수형 변수에 저장하시오. -->	
	<%
		String num = request.getParameter("num");
		int num_01 = Integer.parseInt(num);
	%>
	
	<form action="ex11randomWinner.jsp">
	<fieldset>		
	<legend>랜덤당점 작성</legend>
	<!-- 넘겨받은 숫자에 따른 input 태그 생성하시오. -->
	주제 : <input type="text" name = "title"><br>
	<%for(int i = 1; i <= num_01; i++) {%>
	아이템<%= i %> : <input type="text" name="item<%=i %>"><br><%}%>

	<input type="submit" value="시작">
	</fieldset>
	
</form>
</body>
</html>