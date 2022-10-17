<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br>
        Last name: <form:input path="lastName"/>
        <br>
        <form:select path="country">
            <form:option value="Brazil" label="Brazil"/>
            <form:option value="USA" label="USA"/>
            <form:option value="UK" label="UK"/>
            <form:option value="EU" label="EU"/>
        </form:select>
        <br>
        Favourite language:
        Java<form:radiobutton path="favouriteLanguage" value="Java"/>
        C#<form:radiobutton path="favouriteLanguage" value="C#"/>
        PHP<form:radiobutton path="favouriteLanguage" value="PHP"/>
        JS<form:radiobutton path="favouriteLanguage" value="JS"/>
        <br>
        <select:checkbox path="knowsEnglish" value="false"/>
        <br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
