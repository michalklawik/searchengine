<%--
  Created by IntelliJ IDEA.
  User: michalklawik
  Date: 16.12.17
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add-User-2</title>
</head>
<body>
<form action="/add-user-in-step" method="post">
    <input type="hidden" name="step" value="2">
    <label>Name:</label><input name="name" type="text"/><br/><br/>
    <label>Surname:</label><input name="surname" type="text"/><br/><br/>
    <label>Age:</label><input name="age" type="text"/><br/><br/>
    <input type="submit" name="add-user" value="next"/>
</form>
</body>
</html>
