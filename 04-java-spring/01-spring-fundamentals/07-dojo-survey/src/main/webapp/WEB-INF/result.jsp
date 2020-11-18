<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
<link rel="stylesheet" href="css/result.css" >
</head>
<body>
	<form action="/">
	<h1>Submitted Info</h1>
	<div>
		<label>Name:</label>
		<span id="name"><c:out value="${name}"></c:out><br></span>
		<label>Dojo Location:</label>
		<span id="location"><c:out value="${location}"></c:out><br></span>
		<label>Favorite Language: </label>
		<span id="language"><c:out value="${language}!!!"></c:out><br></span>
		<label>Comment:</label>
		<span id="comment"><c:out value="${comment}"></c:out><br></span>
		<input type="submit" value="Go Back">
	</div>
	</form>
</body>
</html>