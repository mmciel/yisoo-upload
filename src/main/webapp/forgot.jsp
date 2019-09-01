<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>忘记密码</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="${APP_PATH}/css/bootstrap.min.css">
	<link rel="stylesheet" href="${APP_PATH}/css/animate.css">
	<link rel="stylesheet" href="${APP_PATH}/css/login-style.css">

	<!-- Modernizr JS -->
	<script src="${APP_PATH}/js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="${APP_PATH}/js/respond.min.js"></script>
	<![endif]-->

</head>
<body class="login-box">
<div class="container">
	<div class="row">
		<div class="col-md-12 text-center">
			<ul class="menu">
				<li class="active">YiSoo云文件服务</li>
			</ul>
		</div>
	</div>
	<!--            <div class="copyrights">Collect from <a href=""  title="mmciel2">mmciel</a></div>-->
	<div class="row">
		<div class="col-md-4 col-md-offset-4">


			<!-- Start Sign In Form -->
			<form action="#" class="fh5co-form animate-box" data-animate-effect="fadeIn">
				<h2>Forgot Password</h2>
				<div class="form-group">
					<div class="alert alert-success" role="alert">Your email has been sent.</div>
				</div>
				<div class="form-group">
					<label for="email" class="sr-only">Email</label>
					<input type="email" class="form-control" id="email" placeholder="Email" autocomplete="off">
				</div>
				<div class="form-group">
					<p><a href="login.jsp">Sign In</a> or <a href="register.jsp">Sign Up</a></p>
				</div>
				<div class="form-group">
					<input type="submit" value="Send Email" class="btn btn-primary">
				</div>
			</form>
			<!-- END Sign In Form -->

		</div>
	</div>
	<div class="row" style="padding-top: 60px; clear: both;">
		<div class="col-md-12 text-center"><p><small>&copy; All Rights Reserved. YiSoo <a href="#" target="_blank" title="YiSoo">YiSoo</a> - Collect from <a href="#" title="YiSoo" target="_blank">mmciel</a></small></p></div>
	</div>
</div>
<!-- jQuery -->
<script src="${APP_PATH}/js/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${APP_PATH}/js/bootstrap.min.js"></script>
<!-- Placeholder -->
<script src="${APP_PATH}/js/jquery.placeholder.min.js"></script>
<!-- Waypoints -->
<script src="${APP_PATH}/js/jquery.waypoints.min.js"></script>
<!-- Main JS -->
<script src="${APP_PATH}/js/main.js"></script>

</body>
</html>

