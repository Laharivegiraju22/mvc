<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel = "stylesheet"
   type = "text/css"
   href = "userpage.css" />
</head>
<body>

	<form action="successful" method="post">
		<div class="container">
			<div class="row1">
				<div class="col-md-12">
					<h2>User Registration</h2>
				</div>
			</div>
			<div class="row2">
				<div class="col-md-12">
					Enter user name:<input type="text" name="userName" /> </br></br>Enter user
					emailId:<input type="text" name="email" /></br> <input type="submit"
						name="Register" />
				</div>
			</div>
		</div>


	</form>

</body>
</html>