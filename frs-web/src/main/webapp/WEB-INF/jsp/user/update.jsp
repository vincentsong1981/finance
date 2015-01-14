<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<div>
		<form:form  method="post" modelAttribute="user">
			<table>
				<tr>
					<td>用户名：</td>
					<td><form:input path="name"/><form:errors path="name"></form:errors></td>
				</tr>
				<!-- <tr>
					<td>密码：</td>
					<td><form:password path="encryptedpassword" /><form:errors path="encryptedpassword"></form:errors></td>
				</tr>  -->
				<tr>
					<td>邮件：</td>
					<td><form:input path="email" /><form:errors path="email"></form:errors></td>
				</tr>
				<tr>
					<td>手机：</td>
					<td><form:input path="mobile" /><form:errors path="mobile"></form:errors></td>
				</tr>
				<tr>
					<input type="hidden" name="id" value="${user.id}"/>
				<tr>
					<td colspan="2"><input type="submit" value="保存更新" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>