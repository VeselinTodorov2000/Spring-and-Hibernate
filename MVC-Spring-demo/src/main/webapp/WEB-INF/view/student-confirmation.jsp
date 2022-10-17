<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
    The student is confirmed: ${student.firstName} ${student.lastName} <br>
    It is from: ${student.country} <br>
    Favourite language: ${student.favouriteLanguage} <br>
    Knows english: ${student.knowsEnglish}
</body>
</html>
