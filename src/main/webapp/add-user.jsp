<%--
  Created by IntelliJ IDEA.
  User: michalklawik
  Date: 02.12.17
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <form action="/add-user" method="post">
        <label>ID:</label><input name="id" type="text"/><br/><br/>
        <label>Name:</label><input name="name" type="text"/><br/><br/>
        <label>Surname:</label><input name="surname" type="text"/><br/><br/>
        <label>Login:</label><input name="login" type="text"/><br/><br/>
        <label>Age:</label><input name="age" type="text"/><br/><br/>
        <label>Gender:</label>
        <select name="gender">
            <option value="">&lt;select&gt;</option>
            <option value="MAN">MAN</option>
            <option value="WOMAN">WOMAN</option>
        </select><br/>
        <input type="submit" name="add-user" value="add-user"/>
    </form>
</body>
</html>
