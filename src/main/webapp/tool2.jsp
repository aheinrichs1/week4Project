<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Math Tool</title>
</head>
<body>
	<h1>Please enter 2 numbers and the operation between them</h1>
	<form action="getMathServlet" method="post">
		<input type="text" name="userNumber1" size="10">
		<select name="userOperation">
	    	<option value="add" selected>Added to</option>
	    	<option value="minus">Subtracted by</option>
	    	<option value="multiply">Multiplied by</option>
	    	<option value="divide">Divided by</option>
	  	</select>
	  	<input type="text" name="userNumber2" size="10">
	  	<input type="submit" value="Equals" />
	</form>
	<br /><a href="index.jsp">Return to the index</a>
</body>
</html>