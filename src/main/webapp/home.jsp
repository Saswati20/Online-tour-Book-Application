<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
	<h1>INSIDE OF HOME PAGE</h1>
	
		<table border="1">
		<tr>
			<th>PLACE FROM</th>
			<th>PLACE TO</th>
			<th>DURATION</th>
			<th>DESCRIPTION</th>
			<th>DATE</th>
			<th>FARE</th>
		</tr>
<c:forEach var="obj" items="${tour}">
		<tr>
			<td>${obj.tour_from}</td>
			<td>${obj.tour_to}</td>
			<td>${obj.duration}</td>
			<td>${obj.description}</td>
			<td>${obj.date}</td>
			<td>${obj.fare}</td>
		</tr>
</c:forEach>
	</table>
</body>
</html>