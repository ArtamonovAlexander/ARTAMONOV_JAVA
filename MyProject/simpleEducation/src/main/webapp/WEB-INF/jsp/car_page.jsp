<%--<%@ page import="ru.itpark.models.User" %>--%>
<%--<%@ page import="java.util.List" %>--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        <%@include file="/WEB-INF/css/style.css"%>
    </style>
</head>
<body>
<div>
    <form action = "/car" method="post">
        <input type="text" name="nameUser">
        <input type="text" name="model">
        <input type="text" name="number">
        <input type="submit" name="Add" >
    </form>
</div>
<div>
    <table>
        <tr>
            <th>id</th>
            <th>Owner Name</th>
            <th>Model Car</th>
            <th>Number Car</th>
        </tr>
        <c:forEach items="${cars}" var="car">
            <tr>
                <td>${car.id}</td>
                <td>${car.nameUser}</td>
                <td>${car.model}</td>
                <td>${car.number}</td>
            </tr>
        </c:forEach>
        <%--<%--%>
            <%--List<User> users = (List<User>) request.getAttribute("users");--%>
            <%--for (User user : users) {--%>
        <%--%>--%>
        <%--<tr>--%>
            <%--<td><%=user.getId()%>--%>
            <%--</td>--%>
            <%--<td><%=user.getFirstName()%>--%>
            <%--</td>--%>
            <%--<td><%=user.getLastName()%>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<%--%>
            <%--}--%>
        <%--%>--%>
    </table>
</div>
</body>
</html>
