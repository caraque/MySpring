<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Login</title>
    <%@ page pageEncoding="UTF-8"%>
</head>
<body>
<form:form commandName="validateLogin" method="post" action="validateLogin">
    <table align="center">
        <tr>
            <td>
               <label for="username" ><fmt:message text="Usuario:" /></label>
            </td>
            <td><input type="text" id="username" name="username" value="${user.username}" /></td>
        </tr>
        <tr>
            <td>
                <label for="password" ><fmt:message text="Contraseña:" /></label>
            </td>
            <td><input type="text" id="password" name="password" value="${user.password}" /></td>
        </tr>
        <tr align="center">
            <td colspan="2"><input type="submit" value="Presióname"></td>
        </tr>
    </table>
</form:form>
<table align="center"><tr><td style="${style_div}">${message}</td></tr></table>
</body>
</html>