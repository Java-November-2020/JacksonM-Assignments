<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head> <meta charset="ISO-8859-1"> 
<title>Languages</title> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script> 
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
 </head>
<body>
<div class="container">
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th>Name</th>
      <th>Creator</th>
      <th>Version</th>
      <th>action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${allLang}" var="lang">
    <tr>
      <td><a href="/languages/${lang.id}">${lang.name}</a></td>
      <td>${lang.creator}</td>
      <td>${lang.currentVersion}</td>
      <td><a href="/languages/delete/${lang.id}">delete</a> <a href="/languages/edit/${lang.id}">edit</a></td>
    </tr>
   </c:forEach>
  </tbody>
</table><br>
<form:form method="POST" action="/languages" modelAttribute="language">
  <div class="form-group">
    <form:label path="name">Name
    <form:errors path="name"></form:errors>
    <form:input path="name"/>
    </form:label>
  </div>
  <div class="form-group">
    <form:label path="creator">Creator
    <form:errors path="creator"></form:errors>
    <form:input path="creator"/>
    </form:label>
  </div>
  <div class="form-group">
    <form:label path="currentVersion">Current Version
    <form:errors path="currentVersion"></form:errors>
    <form:input path="currentVersion"/>
    </form:label>
  </div>
  <button >Submit</button>
</form:form>
</div>
</body>
</html>