<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Update Page</title>
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
			<!-- Info -->
			<article id="Login" class="active">
				<h2 class="major">Update</h2>
				
				<!-- 1.info.jsp에 있는 id값만 넘겨받아 input에 출력하시오. -->
				<!-- 2.UPDATE버튼 클릭시 UpdateService.java로 이동하시오. -->
				
				<form method="post" action="Update">
					<div class="field half">
						<label for="id">ID</label> <input type="text" readonly="readonly" />
					</div>
					<div class="field half">
						<label for="pw">PW</label> <input type="password" />
					</div>
					<div class="field half">
						<label for="nickname">NICKNAME</label> <input type="text" />
					</div>
					<div class="field half">
						<label for="email">EMAIL</label> <input type="text"	/>
					</div>
					<div class="field half">
						<label for="tel">TEL</label> <input type="text"	/>
					</div>

					<ul class="actions">
						<li><input type="submit" value="Update" class="special" /></li>
						<li><input type="button" value="Cancel" onclick="back()" /></li>
					</ul>
				</form>
			</article>
		</div>
	</div>

	<!-- BG -->
	<div id="bg"></div>
	<script type="text/javascript">
		function back() {
			location.href = "main.jsp";
		}
	</script>
	<!-- Scripts -->
	<!-- 	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script> -->
	<!-- 	<script src="assets/js/main.js"></script> -->

</body>
</html>

