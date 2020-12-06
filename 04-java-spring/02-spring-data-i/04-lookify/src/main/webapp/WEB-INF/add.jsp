<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head> <meta charset="ISO-8859-1"> 
<title>Add Song</title> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script> 
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<link rel="stylesheet" type="text/css" href="/css/style3.css">
 </head>
<body>
<div class="container">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item">
	        <a class="nav-link disabled" id="title" href="#">New Song:</a>
	      </li>
	    </ul>
	    <a class="navbar-brand" href="/dashboard">Dashboard</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
	  </div>
	</nav>
	
	<form:form method="POST" action="/newsong" modelAttribute="songs">
		<div class="form-group">
			<form:label path="title">Title
			<form:errors path="title"></form:errors>
			<form:input path="title" class="input"/>
			</form:label>
		</div>
		<div class="form-group">
			<form:label path="artist">Artist
			<form:errors path="artist"></form:errors>
			<form:input path="artist" class="input"/>
			</form:label>
		</div>
		<div class="form-group">
			<form:label path="rating">Rating (1-10)
			<form:errors path="rating"></form:errors>
			<form:input path="rating" class="input"/>
			</form:label>
		</div>
		<button>Add Song</button>
	</form:form>
	
</div>
</body>
</html>