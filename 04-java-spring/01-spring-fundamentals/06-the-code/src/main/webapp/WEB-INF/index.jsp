<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Secret Code</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>

	<p><c:out value="${error}"></c:out></p>
	<h1>What is the code?</h1>
	<form method="POST" action="/code">
		<input type="text" name="code"><br>
		<button>Try Code</button>
	</form>
	
</body>
</html>