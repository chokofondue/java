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
	String strLogin = "�α���";
	String strurl = "ex02_loginServlet";
	
	if (cookies != null) {

		/* for (Cookie tmp : cookies) {
			System.out.println(tmp.getName());
			System.out.println(tmp.getValue());
		} */

		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("nick")) {
				nickName = cookies[i].getValue();
				isLogin = true;
				strLogin = "�α׾ƿ�";
				strurl = "ex02_LogoutServlet";
			}
		}
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