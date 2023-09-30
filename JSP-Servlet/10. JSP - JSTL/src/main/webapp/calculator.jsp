<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 9/29/2023
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        label {
            display: inline-block;
            width: 150px;
        }

        button {
            margin-left: 154px;
        }
    </style>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/calculator-servlet" method="POST">
    <fieldset>
        <legend>Calculator</legend>
        <label>First operand</label>
        <input type="text" name="number1">
        <br>
        <label>Operand</label>
        <select name="operator">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        <br>
        <label>Second operand</label>
        <input type="text" name="number2">
        <br>
        <button>Calculate</button>
    </fieldset>
</form>
    <c:if test="${result != null}">
        <h1>Result</h1>
        <h3>${number1} ${operator} ${number2} = ${result}</h3>
    </c:if>
</body>
</html>
