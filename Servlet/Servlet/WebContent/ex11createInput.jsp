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
	<!-- number type�� ���� �Ѱܹ޾� ������ ������ �����Ͻÿ�. -->	
	<%
		String num = request.getParameter("num");
		int num_01 = Integer.parseInt(num);
	%>
	
	<form action="ex11randomWinner.jsp">
	<fieldset>		
	<legend>�������� �ۼ�</legend>
	<!-- �Ѱܹ��� ���ڿ� ���� input �±� �����Ͻÿ�. -->
	���� : <input type="text" name = "title"><br>
	<%for(int i = 1; i <= num_01; i++) {%>
	������<%= i %> : <input type="text" name="item<%=i %>"><br><%}%>

	<input type="submit" value="����">
	</fieldset>
	
</form>
</body>
</html>