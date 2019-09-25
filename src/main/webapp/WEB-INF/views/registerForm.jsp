<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2019/9/25
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
    <h1>Register</h1>
    <form method="POST">
        First Name: <label><input type="text" name="firstName"/></label><br>
        Last Name: <label><input type="text" name="lastName"></label><br>
        Username: <label><input type="text" name="username"></label><br>
        Password: <label><input type="password" name="password"></label><br>
        Email: <label><input type="email" name="email"></label><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
