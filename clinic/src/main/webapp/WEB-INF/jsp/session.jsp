<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<body>
<form action="test" method="post">
	Jump Success!display data by session.<br>
	<input type="text" name="display" value="${sessionScope.display}">
</form>
</body>
</html>