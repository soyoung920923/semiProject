<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	Welcome!
	<form action="/login" method="post" name="form">
		아이디: <input type="text" name="id"/><br>
		비밀번호: <input type="text" name="password"/><br>
		<input type="submit" name="submit"/>
	</form>	
	<a href="/join">회원가입</a>
	<div>test</div>
</body>
</html>