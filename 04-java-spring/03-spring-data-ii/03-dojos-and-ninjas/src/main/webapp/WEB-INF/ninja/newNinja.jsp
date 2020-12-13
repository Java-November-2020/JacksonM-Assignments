<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head> <meta charset="ISO-8859-1"> 
<title>New Ninja</title> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script> 
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<link rel="stylesheet" type="text/css" href="/css/style.css">
 </head>
<body>
<div class="container">
<h1>New Ninja</h1>
	<form:form method="POST" action="/ninjas/new" modelAttribute="ninja">
	<div class="form-group">
	<form:select class="form-control" path="dojo">
		<c:forEach items="${dojos}" var="dojo">
			<form:option value="${dojo.id}">${dojo.name}</form:option>
		</c:forEach>
	</form:select>
	</div>
	<div class="form-group">
		<form:label path="firstName">First Name
		<form:errors path="firstName"></form:errors>
		<form:input path="firstName"/>
		</form:label>
	</div>
	<div class="form-group">
		<form:label path="lastName">Last Name
		<form:errors path="lastName"></form:errors>
		<form:input path="lastName"/>
		</form:label>
	</div>
	<div class="form-group">
		<form:label path="age">Age
		<form:errors path="age"></form:errors>
		<form:input path="age"/>
		</form:label>
	</div>
	<button class="btn btn-primary">Create</button>
	</form:form>
	
</div>
</body>
</html>