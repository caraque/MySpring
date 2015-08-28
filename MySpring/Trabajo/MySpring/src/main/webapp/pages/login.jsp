<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Login</title>
    <%@ page pageEncoding="UTF-8" %>
</head>
<body>
<form:form commandName="validateLogin" action="validateLogin" method="post">
    <table align="center">
        <tr>
            <td><label for="user"><fmt:message text="Usuario:"/></label></td>
            <td><input type="text" id="user" name="username" value="${user.username}"/></td>
        </tr>
        <tr>
            <td><label for="password"><fmt:message text="Contraseña:"/></label></td>
            <td><input type="password" id="password" name="password" value="${user.password}"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" id="login" name="login" value="Iniciar sesión"/></td>
        </tr>
    </table>
</form:form>

<table align="center" style="${table-visible}">
    <tr>
        <td>Usuario:</td>
        <td>${user.username}</td>
        <br>
    </tr>
    <td>Contraseña:</td>
    <td>${user.password}</td>
    </tr>
    <tr bgcolor="#999999">
        <td colspan="2" align="center" style="color:#ffffff;">Datos errados</td>
    </tr>
</table>
</body>
</html>