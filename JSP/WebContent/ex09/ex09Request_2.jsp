
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

			<%				
				request.setCharacterEncoding("EUC-KR");
				String name = request.getParameter("name");
				int java = Integer.parseInt(request.getParameter("java"));
				int web = Integer.parseInt(request.getParameter("web"));
				int iot = Integer.parseInt(request.getParameter("iot"));
				int and = Integer.parseInt(request.getParameter("android"));
				double avg = (java+web+iot+and)/4.0;
   			%>

	<%!
	public String getAvg(double avg){
	if(avg>95){
		return "A+";
	}else if(avg>85){
		return "A";
	}else if(avg>80){
		return "B";
	}else if(avg>70){
		return "C";
	}else{
		return "F";
	}
	}
	
	%>



<table width="500">	
				<tr>
					<td>이름</td>
					<td><%=name %></td>
				</tr>
				<tr>
					<td>JAVA점수</td>
					<td><%=java %></td>
				</tr>
				<tr>
					<td>WEB점수</td>
					<td><%=web %></td>
				</tr>
					<tr>
					<td>IOT점수</td>
					<td><%=iot %></td>
				</tr>		
				<tr>
					<td>ANDROID점수</td>
					<td><%=and %></td>
				</tr>		
				<tr>
					<td>평균 점수</td>
					<td><%=avg %></td>
				</tr>	
				
				<tr>
					<td>학점</td>
					<td><h1><%=getAvg(avg) %></h1></td>
				</tr>																																		
			</table>
</body>
</html>