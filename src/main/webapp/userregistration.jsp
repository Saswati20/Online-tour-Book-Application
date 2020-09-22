<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reg page</title>
</head>
<body>
<header><jsp:include page="menubar.jsp"></jsp:include></header>

${regsucessmsg}
	<form action="register" method="post"><br><br>
	<input type="text" name="name" placeholder="Enter NAME" required><br><br>
	<input type="email" name="email" placeholder="Enter E-mail" required><br><br>
	<input type="tel" name="mobileno" placeholder="Enter Mobile No" required><br><br>
	<input type="password" name="password" placeholder="Enter PASSWORD" required><br><br>
	<input type="submit" value="REGISTER">
	</form>
</body>
</html>