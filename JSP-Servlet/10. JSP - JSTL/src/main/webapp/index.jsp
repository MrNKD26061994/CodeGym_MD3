<%@ page import="java.util.List" %>
<%@ page import="codegym.nkd.model.Customer" %>
<%@ page import="java.util.ArrayList" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div>
    <%
        List<Customer> list = new ArrayList<>();
        Customer c1 = new Customer(1, "Duy", "26/06/1994", "Hà Nội", "https://static-images.vnncdn.net/files/publish/2022/9/3/bien-vo-cuc-thai-binh-346.jpeg");
        Customer c2 = new Customer(2, "Khánh", "28/08/1996", "Hà Nội", "https://hinhanhdephd.com/wp-content/uploads/2015/12/hinh-anh-dep-girl-xinh-hinh-nen-dep-gai-xinh.jpg");
        Customer c3 = new Customer(3, "Nguyễn", "15/06/1998", "Hà Nội", "https://hinhnendepnhat.net/wp-content/uploads/2016/09/hinh-nen-girl-xinh-cho-may-tinh-full-hd.jpg");
        list.add(c1);
        list.add(c2);
        list.add(c3);
    %>
    <h1>Danh sách khách hàng</h1>
    <table>
        <tr>
            <th>Tên</th>
            <th>Ngày sình</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>

        <c:forEach items="<%= list%>" var="item">
            <tr>
                <td>${item.name}</td>
                <td>${item.date}</td>
                <td>${item.address}</td>
                <td>
                    <img src="${item.img}" alt="">
                </td>
            </tr>
        </c:forEach>
    </table>

    <a href="calculator-servlet">Calculator</a>
    <br>
    <a href="currency-converter-servlet">Currency Converter</a>
    <br>
    <a href="simple-dictionary-servlet">Simple Dictionary</a>
</div>
</body>
</html>