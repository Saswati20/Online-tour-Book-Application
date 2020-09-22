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
   <br/>
   <form action="searchstudentbyemail">
       <input type="email" name="email" placeholder="ENTER EMAIL" required>
       <input type="submit" value="SEARCH">
   </form>
  
</body>
</html>