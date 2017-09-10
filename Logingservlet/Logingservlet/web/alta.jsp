<%-- 
    Document   : alta
    Created on : 30/08/2017, 07:39:48 PM
    Author     : memo0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/index.css" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <form name="formulario" action="altas" method="post">
            <div class="centrar">Usuario:</div><input type="text" name="usuario"  maxlength="35" id="usuario" /> <br/>
            <div class="centrar">Contraseña:</div><input type="text" name="contra"  maxlength="35" id="contra" /> <br/>
            <input type="submit" name="registrar" value="registrar"/>
        </form> 
        <br>
        <br>
        <br>
        <form name="formulario" action="index.html" method="post">
            <input type="submit" name="regresar" value="regresar">
        </form>
    </body>
</html>
