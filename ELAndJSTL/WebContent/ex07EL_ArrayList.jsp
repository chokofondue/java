<%@page import="com.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	  <%
      ArrayList<MemberDTO> list = new ArrayList();
      list.add(new MemberDTO("hhd1", "111"));
      list.add(new MemberDTO("hhd2", "222"));
      list.add(new MemberDTO("hhd3", "333"));
      
      request.setAttribute("mem_list", list);
   	%>
   
    ${mem_list[0].id}<br>
    ${mem_list[0].pw}<br>
    
    ${mem_list[1].id}<br>
    ${mem_list[1].pw}<br>
    <table border="1px solid black">
    	<c:forEach var="i" begin="0" end="2" step="1">
    	<tr>
    		<td>
    			 ${mem_list[i].id}    			  
    		</td>
    		<td>
    			${mem_list[i].pw}
    		</td><br>
    	</tr>
    	</c:forEach>
    	<c:forEach var="item" items="${mem_list}">
		<tr>
    		<td>
    			 ${item.id}    			  
    		</td>
    		<td>
    			${item.pw}
    		</td><br>
    	</tr>
		</c:forEach>
    </table>
    
</body>
</html>