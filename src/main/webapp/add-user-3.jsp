<%--
  Created by IntelliJ IDEA.
  User: michalklawik
  Date: 16.12.17
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add-User-3</title>
</head>
<body>
<form action="/add-user-in-step" method="post">
    <input type="hidden" name="step" value="3">
    <label>Gender:</label>
    <select name="gender">
        <option value="">&lt;select&gt;</option>
        <option value="MAN">MAN</option>
        <option value="WOMAN">WOMAN</option>
    </select><br/>
    <input type="submit" name="add-user" value="next"/>
</form>
</body>
</html>
