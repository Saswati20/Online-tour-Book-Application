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
   <form action="searchstudent">
       <input type="number" name="roll" placeholder="ENTER ROLL" required>
       <input type="submit" value="SEARCH">
   </form>
   
   <br/>
   <br/>
   ${msg}
   
   <table border="1">
       <tr>
         <th> ROLL </th>
         <th> NAME </th>
         <th> EMAIL </th>
         <th> GRADE </th>
      </tr>
      
      <tr>
         <td>${stinfo.roll}</td>
         <td>${stinfo.name}</td>
         <td>${stinfo.email}</td>
         <td>${stinfo.grade}</td>
         <td><a href="/deletestudent?roll=${stinfo.roll}">DELETE</a></td>
      </tr>
   
   </table>
   
</body>
</html>