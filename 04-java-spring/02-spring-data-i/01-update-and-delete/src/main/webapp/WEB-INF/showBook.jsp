<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head> <meta charset="ISO-8859-1"> 
<title>Show Book</title> 
<link rel="stylesheet" href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" /> 
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script> 
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
</head>
<body>
<div class="container">
	<table class="table">
	  <thead class="thead-dark">
	    <tr>
			<th>Title</th>
			<th>Description</th>
			<th>Language</th>
			<th>Number of Pages</th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
			<td><c:out value="${book.title}"/></td>
			<td><c:out value="${book.description}"/></td>
			<td><c:out value="${book.language}"/></td>
			<td><c:out value="${book.numberOfPages}"/></td>
	    </tr>
	  </tbody>
	</table>
</div>
</body>
</html>