<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<style type="text/css">
#header {
	float: right;
}

hr {
	clear: both;
}
</style>

<%
	Cookie[] cookies = request.getCookies();
	String nickName = "";
	boolean isLogin = false;
	String strLogin = "로그인";
	String strurl = "ex02_loginServlet";
	
	//쿠키
	/* if (cookies != null) {

		// for (Cookie tmp : cookies) {
	//		System.out.println(tmp.getName());
	//		System.out.println(tmp.getValue());
		//} 

		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("nick")) {
				nickName = URLDecoder.decode(cookies[i].getValue(),"euc-kr");
				isLogin = true;
				strLogin = "로그아웃";
				strurl = "ex02_LogoutServlet";
			}
		}
	} */
	
	//세션	--> 따로 인코딩X, 디코딩 X
	String result = (String)session.getAttribute("nick");
	
	if(result != null){
		nickName = result;
		isLogin = true;
		strLogin = "로그아웃";
		strurl = "ex02_LogoutServlet";
	}
%>
<div id="header">
	<form action="<%=strurl%>">
		<span><%=nickName %></span> 
		<% if(!isLogin){%>
			ID : <input type="text" name="id"> 
			PW : <input type="text" name="pw">
		<% } %>
		<input type="submit" value="<%= strLogin %>">
	</form>
</div>
<br>
<hr>