<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello world form</title>
</head>
<body>

    <h1>Hello World form</h1>

    <form action="hello/process-form-with-request-param" method="POST">
        <input type="text" name="studentName" placeholder="What's your name?">
        <input type="submit">
    </form>

</body>
</html>