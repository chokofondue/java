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
		String name = request.getParameter("name");
		Double cm = Integer.parseInt(request.getParameter("cm"))/100.0;
		int kg = Integer.parseInt(request.getParameter("kg"));
		Double num_result = kg/(cm*cm);
		String result = null;
		
		if(num_result >= 35){
			result = "����";
		} else if(num_result >= 30){
			result = "��";
		} else if(num_result >= 25){
			result = "��ü��";
		} else if(num_result >= 20){
			result = "����ü��";
		} else if(num_result < 20){
			result = "��ü��";
		}
		
	%>

	<h1>���������</h1>
	<table border="1">
		<tr align="center">
			<td >�̸�</td>
			<td><%=name %></td>
		</tr>
		<tr align="center">
			<td>����</td>
			<td><%=cm %>m</td>
		</tr>
		<tr align="center">
			<td>ü��</td>
			<td><%=kg %>kg</td>
		</tr>
		<tr>
			<td colspan="2" align="center">���� BMI</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<h1><%= num_result %></h1>
				<%=result %>
			</td>
						
		</tr>
	</table>
</body>
</html>