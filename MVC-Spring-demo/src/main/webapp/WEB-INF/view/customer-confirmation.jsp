<%--
  Created by IntelliJ IDEA.
  User: VeselinFMI
  Date: 10/17/2022
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer confirmation</title>
</head>
<body>
    <h2>Customer is confirmed: ${customer.firstName} ${customer.lastName}</h2>
    <br>
    <h2>Customer has ${customer.freePasses} free passes</h2>
    <br>
    <h2>Postal code: ${customer.postalCode}</h2>
    <br>
    <h2>Course code: ${customer.courseCode}</h2>
</body>
</html>
