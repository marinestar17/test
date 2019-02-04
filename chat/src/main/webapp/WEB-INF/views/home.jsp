<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h2>
	ㅎㅇ
</h2>
<c:if test="${sessionScope.mem != null }">
	<h3>${sessionScope.mem.userID}님 오심;</h3>
</c:if>
<table>
<c:if test="${sessionScope.mem == null }">
	<tr>
		<td>
			<form action="goLogin" method = "get">
				<input type = "submit" value = "로그인창으로">
			</form>
		</td>
		<td>
			<form action = "goJoin" method = "get">
				<input type = "submit" value = "회원가입">
			</form>
		</td>
	</tr>
</c:if>
	<tr>
		<td>
			<form action="goRoomList" method = "get">
				<input type = "submit" value = "채팅방 목록으로">
			</form>
		</td>
	</tr>
</table>
<font color = "blue"> ${join }</font>
</body>
</html>
