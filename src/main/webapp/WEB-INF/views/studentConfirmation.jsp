<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student confirmation</title>
</head>
<body>
    <h1>Student confirmation</h1>
    <p>The student is confirmed: ${student.firstName} ${student.lastName}</p>
    <p>Country: ${student.country}</p>
    <p>Favorite programming language: ${student.favoriteLanguage}</p>
    <p>Operating systems:</p>
    <ul>
        <c:forEach items="${student.operatingSystems}" var="operatingSystem">
            <li>${operatingSystem}</li>
        </c:forEach>
    </ul>

</body>
</html>