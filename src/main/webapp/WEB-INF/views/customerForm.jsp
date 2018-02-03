<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer form</title>

<style type="text/css">
.error {
    color: red;
}
</style>
</head>
<body>

    <h1>Customer form</h1>

    <p>Fill out the form. * means the field is required.</p>

    <form:form action="process-form" modelAttribute="customer">
    First name: <form:input path="firstName" />
        <br>
    Last name (*): <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />

        <br>
    
    Free passes: <form:input path="freePasses" />
        <form:errors path="freePasses" cssClass="error" />
        <br>
        <input type="submit">
    </form:form>

</body>
</html>