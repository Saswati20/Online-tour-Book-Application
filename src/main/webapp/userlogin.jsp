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

${msg}

<form action="searchuserbyemail">
	<input type="email" name="email" placeholder="Enter E-mail" required><br><br>
	<input type="password" name="password" placeholder="Enter PASSWORD" required><br><br>
	<input type="submit" value="LOGIN">
</form>
</body>
</html>