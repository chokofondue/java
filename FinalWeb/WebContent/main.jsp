<%@page import="com.model.WebDTO"%>
<%@page import="com.model.WebDAO"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Forty by HTML5 UP</title>
		<meta charset="utf-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
	</head>
	<body>
			
		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header" class="alt">
						<a href="index.html" class="logo"><strong>Forty</strong> <span>by HTML5 UP</span></a>
						<nav>
						<!-- �α��� �� Logout.do�� �̵��� �� �ִ�'�α׾ƿ�'��ũ�� '������������'��ũ�� ����Ͻÿ�. -->	
						<% String result = (String)session.getAttribute("email");
							String email = "";
							WebDAO webdao = WebDAO.getInstance();
							WebDTO webdto = null;
							ArrayList<WebDTO> list = new ArrayList<WebDTO>();
						%>
						<c:choose>
							<c:when test="${not empty sessionScope.email}">
								<a href="Logout.do">�α׾ƿ�</a>
								<a href="Update.do">������������</a>
							</c:when>
							<c:otherwise>
								<a href="#menu">�α���</a>
							</c:otherwise>
						</c:choose>
						<%-- 
						<% if(result != null){ %>
							<a href="Logout.do">�α׾ƿ�</a>
							<a href="Update.do">������������</a>
						<%} else {%>
							<a href="#menu">�α���</a>
						
						<%} %> --%>
						</nav>
					</header>

				<!-- Menu -->
					<nav id="menu">	
						<ul class="links">
							<li><h5>�α���</h5></li>
								<form action="LoginServlet" method="post">
									<li><input type="text"  placeholder="Email�� �Է��ϼ���" name = "email"></li>
									<li><input type="password"  placeholder="PW�� �Է��ϼ���" name= "pw"></li>
									<li><input type="submit" value="LogIn" class="button fit"></li>
								</form>
						</ul>
						<ul class="actions vertical">
							<li><h5>ȸ������</h5></li>
								<form action="JoinServlet" method="post">
									<li><input type="text"  placeholder="Email�� �Է��ϼ���" name = "email"></li>
									<li><input type="password"  placeholder="PW�� �Է��ϼ���" name= "pw"></li>
									<li><input type="text"  placeholder="��ȭ��ȣ�� �Է��ϼ���" name="tel"></li>
									<li><input type="text"  placeholder="���ּҸ� �Է��ϼ���" name="address"></li>
									<li><input type="submit" value="JoinUs" class="button fit"></li>
								</form>
						</ul>
					</nav>			
				<!-- Banner -->
					<section id="banner" class="major">
						<div class="inner">
							<header class="major">
							<c:choose>
							<c:when test="${not empty sessionScope.email}">
								<h1>${sessionScope.email }�� ȯ���մϴ�.</h1>
							</c:when>
							<c:otherwise>
								<h1>�α��� �� ���Ǿ��̵� ������ּ���.</h1>
							</c:otherwise>
							</c:choose>
							
							<%-- 
							<% if(result != null){ %>
								<h1><%= email = result %>�� ȯ���մϴ�.</h1>
								<% } else {%>
								<h1>�α��� �� ���Ǿ��̵� ������ּ���.</h1>
								<% } %>
								<!-- �α��� �� �α��� �� ������� ���Ǿ��̵�� �ٲٽÿ�.
									 ex)smart�� ȯ���մϴ� -->
									  --%>
							</header>
							<div class="content">
								<p>�Ʒ��� ���ݱ��� ��� �� ������Դϴ�.<br></p>
								<ul class="actions">
									<li><a href="#one" class="button next scrolly">Ȯ���ϱ�</a></li>
								</ul>
							</div>
						</div>
					</section>

				<!-- Main -->
					<div id="main">

						<!-- One -->
							<section id="one" class="tiles">
								<article>
									<span class="image">
										<img src="images/pic01.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">HTML</a></h3>
										<p>Ȩ�������� ����� ���� ���</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic02.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">CSS</a></h3>
										<p>HTML�� ���������ִ� ���</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic03.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">Servlet/JSP</a></h3>
										<p>Java�� �⺻���� �� �� ���α׷��� ���/��ũ��Ʈ ���</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic04.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">JavaScript</a></h3>
										<p>HTML�� �⺻���� ������ ������ �� �ִ� ���</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic05.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">MVC</a></h3>
										<p>�� ������Ʈ �� ���� ���� ����ϴ� ����������</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic06.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">Web Project</a></h3>
										<p>�������� ����������Ʈ�� �� ����� Ȱ���ϼ���!</p>
									</header>
								</article>
							</section>
					<!-- Two -->
							<section id="two">
								<div class="inner">
									<header class="major">
										<h2>������ �� �޼��� Ȯ���ϱ�</h2>
										
									</header>
									<p></p>
									<ul class="actions">
									<c:choose>
										<c:when test="${empty sessionScope.email}">
											<li>�α����� �ϼ���.</li>
										</c:when>
										<%list = webdao.MessageSelect(email);%>
										<c:when test="${empty pageScioe.list}">
										<li>�޼����� �����ϴ�.</li>
										</c:when>
										<c:otherwise>
											<c:forEach items="${pageScope.list}" var="test">
											<li>
												<h4>������� :${pageScope.list.email}</h4><br>										
												<h4>���� :${pageScope.list.content}></h4><br>										
												<h4>��¥ :${pageScope.list.date}</h4>
												<a href="MessageSelectDelectServlet?num=${pageScioe.list.num} %>" 
												class="button next scrolly">�����ϱ�</a>
											</li>
											</c:forEach>
											<div align="center"><a href="MessageDelectServlet" class="button next scrolly" >��ü�����ϱ�</a></div>
											
										</c:otherwise>
									</c:choose>
									
								<%-- <% if(result == null){ %>
								<li>�α����� �ϼ���.</li>
								<%} else { %>
									<%list = webdao.MessageSelect(email);
									 if(list.size() == 0){ %>
										<li>�޼����� �����ϴ�.</li>									
									<% } else {
										 
										for(int i = 0; i<list.size();i++){%>
										<li>
											<h4>������� :<%= list.get(i).getSend_email() %></h4><br>										
											<h4>���� :<%= list.get(i).getContent() %></h4><br>										
											<h4>��¥ :<%= list.get(i).getDate() %></h4>
											<a href="MessageSelectDelectServlet?num=<%= list.get(i).getNum() %>" class="button next scrolly">�����ϱ�</a>
										</li>
											<% } %>
											<div align="center"><a href="MessageDelectServlet" class="button next scrolly" >��ü�����ϱ�</a></div>
										<% } %>										
									<% } %> --%>
								</ul>									
							</div>
						</section>
					</div>

				<!-- Contact -->
					<section id="contact">
						<div class="inner">
							<section>
								<form action="MessageServlet">
								<div class="field half first">
										<label for="name">Name</label>
										<input type="text"  name = "send_email" id="name" placeholder="������ ��� �̸�" />
									</div>
									<div class="field half">
										<label for="email">Email</label>
										<input type="text"  name = "receive_email"id="email" placeholder="���� ��� �̸���"/>
									</div>

									<div class="field">
										<label for="message">Message</label>
										<textarea  id="message" name="content" rows="6"></textarea>
									</div>
									<ul class="actions">
										<li><input type="submit" value="Send Message" class="special" /></li>
										<li><input type="reset" value="Clear" /></li>
									</ul>
								</form>
							</section>
							<%if(result == null){ 
							} else {
								webdto = webdao.Select(email);
								%>
							<section class="split">
								<section>
									<div class="contact-method">
										<span class="icon alt fa-envelope"></span>
										<h3>Email</h3>
										<% if(result != null){ %>
										<a href="#"><%= webdto.getEmail() %></a>
										<% } else {%>
										<a href="#">�α��� �� ����� �̸����� ���</a>
										<!-- �α��� �� ������� �̸����� ����Ͻÿ� -->
										<% } %>
										
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-phone"></span>
										<h3>Phone</h3>
										<% if(result != null){ %>
										<a href="#"><%= webdto.getTel() %></a>
										<% } else {%>
										<span>�α��� �� ����� ��ȭ��ȣ�� ���</span>
										<!-- �α��� �� ������� ��ȭ��ȣ�� ����Ͻÿ� -->
										<% } %>
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-home"></span>
										<h3>Address</h3>
										<% if(result != null){ %>
										<a href="#"><%= webdto.getAddress() %></a>
										<% } else {%>
										<span>�α��� �� ����� ���ּҸ� ���</span>
										<!-- �α��� �� ������� ���ּҸ� ����Ͻÿ� -->
										<% } %>
									</div>
								</section>
							</section>
							<% } %>											
						</div>
					</section>

				<!-- Footer -->
					<footer id="footer">
						<div class="inner">
							<ul class="icons">
								<li><a href="#" class="icon alt fa-twitter"><span class="label">Twitter</span></a></li>
								<li><a href="#" class="icon alt fa-facebook"><span class="label">Facebook</span></a></li>
								<li><a href="#" class="icon alt fa-instagram"><span class="label">Instagram</span></a></li>
								<li><a href="#" class="icon alt fa-github"><span class="label">GitHub</span></a></li>
								<li><a href="#" class="icon alt fa-linkedin"><span class="label">LinkedIn</span></a></li>
							</ul>
							<ul class="copyright">
								<li>&copy; Untitled</li><li>Design: <a href="https://html5up.net">HTML5 UP</a></li>
							</ul>
						</div>
					</footer>

			</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>

	</body>
</html>

