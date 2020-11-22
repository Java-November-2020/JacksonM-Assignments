<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>
<link rel="stylesheet" type="text/css" href="css/style.css"> 
</head>
<body>
	<p>  Your Gold: <c:out value="${gold}"></c:out></p>
	<div class="structure">
		<form action="/findGold" method="post">
			<input type="hidden" value="farm" name="building">
			<h3>Farm</h3>
			<p>Earns: 10-20 Gold</p>
			<button>Find Gold!</button>
		</form>
	</div>
	<div class="structure">
		<form action="/findGold" method="post">
			<input type="hidden" value="cave" name="building">
			<h3>Cave</h3>
			<p>Earns: 5-10 Gold</p>
			<button>Find Gold!</button>
		</form>
	</div>
	<div class="structure">
		<form action="/findGold" method="post">
			<input type="hidden" value="house" name="building">
			<h3>House</h3>
			<p>Earns: 2-5 Gold</p>
			<button>Find Gold!</button>
		</form>
	</div>
	<div class="structure">
		<form action="/findGold" method="post">
			<input type="hidden" value="casino" name="building">
			<h3>Casino!</h3>
			<p>Earns/Takes: 0-50 Gold</p>
			<button>Find Gold!</button>
		</form>
	</div>
	<div class="activities">
		<p>Activities will go here:</p>
		<c:forEach items="${activity}" var= "act">
			<p class="${act.contains("lost")?"red":"green"}"><c:out value="${act}"></c:out></p>
		</c:forEach>
	</div>
</body>
</html>