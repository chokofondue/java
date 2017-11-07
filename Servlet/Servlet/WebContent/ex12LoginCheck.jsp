<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id_ = "system";
		String pw_ = "1111";
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, id_, pw_);
		
		PreparedStatement pst = conn.prepareStatement("select * from user_info where id = ?");
		pst.setString(1, id);
		ResultSet rs = pst.executeQuery();	
		
		
		if(rs.next()){
			if(id.equals(rs.getString(1)) && pw.equals(rs.getString(2))) {
				response.sendRedirect("ex14Logintrue.jsp?nickname="+rs.getString(3));
			} else {
				response.sendRedirect("ex14LoginFalse.jsp");
			}
			
		}
			
		rs.close();
		pst.close();
		conn.close();
		
		/* //request.setAttribute("id", id);
		if(id.equals("admin") && pw.equals("1234")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("ex14Logintrue.jsp");
			dispatcher.forward(request,response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("ex14LoginFalse.jsp");
			dispatcher.forward(request,response);
		} */
		}catch(Exception e){
			e.printStackTrace();
		}
		%>
		
</body>
</html>