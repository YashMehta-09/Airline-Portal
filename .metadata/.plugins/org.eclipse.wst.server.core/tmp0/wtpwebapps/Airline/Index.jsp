<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
				Welcome Guest &nbsp;</p>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="fontpage.jsp"><span
						class="glyphicon glyphicon-home" style="Color: blue"> HOME</span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-phone-alt"
						style="Color: blue"> CONTACT US</span></a></li>
				<li><a href="#" data-toggle="modal"
					data-target="#modalLoginForm"><span
						class="glyphicon glyphicon-log-in" style="Color: blue">
							LOGIN</span></a></li>
				<li><a href="#" data-toggle="modal"
					data-target="#modalRegisterForm"><span
						class="glyphicon glyphicon-user" style="Color: blue"> SIGN
							UP</span></a></li>
			</ul>

		</div>


		<form method="post" action="MainController">
			<div class="modal fade" id="modalLoginForm" tabindex="-1"
				role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header text-center">

							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body mx-3">
							<div class="md-form mb-5">

								<label data-error="wrong" data-success="right"
									for="defaultForm-email" class="glyphicon glyphicon-envelope">
									Your email</label> <input type="email" id="defaultForm-email"
									name="email" placeholder="Email" class="form-control validate">

							</div>

							<div class="md-form mb-4">
								<label data-error="wrong" data-success="right"
									for="defaultForm-pass" class="glyphicon glyphicon-lock">
									Your password</label> <input type="password" id="defaultForm-pass"
									name="password" placeholder="password"
									class="form-control validate">

							</div>

						</div>
						<div style="text-align: center">
							<input type="submit" class="btn btn-primary" name="Login"
								value="Login" style="text-align: center">
						</div>
						<div class="modal-footer">
							<div class="options text-center text-md-right mt-1">
								<p>
									Not a member? <a href="#" data-toggle="modal"
										data-target="#modalRegisterForm" class="blue-text">Sign Up</a>
								</p>
								<p>
									Forgot <a href="#" class="blue-text">Password?</a>
								</p>
							</div>
							<button type="button"
								class="btn btn-outline-info waves-effect ml-auto"
								data-dismiss="modal" style="text-align: center">Close</button>
						</div>
					</div>
				</div>
			</div>
		</form>


		<form method="post" action="MainController">
			<div class="modal fade" id="modalRegisterForm" tabindex="-1"
				role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header text-center">
							<h4 style="text-align: center">
								<strong>Sign Up</strong>
							</h4>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body mx-3">

							<div class="md-form mb-5">

								<label data-error="wrong" data-success="right"
									for="orangeForm-email"><span
									class="glyphicon glyphicon-user">Your email</span></label> <input
									type="email" name="email" id="orangeForm-email"
									placeholder="Email" class="form-control validate">
							</div>

							<div class="md-form mb-5">

								<label data-error="wrong" data-success="right"
									for="orangeForm-email"><span
									class="glyphicon glyphicon-earphone">Your Contact Number</span></label>
								<input type="text" name="contact" id="orangeForm-phone"
									placeholder="phone number" class="form-control validate">
							</div>

							<div class="md-form mb-5">
								<label data-error="wrong" data-success="right"
									for="orangeForm-pass"><span
									class="glyphicon glyphicon-lock">Your password</span></label> <input
									type="password" name="password" id="orangeForm-pass"
									placeholder="password" class="form-control validate">

							</div>

							<div class="md-form mb-5">
								<label data-error="wrong" data-success="right"
									for="orangeForm-name"><span
									class="glyphicon glyphicon-lock">Re-enter Your password</span></label>
								<input type="password" name="confirmpassword"
									id="orangeForm-repass" placeholder="re-password"
									class="form-control validate">

							</div>

						</div>
						<div style="text-align: center">
							<input type="submit" name="Signup" value="Signup"
								class="btn btn-primary" style="text-align: center">
						</div>
						<div class="modal-footer">
							<div class="options text-center text-md-right mt-1">
								<p>
									Already Register? <a href="#" data-toggle="modal"
										data-target="#modalLoginForm" class="blue-text">Sign In</a>
								</p>
							</div>
							<button type="button"
								class="btn btn-outline-info waves-effect ml-auto"
								data-dismiss="modal" style="text-align: center">Close</button>
						</div>

					</div>
				</div>
			</div>
		</form>


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
					onsubmit="return checkMe()">
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
