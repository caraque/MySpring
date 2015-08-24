<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Christian Araque
  Date: 19/08/2015
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<form:form action="login" method="post" id="login" enctype="multipart/form-data">
    <table>
        <tr align="center">
            <td><input type="submit" id="boton" name="boton" value="boton"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>