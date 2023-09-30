<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>

<form action="/login-servlet" method="POST">
  <input type="text" name="username">
  <input type="text" name="password">
  <button>Login</button>
</form>

<h2>Currency Converter</h2>
<form action="/converter-servlet" method="post">
  <label>Rate: </label><br/>
  <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
  <label>USD: </label><br/>
  <input type="text" name="usd" placeholder="USD" value="0"/><br/>
  <input type = "submit" value = "Converter"/>
</form>

<h2>Vietnamese Dictionary</h2>
<form action="/translate-servlet" method="get">
  <input type="text" name="txtSearch" placeholder="Enter your word: "/>
  <input type = "submit" value = "Search"/>
</form>

<h2>Product Discount Calculator</h2>
<form action="/discount-servlet" method="post">
  <input type="text" name="description" placeholder="Enter your word: "/>
  <input type="text" name="price" placeholder="Enter your word: "/>
  <input type="text" name="discount" placeholder="Enter your word: "/>
  <input type = "submit" value = "Search"/>
</form>

<br/>
<a href="hello-servlet">Hello Servlet</a>
<a href="time-servlet">Time Servlet</a>
<a href="login-servlet">Login</a>

</body>
</html>