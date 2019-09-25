<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2019/9/25
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>profile</title>
</head>
<body>
    <h1>Your Profile</h1>
    <c:out value="${spitter.username}"/><br>
    <c:out value="${spitter.firstName}"/><br>
    <c:out value="${spitter.lastName}"/><br>
</body>
</html>
