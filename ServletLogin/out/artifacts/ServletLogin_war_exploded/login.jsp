<%--
  Created by IntelliJ IDEA.
  User: Jean Eric Ndahimana
  Date: 6/12/2019
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Login</title>
    <style>
        .my-div{
            width:800px;
            height: 400px;
            margin:0 auto;
            border: solid black 2px;
            border-radius: 15px;
            padding: 40px;
        }
        h3{
            color:red;
        }
    </style>
</head>
<body>

<%
    Cookie[] cookies = request.getCookies();
    String userName = "", password = "", rememberVal = "";
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("cookuser")) {
                userName = cookie.getValue();
            }
            if (cookie.getName().equals("cookpass")) {
                password = cookie.getValue();
            }
            if (cookie.getName().equals("cookrem")) {
                rememberVal = cookie.getValue();
            }
        }
    }
%>
<div class="my-div">
    <h1>Login</h1>
    <hr>
    <form action="login" method="post">
        <label>User Name:</label><br>
        <input type="text" name="loginname" value="<%=userName%>"><br>
        <label>Password:</label><br>
        <input type="password" name="password" value="<%=password%>"><br>
        <input type="checkbox" name="remember" value="1"
            <%="1".equals(rememberVal.trim())?"checked =checked":"" %>
        ><label>Remember me</label><br>
        <input type="submit" value="Login">
    </form>
    <h3>
        <%
            if (null != request.getAttribute("errorMessage")) {
                out.println(request.getAttribute("errorMessage"));
            }
        %></h3>
</div>
</body>
</html>
