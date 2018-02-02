<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student form</title>
</head>
<body>
    <h1>Student form</h1>

    <form:form action="process-form" modelAttribute="student">

        <div>
            First name:
            <form:input path="firstName" />
        </div>
        <div>
            Last name:
            <form:input path="lastName" />
        </div>
        
        <input type="submit">
    </form:form>
</body>
</html>