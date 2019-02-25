<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>환영합니다.</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<h1>회원가입</h1>
	<form action="insertAccountOwner" method="post">
	ID : <input type="text" name="id">
	PW : <input type="password" name="pw">
	<input type="submit" value="회원가입">
	</form>

</body>
</html>