<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/quiz.css" />
<script async type="text/javascript" src="https://www.scales-chords.com/api/scales-chords-api.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Question ${i + 1}</h1>
	<h2>What chord is this?</h2>
	<div class="center">
		<img src="/images/A-quiz.png" >
		<ins class="scales_chords_api" chord="A" instrument="piano" output="sound"></ins>
	</div>
	<div class="links">
		<a href="/" >Home</a>
		<a href="/next/${i + 1}" >Next Question</a>
	</div>
</body>
</html>