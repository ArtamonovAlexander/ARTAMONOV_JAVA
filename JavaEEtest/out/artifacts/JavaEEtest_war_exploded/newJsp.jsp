<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 02.04.2019
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Page</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%@ page import="java.util.Date, logic.TestClass" %>
        <%
            TestClass testClass = new TestClass();
            Date time = new Date();
            for (int i = 0; i < 10 ; i++) {
                out.println("<p>" + "Текущее время: " + time  + "</p>");
            }
        %>
        <%=testClass.getInfo()%>
    </p>
</body>
</html>
