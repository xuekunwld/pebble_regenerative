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
	<input type="text" name="target">
	<input type="submit" name="insert" value="Insert">
	結果：${sessionScope.message}
	<br>
	<input type="submit" name="jumpToSession" value="JumpToSession">
	<input type="submit" name="jumpToForm" value="JumpToForm">
</form>
</body>
</html>