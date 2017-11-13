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
			String nick = "smart";
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user ="system";
			String pass = "1111";
			
			String sql = "select * from member where id = ?";
			try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn =DriverManager.getConnection(url, user, pass);
			PreparedStatement pst = conn.prepareStatement(sql);
		
			pst.setString(1, id);
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()){
				if(id.equals(rs.getString(1)) && pw.equals(rs.getString(2))){
					response.sendRedirect("ex14Logintrue.jsp?nickname="+rs.getString(3));
					
				}else { 
					response.sendRedirect("ex14LoginFalse.jsp");
				}
			}
				pst.close();
				conn.close();
				rs.close();
			}catch(Exception e){
				e.printStackTrace();
			}
				
		%>


</body>
</html>