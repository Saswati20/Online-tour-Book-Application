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

${errmsg}
<form action="adminlogincheck">
 <input type="text" name="userid" placeholder="Enter UID" required>
 <input type="password" name="password" placeholder="Enter Password" required>
 <input type="submit" value="LOGIN">
</form>
</body>
</html>