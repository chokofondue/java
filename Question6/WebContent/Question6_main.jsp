<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Dimension by HTML5 UP</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
</head>
<body>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<!-- Header -->
		<header id="header">
			<div class="logo">
				<span class="icon fa-bookmark-o"></span>
			</div>
			<div class="content">
				<div class="inner">
					<h1>Book Management System</h1>
					<!-- 1.세션에 저장된 NICKNAME이 비어있는지 확인 후 출력하시요. -->
				
					<h2>로그인 해주세요.</h2>
				
					<!-- 세션에 NICKNAME이 있는 경우 'Admin님 환영합니다' 문구를 출력하시오. -->
				</div>
			</div>
			<nav>
				<ul>
					<!-- 2.세션에 저장된 NICKNAME이 비어있는지 확인 후 Login, Join버튼을 출력하시요. -->
					<!-- 3.생성된 버튼의 경로를 각각 지정하시오. -->
					
					<li><a href="#">Login</a></li>
					<li><a href="#">Join</a></li>
					<li><a href="#">Logout</a></li>
					<li><a href="#">Info</a></li>
					<li><a href="#">Search</a></li>
					<li><a href="#">Return</a></li>
				
					<!-- 세션에 NICKNAME이 있는 경우 Logout, Info, Search, Return 버튼을 출력하시오. -->
				</ul>
			</nav>
		</header>

		<!-- Footer -->
		<footer id="footer">
			<p class="copyright">
				&copy; SmartMedia
			</p>
		</footer>

	</div>

	<!-- BG -->
	<div id="bg"></div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>
