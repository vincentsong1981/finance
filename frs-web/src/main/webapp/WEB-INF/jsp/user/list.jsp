<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<a href="add">添加用户</a><br>
	<table>
		<c:forEach items="${users}" var="user">
			<tr>
				<td><a href="${user.id}">${user.name}</a></td>
				<td>${user.email}</td>
				<td><a href="${user.id}/update">修改</a></td>
				<td><a href="${user.id}/delete">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>