<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menubar.jsp"></jsp:include>

<hr>


	<form action="adminaddtour" method="post">
		<input type="text" name="tour_to" placeholder="PLACE NAME TO" required><br><br>
		<input type="text" name="tour_from" placeholder="PLACE NAME FROM" required><br><br>
		<input type="text" name="duration" placeholder="How Many DAY OR NIGHT" required><br><br>
		<input type="text" name="description" placeholder="SOMETHING ABOUT THAT PLACE" required><br><br>
		<input type="text" name="date" placeholder="dd/mm/yyyy" required><br><br>
		<input type="tel" name="fare" placeholder="Enter Fare" required>
		
		<input type="submit" value="ADD">
	</form>
	<br>
		${msg}

</body>
</html>