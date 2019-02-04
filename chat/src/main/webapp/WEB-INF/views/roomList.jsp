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
<h2>방 리스트;</h2>
<hr>
<table>
	<tr>
		<td width = "8%">[방번호]</td>
		<td width = "12%">[방장ID]</td>
		<td width = "20%">[방제]</td>
		<td width = "15%">[생성날짜]</td>
	</tr>
<c:forEach var = "r" items = "${rList }">
	<tr>
		<td>${r.roomseq }</td>
		<td>${r.userID }</td>
		<td><a href ="roomDetail?roomseq=${r.roomseq}">${r.name }</a></td>
		<td>${r.indate }</td>
	</tr>
</c:forEach>
</table>
<hr>

<table>
	<tr>
		<td>
			<form action="goMakeRoom" method = "get">
				<input type = "submit" value = "방만들기">
			</form>
		</td>
	</tr>
</table>
</body>
</html>