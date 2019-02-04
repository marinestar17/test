<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>방 만들기;</h2>

<form action="makeRoom" method = "post">
	[방장] : ${sessionScope.mem.userID} <br>
	<input type = "hidden" name = "userID" value = ${sessionScope.mem.userID }>
	[방제] : <input type = "text" name = "name"> <br>
	<input type = "submit" value = "만들기">
</form>
</body>
</html>