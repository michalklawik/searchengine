<%--
  Created by IntelliJ IDEA.
  User: michalklawik
  Date: 16.12.17
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="entry" items="${list}">
    <div <c:if test="${entry.key.gender.toString() == 'MAN'}">style="color: blue;"</c:if>>
        ID: <c:out value="${entry.key.id}"/><br/>
        Name: <c:out value="${entry.key.name}"/><br/>
        Surname: <c:out value="${entry.key.surname}"/><br/>
        Times searched: <c:out value="${entry.value}"/><br/>
        <br/>
    </div>

</c:forEach>


</body>
</html>
