<%@ page import="com.airline.model.User" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Home</title>
<!-- BOOTSTRAP STYLES-->
<link href="css/bootstrap.css" rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link href="css/font-awesome.css" rel="stylesheet" />
<!-- CUSTOM STYLES-->
<link href="css/custom.css" rel="stylesheet" />
<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- GOOGLE FONTS-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />

<script type="text/javascript">
	function checkMe() {
		if (document.getElementById('ch1').checked == false
				&& document.getElementById('ch2').checked == false
				&& document.getElementById('ch3').checked == false) {
			alert('Please select atleast one criteria for stops');
			return false;
		}

		if (document.getElementById('dac').value == ''
				|| document.getElementById('aac').value == '') {
			alert('Please enter both departure and arrival airport codes');
			return false;
		}

		if (document.getElementById('dac').value == document
				.getElementById('aac').value) {
			alert('Please enter different departure and arrival airport codes');
			return false;
		}

	}
</script>
</head>
<body>
<%
User user=(User)session.getAttribute("user");
%>
	<div id="wrapper">
		<nav class="navbar navbar-default navbar-cls-top " role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".sidebar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html">AirLink</a>
		</div>
		<div>
			<p
				style="color: red; padding: 15px 50px 5px 50px; float: right; font-size: 16px;">
				Welcome <%out.print(user.getEmailId()); %> &nbsp;</p>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="fontpage.jsp"><span
						class="glyphicon glyphicon-home" style="Color: blue"> HOME</span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-phone-alt"
						style="Color: blue"> CONTACT US</span></a></li>
				<li><a href="MainController"><span
						class="glyphicon glyphicon-log-out" style="Color: blue">
							LOGOUT</span></a></li>
							
			</ul>

		</div>
			</nav>


		<!--/.SLIDESHOW END-->
		<!-- /. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
		<div class="sidebar-collapse">
			<section id="home" class="text-center">

			<div id="carousel-example" class="carousel slide"
				data-ride="carousel">

				<div class="carousel-inner" style="height: 180px">
					<div class="item active">

						<img src="images/aa.jpg" alt="" />
						<div class="carousel-caption">
							<h4 class="back-light"></h4>
						</div>
					</div>
					<div class="item">
						<img src="images/aa1.jpg" alt="" />
						<div class="carousel-caption ">
							<h4 class="back-light"></h4>
						</div>
					</div>
					<div class="item">
						<img src="images/sw1.jpg" alt="" />
						<div class="carousel-caption ">
							<h4 class="back-light"></h4>
						</div>
					</div>
				</div>

				<ol class="carousel-indicators">
					<li data-target="#carousel-example" data-slide-to="0"
						class="active"></li>
					<li data-target="#carousel-example" data-slide-to="1"></li>
					<li data-target="#carousel-example" data-slide-to="2"></li>
				</ol>
			</div>

			</section>

		</div>

		</nav>
		<div id="page-wrapper">
			<div id="page-inner">

				<!-- /. ROW  -->
				<hr />


				<form action="ActionServlet" method="post"
					onsubmit="return checkMe();">
					<input type="hidden" name="type" value="flightdetails">
					<div class="row">
						<div class="col-md-12">
							<h2>Find Flights between two airports</h2>

							<h4>Enter Departure Airport Code :</h4>
							&nbsp; <input type="text" name="dac" id="dac" />
							<h4>Enter Arrival Airport Code :</h4>
							&nbsp; <input type="text" name="aac" id="aac" /> &nbsp;
							<h4>Enter the Departure Date :</h4>
							<input type="date" name="date" id="date" />
							<br /> <br />
							<input type="submit" name="Flights" value="Flights"
								class="btn btn-success ">



						</div>
					</div>
					<hr />
				</form>

				<br />





				<div class="row">

					<div class="col-md-6 col-sm-12 col-xs-12">
						<div class="panel panel-default">

							<div class="panel-body">
								<a href="AvailSeats.jsp"
									class="btn btn-danger square-btn-adjust">Get Available
									Seats Information</a> <br /> <br /> <a href="GetFareInfo.jsp"
									class="btn btn-danger square-btn-adjust">Get Fare
									Information</a> <br /> <br /> <a href="Passenger.jsp"
									class="btn btn-danger square-btn-adjust">Get Passenger List
									for a flight</a> <br /> <br /> <a href="viewFlightInstances.jsp"
									class="btn btn-danger square-btn-adjust">Get List of
									flights for a passenger</a>

							</div>
						</div>
					</div>
					<div class="col-md-6 col-sm-12 col-xs-12">
						<div class="panel panel-default">

							<div class="panel-body">

								<h2>Special Deals</h2>

								<h4>Fly anywhere in USA starting $99</h4>
								<h4>Earn 1000 mileage points for each flight with American
									Airlines</h4>
							</div>
						</div>
					</div>




					<!-- /. PAGE INNER  -->

					<!-- /. PAGE WRAPPER  -->
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="assets/js/canvasjs.min.js"></script>

	<!-- /. WRAPPER  -->
	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
	<!-- JQUERY SCRIPTS -->
	<script src="js/jquery-1.10.2.js"></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src="js/bootstrap.min.js"></script>
	<!-- METISMENU SCRIPTS -->
	<script src="js/jquery.metisMenu.js"></script>
	<!-- CUSTOM SCRIPTS -->
	<script src="js/custom.js"></script>
</body>
</html>