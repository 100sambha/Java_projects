<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="header"%>
<%@ attribute name="content" fragment="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/menu.css" />
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
	href="${pageContext.request.contextPath}/resources/styles/info.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/viewBalance.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/Deposit.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/Transfer.css">
</head>
<body>
	<header class="main-header clearfix" role="header">
		<div class="logo">
			<a href="#"><em>DBI</em> Bank</a>
		</div>
		<a href="#menu" class="menu-link"><i class="fa fa-bars"></i></a>
		<nav id="menu" class="main-nav" role="navigation">
			<ul class="main-menu">
				<!-- <li><a href="login">Login</a></li> -->
				<li><a href="/" class="external" style="padding: 20px;margin: 20px;line-height: 0">Logout</a></li>
			</ul>
		</nav>
	</header>

	<section class="section main-banner" id="top" data-section="section1">
		<video autoplay muted loop id="bg-video">
			<source src="assets/images/course-video.mp4" type="video/mp4" />
		</video>

		<div class="video-overlay">
			<div class="caption">
				<div
					style="position: absolute; text-align: center; top: 10px; width: 100%;">
					<jsp:invoke fragment="content"></jsp:invoke>
				</div>
			</div>
		</div>
	</section>
	<div
		style="position: fixed; top: 80px; left: 0%; height: 100px; width: 100%">
		<ul class="menuUL">
			<li><a href="balanceview">View Balance</a></li>
			<li><a href="deposit">Deposit</a></li>
			<li><a href="withdraw">Withdraw</a></li>
			<li><a href="fundtransfer">Fund Transfer</a></li>
			<li><a href="info">Details</a></li>
		</ul>
	</div>
</body>
</html>