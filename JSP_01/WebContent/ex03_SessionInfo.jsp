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
		//������� �ð�
		long createTime = session.getCreationTime();
		//������ ���ð�
		long lastAccess = session.getLastAccessedTime();
		//���� ���̵�
		String id = session.getId();
		//���� ��ȿ�ð�(������ ���� ��ȿ�ð�)
		int life = session.getMaxInactiveInterval();

	%>
	
	createTime : <%=createTime %><br>
	lastAccess : <%=lastAccess %><br>
	id : <%=id %><br>
	life : <%=life %>
	
</body>
</html>