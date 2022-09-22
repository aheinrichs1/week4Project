<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message Display</title>
</head>
<body>
	<h1>Enter parameters for your message</h1>
	<form action="getMessageServlet" method="post">
		Message: <input type="text" name="userMessage" size="10"><br />
		Size: <input type="number" name="userSize" value="12" size="10" min="1" max="300"><br />
		Color: <input type="color" name="userColor" value="#000000" size="100"><br />
		Font: <select name="userFont">
	    	<option value="Arial" selected>Arial</option>
	    	<option value="Verdana">Verdana</option>
	    	<option value="Tahoma">Tahoma</option>
	    	<option value="Trebuchet MS">Trebuchet MS</option>
	    	<option value="Times New Roman">Times New Roman</option>
	    	<option value="Georgia">Georgia</option>
	    	<option value="Garamond">Garamond</option>
	    	<option value="Courier New">Courier New</option>
	    	<option value="Brush Script MT">Brush Script MT</option>
	  	</select><br />
		<input type="submit" value="Submit" />
	</form>
	<br /><a href="index.jsp">Return to the index</a>
</body>
</html>