<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 9/30/2023
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Vietnamese Dictionary</h2>
    <form action="simple-dictionary-servlet" method="post">
        <input type="text" name="search" placeholder="Enter your word: "/>
        <input type = "submit" id = "submit" value = "Search"/>
    </form>
    <c:if test="${result != null}">
        <h1>Search: ${search}</h1>
        <h1>Result: ${result}</h1>
    </c:if>
</body>
</html>
