<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900"
	rel="stylesheet">
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles//fontawesome.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles//templatemo-grad-school.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles//owl.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/lightbox.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/Login.css" />
</head>
<body>
	<header class="main-header clearfix" role="header">
		<div class="logo">
			<a href="#"><em>DBI</em> Bank</a>
		</div>
		<a href="#menu" class="menu-link"><i class="fa fa-bars"></i></a>
		<nav id="menu" class="main-nav" role="navigation">
			<ul class="main-menu">
				<li><a href="/">Home</a></li>
				<li><a href="register" class="external">Register</a></li>
			</ul>
		</nav>
	</header>

	<section class="section main-banner" id="top" data-section="section1">
		<video autoplay muted loop id="bg-video">
			<source src="assets/images/course-video.mp4" type="video/mp4" />
		</video>

		<div class="video-overlay header-text">
			<form action="logedin" method="post">
				<div class="container">
					<h3>Enter UserName and Password</h3>
					<table>
						<tr>
							<td><label for="uname"><b>Username</b></label></td>
						</tr>
						<tr>
							<td><input type="text" placeholder="Enter Username"
								name="username" required /></td>
						</tr>
						<tr>
							<td><label for="psw"><b>Password</b></label></td>
						</tr>
						<tr>
							<td><input type="password" placeholder="Enter Password"
								name="password" required /></td>
						</tr>
						<tr>
							<td><font color="red"><c:out value="${msg}"></c:out></font>
							</td>
						</tr>
						<tr>
							<td>
								<button type="submit">Login</button>
							</td>
						</tr>
					</table>
					<br>
				</div>
			</form>
			<div class="main-button">
				<div class="scroll-to-section">
					<a href="#">Discover more</a>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/Login.css" />
</head>
<body>
	<form action="logedin" method="post">
		<div class="container">
			<h1>Welcome To DBI Bank</h1>
			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="username" required> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" required>
			<font color="red"><c:out value="${msg}"></c:out></font>
			<button type="submit">Login</button>
			<br>
			
			</div>
	</form>
</body>
</html> --%>