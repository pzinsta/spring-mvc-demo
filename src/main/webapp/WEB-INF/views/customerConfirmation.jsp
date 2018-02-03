<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer confirmation</title>
</head>
<body>
    <h1>Customer confirmation</h1>
    <p>The customer is confirmed: ${customer.firstName} ${customer.lastName}</p>
    <p>Free passes: ${customer.freePasses}</p>
    <p>Postal code: ${customer.postalCode}</p>
    <p>Course code: ${customer.courseCode}</p>
</body>
</html>