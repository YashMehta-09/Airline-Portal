<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">



<head>

	<meta charset="utf-8">

	<meta http-equiv="X-UA-Compatible" content="IE=edge">

	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->



	<title>Booking Form HTML Template</title>



	<!-- Google font -->

	<link href="https://fonts.googleapis.com/css?family=PT+Sans:400" rel="stylesheet">



	<!-- Bootstrap -->

	<link type="text/css" rel="stylesheet" href="css3/bootstrap.min.css" />



	<!-- Custom stlylesheet -->

	<link type="text/css" rel="stylesheet" href="css3/style.css" />



	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->

	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

	<!--[if lt IE 9]>

		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>

		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

		<![endif]-->



</head>



<body>

    <%int passenger=(Integer)session.getAttribute("passenger");

System.out.println(passenger);

%>

	<div id="booking" class="section">

		<div class="section-center">

			<div class="container">

				<div class="row">

					<div class="booking-form">

                        <h1 style="color: #f23e3e">Add Passenger Details</h1>

 						<form action="TicketGenerateController" method="post">

                            <%for(int i=0;i<passenger;i++)

							{

							%>
							<center>
                            <span style="color:white">Passenger <%=i+1%></span>
							</center>
							<div class="form-group">

								<div align="center">

									<div class="form-check form-check-inline">
									
									  <input type="radio" class="form-check-input" id="salutation<%=i+1%>" name="salutation<%=i+1%>" value="Mr.">
									  <label class="form-check-label" for="materialInline" style="color:white">Mr.</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									
									
									  <input type="radio" class="form-check-input" id="salutation<%=i+1%>" name="salutation<%=i+1%>" value="Mrs.">
									  <label class="form-check-label" for="materialInline" style="color:white">Mrs.</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																		
									
									  <input type="radio" class="form-check-input" id="salutation<%=i+1%>" name="salutation<%=i+1%>" value="Miss.">
									  <label class="form-check-label" for="materialInline" style="color:white">Miss.</label>
									  
									</div>
									
								</div>

							</div>

							<div class="row">

								<div class="col-md-6">

									<div class="form-group">

										<span class="form-label">FirstName</span>

 										<input class="form-control" type="text" placeholder="Enter your Firstname" name="firstname<%=i+1%>">

									</div>

								</div>

								<div class="col-md-6">

									<div class="form-group">

										<span class="form-label">LastName</span>

										<input class="form-control" type="text" placeholder="Enter Your Lastname" name="lastname<%=i+1%>">

									</div>

								</div>

							</div>

							

                           

                            <%} %>

                            

							<div class="row">

								

								<div class="col-md-3">

 									<div class="form-btn">

                                       

										<button class="submit-btn" name="Book">Book Now</button>

                                            

									</div>

								</div>

                                    

							</div>

                                

						</form>

					</div>

				</div>

			</div>

		</div>

	</div>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->



</html>

