<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 9/30/2023
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="currency-converter-servlet" method="post">
  <label>Rate: </label><br/>
  <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
  <label>USD: </label><br/>
  <input type="text" name="usd" placeholder="USD" value="0"/><br/>
  <input type = "submit" id = "submit" value = "Converter"/>
</form>

  <c:if test="${result != null}">
    <h1>Rate: ${rate}</h1>
    <h1>USD: ${usd}</h1>
    <h1>Result: ${result}</h1>
  </c:if>



</body>
</html>
