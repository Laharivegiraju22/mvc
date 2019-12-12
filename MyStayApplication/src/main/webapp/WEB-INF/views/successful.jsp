<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Select location</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="booking" method="get">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h2>successful registration</h2>
					<h3>user details are:</h3></br>
					<table>

						<c:forEach items="users" var="user">
							<tr>
								<td><c:out value="user.userId"></c:out></td>
								<td><c:out value="user.userName"></c:out></td>
								<td><c:out value="user.email"></c:out></td>
							</tr>
						</c:forEach>

					</table>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<select class="location">
						<option value="vizag">vizag</option>
						<option value="hyderabad">hyderabad</option>
						<option value="bhubaneshwar">bhubaneshwar</option>
					</select> <select class="roomType">
						<option value="semi-luxury">semi-luxury</option>
						<option value="luxury">luxury</option>
						<option value="budget">budget</option>
					</select> <input type="submit" value="select" />
				</div>
			</div>
		</div>
	</form>
</body>
</html>