<%@ page import="java.time.LocalDateTime" %>
  Created by IntelliJ IDEA.
  User: ankit
  Date: 19-09-2023
  Time: 07:25 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Help</title>s
</head>
<body>
<%
    String name = (String) request.getAttribute("name");
    Integer id = (Integer) request.getAttribute("id");
    LocalDateTime time = (LocalDateTime) request.getAttribute("time");
%>
<h1>This is Help Page</h1>
    <h2>My name is <%= name %></h2>
    <h2> My id is <%= id %></h2>
<h1> Time is <%= time %></h1>
<script>
    window.onload = function() {
        setInterval(function() {
            let dateTime = new Date();
            document.getElementById("currentTime").innerHTML = dateTime.toLocaleString();
        }, 1000);
    };
</script>
<div id="currentTime"></div>
</body>
</html>
