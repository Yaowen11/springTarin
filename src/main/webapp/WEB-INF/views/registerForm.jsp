<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2019/9/25
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>register</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
    <h1>Register</h1>
    <sf:form method="POST" commandName="spitter">
        First Name: <sf:input path="firstName"/><br>
            <sf:errors path="firstName" cssClass="error"/><br>
        Last Name: <label><sf:input path="lastName"/><br>
            <sf:errors path="lastName" cssClass="error"/><br>
        Username: <label><sf:input path="username"/></label><br>
            <sf:errors path="username" cssClass="error"/><br>
        Password: <sf:password path="password"/><br>
            <sf:errors path="password" cssClass="error"/><br>
        Email: <label><sf:input type="email" path="email"/></label><br>
        <input type="submit" value="Register">
    </sf:form>
</body>
</html>
