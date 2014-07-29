<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list page</title>
</head>
<body>
	<center>
	    	사용자${sessionScope.id}
		<table border="1">
			<tr>
				<th>아이디</th>
				<th>이름&nbsp;&nbsp;름</th>
				<th>역&nbsp;&nbsp;활</th>
			</tr>
			<tr>			
			<c:forEach items="${requestScope.userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td><a href='view.do?id=${user.id}'>${user.name}</a></td>
				<td>${user.role}</td>
			</tr>			
			</c:forEach>
			</tr>			
		</table>
		<a href="input.do">사용자등록</a>
		<a href="logout.do">로그아웃</a>
				
	</center>
</body>
</html>