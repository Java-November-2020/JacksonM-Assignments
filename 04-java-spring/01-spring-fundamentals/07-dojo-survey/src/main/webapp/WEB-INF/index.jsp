<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
<link rel="stylesheet" href="css/dojosurvey.css" >
</head>
<body>
	<form method="POST" action="/result">
	  <label for="name">Your Name:</label>
	  <input type="text" id="name" name="name"><br><br>
	  
	  <label for="location">Dojo Location:</label>
		<select name="location" id="location">
		  <option value="San Jose">San Jose</option>
		  <option value="New York">New York</option>
		  <option value="New Jersey">New Jersey</option>
		  <option value="Arizona">Arizona</option>
		</select><br><br>
		
		<label for="language" >Favorite Language:</label>
		<select id="language" name="language">
		  <option value="Python">Python</option>
		  <option value="Java">Java</option>
		  <option value="MERN">MERN</option>
		  <option value="APEX">APEX</option>
		</select><br><br>
		
		<label for="comment">Comment (optional):</label><br>
		<textarea rows="10" cols="30" name="comment" id="comment"></textarea><br><br>
	  <input type="submit" value="Button">
	</form> 
</body>
</html>