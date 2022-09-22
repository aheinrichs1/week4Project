<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Math Result</title>
</head>
<body>
	<h1>
		${userMathOp.getNum1()} 
		${userMathOp.returnOperatorSymbol()} 
		${userMathOp.getNum2()} = 
		${userMathOp.doOperation()} 
	</h1>
	<a href="tool2.jsp">Try a new math operation</a><br />
	<a href="index.jsp">Return to the index</a>
</body>
</html>