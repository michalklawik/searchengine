<%--
  Created by IntelliJ IDEA.
  User: michalklawik
  Date: 16.12.17
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add-User-1</title>
</head>
<body>
    <form action="/add-user-in-step" method="post">
        <input type="hidden" name="step" value="1">
        <label>ID:</label><input name="id" type="text"/><br/><br/>
        <label>Login:</label><input name="login" type="text"/><br/><br/>
        <input type="submit" name="add-user" value="next"/>
    </form>
</body>
</html>
