<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head> <meta charset="ISO-8859-1"> 
<title>Lookify!</title> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script> 
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container">

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="/newsong">Add New</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	    <a class="navbar-brand" href="/search/topTen">Top Songs</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <form class="form-inline" action="/search">
	      <input class="form-control mr-sm2" name="artist" type="text" placeholder="Search Artist" aria-label="Search" value="${artist}">
	      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
	  </form>
	</nav>
	
	<table class="table table-bordered table-striped">
	  <thead class="thead-dark">
	    <tr>
	      <th>Name</th>
	      <th>Rating</th>
	      <th>actions</th>
	    </tr>
	  </thead>
	  <tbody>
	   <c:forEach items="${songs}" var="song" >
	    <tr>
	      <th scope="row"><a href="/songs/${song.id}">${song.title}</a></th>
	      <td>${song.rating}</td>
	      <td><a href="">delete</a>
	    </tr>
	    </c:forEach>
	  </tbody>
	</table>
</div>	
</body>
</html>