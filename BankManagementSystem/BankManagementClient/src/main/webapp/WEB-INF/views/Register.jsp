<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	href="${pageContext.request.contextPath}/resources/styles/register.css" />
</head>
<body>
	<header class="main-header clearfix" role="header">
		<div class="logo">
			<a href="#"><em>DBI</em> Bank</a>
		</div>
		<a href="#menu" class="menu-link"><i class="fa fa-bars"></i></a>
		<nav id="menu" class="main-nav" role="navigation">
			<ul class="main-menu">
				<li><a href="/" class="external">Home</a></li>
				<li><a href="login">Login</a></li>
			</ul>
		</nav>
	</header>

	<section class="section main-banner" id="top" data-section="section1">
		<video autoplay muted loop id="bg-video">
			<source src="assets/images/course-video.mp4" type="video/mp4" />
		</video>

		<div class="video-overlay header-text">
			<div class="caption">
				<form action="addUser" method="post">
					<div class="reg">
						<div class="container">
								<h1>Welcome To DBI Bank</h1>
								<p>Please fill in this form to create an account.</p>
								<hr>
								<table>
									<tr>
										<td><label for="fname"><b>First Name</b></label> <input
											type="text" placeholder="Enter First Name" name="fName"
											id="fName" required></td>
										<td><label for="lname"><b>Last Name</b></label> <input
											type="text" placeholder="Enter last name" name="lName"
											id="lName" required></td>
									</tr>
									<tr>
										<td><label for="mono"><b>Mo No</b></label> <input
											type="text" placeholder="Enter mobile No" name="moNo"
											id="moNo" required></td>
										<td><label for="gmail"><b>Email</b></label> <input
											type="text" placeholder="Enter Email" name="gmail" id="gmail"
											required></td>
									</tr>
									<tr>
									</tr>
									<tr>
										<td><label for="address"><b>Address</b></label> <input
											type="text" placeholder="Enter Address" name="address"
											id="address" required></td>
										<td><label for="dob"><b>DOB</b></label> <input
											type="text" placeholder="Enter DOB" name="dob" id="dob"
											required></td>
									</tr>
									<tr>
										<td><label for="username"><b>User Name</b></label> <input
											type="text" placeholder="Enter username" name="username"
											id="username" required></td>
										<td><label for="password"><b>Password</b></label> <input
											type="password" placeholder="Enter Password" name="password"
											id="password" required></td>
									</tr>
									<tr>
									</tr>
								</table>
								<hr>

								<input type="submit" class="registerbtn" value="submit">

							<div class="container signin">
								<p>
									Already have an account? <a href="#">Sign in</a>.
								</p>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>
</body>
</html>

<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/register.css" />
</head>
<body>
	<h1>ICICI Bank</h1>
	<form action="addUser" method="post">
		<div class="reg">
			<div>
				<div class="container">
					<h1>Welcome To DBI Bank</h1>
					<p>Please fill in this form to create an account.</p>
					<hr>
					<table>
						<tr>
							<td><label for="fname"><b>First Name</b></label> <input
								type="text" placeholder="Enter First Name" name="fName"
								id="fName" required></td>
						</tr>
						<tr>
							<td><label for="lname"><b>Last Name</b></label> <input
								type="text" placeholder="Enter last name" name="lName"
								id="lName" required></td>
						</tr>
						<tr>
							<td><label for="mono"><b>Mo No</b></label> <input
								type="text" placeholder="Enter mobile No" name="moNo" id="moNo"
								required></td>
						</tr>
						<tr>
							<td><label for="gmail"><b>Email</b></label> <input
								type="text" placeholder="Enter Email" name="gmail" id="gmail"
								required></td>
						</tr>
						<tr>
							<td><label for="address"><b>Address</b></label> <input
								type="text" placeholder="Enter Address" name="address"
								id="address" required></td>
						</tr>
						<tr>
							<td><label for="dob"><b>DOB</b></label> <input type="text"
								placeholder="Enter DOB" name="dob" id="dob" required></td>
						</tr>
						<tr>
							<td><label for="username"><b>User Name</b></label> <input
								type="text" placeholder="Enter username" name="username"
								id="username" required></td>
						</tr>
						<tr>
							<td><label for="password"><b>Password</b></label> <input
								type="password" placeholder="Enter Password" name="password"
								id="password" required></td>
						</tr>
					</table>
					<hr>

					<input type="submit" class="registerbtn" value="submit">
				</div>

				<div class="container signin">
					<p>
						Already have an account? <a href="#">Sign in</a>.
					</p>
				</div>
			</div>
		</div>
	</form>
</body>
</html> --%>