<%@ taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Christian Araque
  Date: 19/08/2015
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Iniciar sesión</title>
</head>
<body>
<form method="post" action="validateLogin" enctype="multipart/form-data">
    <table align="center">
        <tr>
            <td><label for="user"><fmt:message text="Usuario:" /></label></td>
            <td><input type="text" id="user" name="user" value="${user.user}"/></td>
        </tr>
        <tr>
            <td><label for="password"><fmt:message text="Contraseña:" /></label></td>
            <td><input type="text" id="password" name="password" value="${user.password}"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" name="login" value="Presioname" ></td>
        </tr>
    </table>
</form>
${message}
</body>
</html>
