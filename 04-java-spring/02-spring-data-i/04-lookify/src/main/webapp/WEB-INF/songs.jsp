<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head> <meta charset="ISO-8859-1"> 
<title>Details</title> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script> 
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<link rel="stylesheet" type="text/css" href="/css/styles.css">
</head>
<body>
<div class="container">
	<a class="navbar-brand" id="dashboard" href="/dashboard">Dashboard</a>
	<button class="navbar-toggler mr-sm-2" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon my-2 my-sm-0"></span>
	</button>

	<div id="form"> 
		<div class="form-group row">
		    <label for="title" class="col-sm-2 col-form-label">Title</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control no-border" value="${song.title }">
		    </div>
		</div>
		<div class="form-group row">
		    <label for="artist" class="col-sm-2 col-form-label">Artist</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control no-border" value="${song.artist }">
		    </div>
		</div>
		<div class="form-group row">
		    <label for="artist" class="col-sm-2 col-form-label">Rating (1-10)</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control no-border" value="${song.rating }">
		    </div>
		</div>
		
		<div id="delete">
			<nav class="navbar">
			  <a class="navbar-brand" href="#!">Delete</a>
			</nav>
		</div>
	</div>
	
</div>
</body>