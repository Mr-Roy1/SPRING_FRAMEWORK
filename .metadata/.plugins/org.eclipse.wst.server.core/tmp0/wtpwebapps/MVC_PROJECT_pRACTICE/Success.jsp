<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<body bgcolor="yellow">
<h1>Registration successfull</h1>
<% 
  String un=(String)request.getAttribute("Username");
  
 %>
 <font color="red" size=5>Registered username is <%= un %></font>

</body>
</html>