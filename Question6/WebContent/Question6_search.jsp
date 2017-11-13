<%@page import="com.model.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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
<body class="is-article-visible">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Main -->
		<div id="main">
			<!-- Search -->
			<article id="Login" class="active">
				<h2 class="major">Search</h2>
				
				<!-- 1.대여도서 목록을 출력하시오. 단, 대여할 도서가 없다면 '대여할 도서가 존재하지 않습니다' 문구를 출력하시오. -->
				
				
		
		
		
		
		
		
		
				<ul class="actions">
					<li><input type="button" value="Cancel" onclick="back()" /></li>
				</ul>
			</article>
		</div>

	</div>

	<!-- BG -->
	<div id="bg"></div>
	<script type="text/javascript">
		function back(){
			location.href="main.jsp";
		}
	</script>
	<!-- Scripts -->
	<!-- 	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script> -->
	<!-- 	<script src="assets/js/main.js"></script> -->

</body>
</html>