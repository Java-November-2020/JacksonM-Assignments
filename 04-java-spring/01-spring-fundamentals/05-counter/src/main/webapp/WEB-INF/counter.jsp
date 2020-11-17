<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current visit count</title>
<link rel="stylesheet" type="text/css" href= "css/counter.css">
</head>
<body>
	<h1>You have visited localhost:8080 ${currentCount} times</h1>
	<a href="/">Test another visit?</a>
</body>
</html>