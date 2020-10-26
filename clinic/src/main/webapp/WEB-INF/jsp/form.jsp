<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<body>
<form:form method="post" action="/test" modelAttribute="form">
	Jump Success!display data by form class.<br>
	<form:input type="text" path="display" />
</form:form>
</body>
</html>