<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Page</title>
</head>
<body>
创建用户
	<div>
		<form:form method="post" modelAttribute="userForm">
			<table>
				<tr>
					<td>用户名：</td>
					<td><form:input path="username"/><form:errors path="username"></form:errors></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><form:password path="password" /><form:errors path="password"></form:errors></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="创建" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>