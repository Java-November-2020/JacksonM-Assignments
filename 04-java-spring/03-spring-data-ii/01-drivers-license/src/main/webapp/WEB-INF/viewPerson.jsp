<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head> <meta charset="ISO-8859-1"> 
<title>License</title> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script> 
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<link rel="stylesheet" type="text/css" href="style.css">
 </head>
<body>
<div class="container">
<h1> ${person.firstName} ${person.lastName }</h1>
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">License Number</label>
    <div class="col-sm-10">
      <input class="form-control" value="${person.license.getNumberAsString() }">
    </div>
  </div>
  
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">State</label>
    <div class="col-sm-10">
      <input class="form-control" value="${person.license.state}">
    </div>
  </div>
 
  <div class="form-group row">
    <label class="col-sm-2 col-form-label">Expiration Date</label>
    <div class="col-sm-10">
      <input class="form-control" value="${person.license.expiration_date }">
    </div>
  </div>
  
</div>
</body>
</html>