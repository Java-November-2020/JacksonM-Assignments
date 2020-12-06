<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head> <meta charset="ISO-8859-1"> 
<title>Search</title> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script> 
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<link rel="stylesheet" type="text/css" href="/css/style4.css">
 </head>
<body>
<div class="container">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item">
	        <a class="nav-link disabled" id="songs" href="#">Songs by artist: ${artist}</a>
	      </li>
	    </ul>
	  <form class="form-inline" action="/search">
	      <input class="form-control mr-sm2" name="artist" type="text" placeholder="Search Artist" aria-label="Search" value="${artist}">
	      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
	  </form>
	  </div>
	  <a class="navbar-brand" id="dashboard" href="/dashboard">Dashboard</a>
		<button class="navbar-toggler"  type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
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
	   <c:forEach items="${models}" var="model" >
	    <tr>
	      <th scope="row"><a href="/songs/${model.id}">${model.title}</a></th>
	      <td>${model.rating}</td>
	      <td><a href="">delete</a>
	    </tr>
	   </c:forEach>
	  </tbody>
	</table>
</div>
</body>
</html>