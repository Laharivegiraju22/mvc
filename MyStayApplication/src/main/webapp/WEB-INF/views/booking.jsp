<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book select hotel and room</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<table>
					<c:forEach items="hotels" var="hotel">
						<tr>
							<td><c:out value="hotel.hotelId"></c:out></td>
							<td><c:out value="hotel.hotelName"></c:out></td>
							<td><c:out value="hotel.location"></c:out></td>
					</c:forEach>
				</table>
				<select class="room">
					<option value="vizag">vizag</option>
					<option value="hyderabad">hyderabad</option>
					<option value="bhubaneshwar">bhubaneshwar</option>
				</select>

			</div>
		</div>
	</div>
</body>
</html>