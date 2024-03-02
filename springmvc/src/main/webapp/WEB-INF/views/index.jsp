<%--
  Created by IntelliJ IDEA.
  User: ankit
  Date: 18-09-2023
  Time: 07:11 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<%
    String name = (String) request.getAttribute("name");
%>

<h1>This is home page</h1>
<h1>Called by /home</h1>
<h1>My name is <%= name %>
<h1>My name is <%= name %>
</h1>
</body>
</html>
