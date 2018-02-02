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

        <form:select path="country">
            <form:option value="BR" label="Brazil" />
            <form:option value="GER" label="Germany" />
            <form:option value="FR" label="France" />
            <form:option value="IT" label="Italy" />
        </form:select>

        <div>
            Java <form:radiobutton path="favoriteLanguage" value="Java"/>
            PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
            C# <form:radiobutton path="favoriteLanguage" value="C#"/>
            Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
        </div>
        
        <div>
            Linux <form:checkbox path="operatingSystems" value="Linux"/>
            Mac OS <form:checkbox path="operatingSystems" value="Mac"/>
            MS Windows <form:checkbox path="operatingSystems" value="Windows"/>
        </div>
        
        <input type="submit">
    </form:form>
</body>
</html>