<%@ page import="java.util.Date" %>
<%@ page import="codegym.nkd.demo.Student" %><%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 9/28/2023
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login-servlet" method="POST">
    <input type="text" name="username">
    <input type="text" name="password">
    <%
        String username = request.getParameter("username");
        Date date = (Date) request.getAttribute("loginTime");
    %>
    <%!int x = 5;%>

    <h1><%=username%></h1>
    <h1>${loginTime}</h1>
    <h1>AAAA${date}</h1>
    <h1>${student.getName()}</h1>
    <h1>BBBB<%=date%></h1>

    <c:forEach items="${list}" var="item">
        <h1>${item.getName()}</h1>
        <img src="" alt="">
    </c:forEach>
    <button>Login</button>
</form>
</body>
</html>
