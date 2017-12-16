<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: michalklawik
  Date: 02.12.17
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Witaj ${name}! Zarabiasz ${salary} </br></h1>
<%--<h3>Witaj ${sessionScope.name}. Zarabiasz ${sessionScope.salary} </br></br></h3>--%>
<c:set var="bonus" scope="request" value="${salary*0.2}"/>
<h5>Dostales bonus <c:out value="${bonus}" default="${salary}"/> </br></h5>
<h5>Twoja pensja to:  <c:out value="${bonus+salary}" default="${salary}"/> </br></h5>
</body>
</html>
