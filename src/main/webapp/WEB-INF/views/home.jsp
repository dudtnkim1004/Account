<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Main Menu</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<h1> Main Menu </h1>
	
	<c:if test="${sessionScope.loginid==null}">
	
	<form action="login" method="post">
		ID : <input type="text" name="id"><br>
		PW : <input type="password" name="pw"><br>
		<input type="submit" name="login" value="로그인"><br>
	</form>
	
	<form action="signup" method="post">
		<input type="submit" name="signup" value="회원가입"><br>
	</form>
	</c:if>
	
	<c:if test="${sessionScope.loginid!=null}">
	<h2>${sessionScope.loginid}님 환영합니다.</h2>
	<form action="login" method="post">
		ID : <input type="text" name="id"><br>
		PW : <input type="password" name="pw"><br>
		<input type="submit" name="login" value="로그인"><br>
	</form>
	
	<form action="signup" method="post">
		<input type="submit" name="signup" value="회원가입"><br>
	</form>
	</c:if>
		
</body>
</html>
