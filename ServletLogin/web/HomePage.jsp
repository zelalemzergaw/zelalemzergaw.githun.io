<%--
  Created by IntelliJ IDEA.
  User: zelalem
  Date: 6/13/2019
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome page</title>
</head>
<body>
<div class="my-div">
<h1>Welcome <%=session.getAttribute("username")%></h1><br>
<a href="logout">Logout</a>
</div>
</body>
</html>
