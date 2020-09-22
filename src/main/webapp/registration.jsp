<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reg Page</title>
</head>
<body>
     <jsp:include page="menubar.jsp"></jsp:include>
      <h1> THIS IS registration.jsp PAGE</h1>
      <br/>
      <br/>
      ${regsuccessmsg}
      
      <form action="student" method="post">
          <input type="number" name="roll" placeholder="Enter ROLL" required>
          <br/><br/>
          <input type="text" name="name" placeholder="Enter NAME" required>
          <br/><br/>
          <input type="email" name="email" placeholder="Enter EMAIL" required>
          <br/><br/>
          <input type="password" name="password" placeholder="Enter PASSWORD" required>
          <br/><br/>
          <input type="text" name="grade" placeholder="Enter GRADE" required>
          <br/><br/>
          <input type="submit" value="REGISTER">
      </form>
</body>
</html>