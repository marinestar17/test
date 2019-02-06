<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${room.userID }님이 만든 방</h2>
<hr>
<table>
<c:forEach var = "cList" items = "${cList }">
	<tr>
		<td width = "10%">${cList.userID} : </td>
		<td width = "20%">${cList.message }</td>
		<td width = "10%"> ${cList.indate } </td>
	</tr>
</c:forEach>
</table>
<hr>

<form action="insertChat" method = "post">
	<input type = "hidden" name = "roomseq" value = "${room.roomseq }">
	<input type = "hidden" name = "userID" value = "${sessionScope.mem.userID }">
	<input type = "text" name = "message">
	<input type = "submit" value = "확인">
</form>

<form action="returnList" method ="get">
	<input type = "submit" value = "목록으로">
</form>
</body>
</html>