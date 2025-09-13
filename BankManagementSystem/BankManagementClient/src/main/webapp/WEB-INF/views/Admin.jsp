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
	href="${pageContext.request.contextPath}/resources/styles/admin.css" />
</head>
<body>
	<header class="main-header clearfix" role="header">
		<div class="logo">
			<a href="#"><em>DBI</em> Bank</a>
		</div>
		<a href="#menu" class="menu-link"><i class="fa fa-bars"></i></a>
		<nav id="menu" class="main-nav" role="navigation">
			<ul class="main-menu">
				<li><a href="/">Logout</a></li>
			</ul>
		</nav>
	</header>

	<section class="section main-banner" id="top" data-section="section1">
		<video autoplay muted loop id="bg-video">
			<source src="assets/images/course-video.mp4" type="video/mp4" />
		</video>

		<div class="video-overlay header-text">
			<div class="showusertable">
				<form action="updateUser" method="post">
					<h2>
						Admin : <em><c:out value="${user}"></c:out></em>
					</h2>
					<table class="tableT">
						<tr class="tableR">
							<th>Customer Id</th>
							<th>Account No</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Mo No</th>
							<th>Address</th>
							<th>E-mails</th>
							<th>DOB</th>
							<th>Username</th>
							<th>Status</th>
						</tr>
						<c:forEach var="c" items="${customer}">
							<tr class="tableR">
								<td>${c.id}</td>
								<td>${c.accountNo}</td>
								<td>${c.fName}</td>
								<td>${c.lName}</td>
								<td>${c.moNo}</td>
								<td>${c.address}</td>
								<td>${c.gmail}</td>
								<td>${c.dob}</td>
								<td>${c.username}</td>
								<td><input type="submit" value="${c.status}-${c.id}"
									name="status"></td>
							</tr>
						</c:forEach>
					</table>
				</form>
			</div>
		</div>
	</section>
</body>
</html>


<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminPage</title>
</head>
<body>
	<c:out value="${user}"></c:out>
	<form action="updateUser" method="post">
	
		<table>
			<tr>
				<td>Customer Id</td>
				<td>Account No</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Mo No</td>
				<td>Address</td>
				<td>E-mails</td>
				<td>DOB</td>
				<td>Username</td>
				<td>Password</td>
				<td>Status</td>
			</tr>
			<c:forEach var="c" items="${customer}">
				<tr>
					<td>${c.id}</td>
					<td>${c.accountNo}</td>
					<td>${c.fName}</td>
					<td>${c.lName}</td>
					<td>${c.moNo}</td>
					<td>${c.address}</td>
					<td>${c.gmail}</td>
					<td>${c.dob}</td>
					<td>${c.username}</td>
					<td>${c.password}</td>
					<td><input type="submit" value="${c.status}-${c.id}" name="status"></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html> --%>