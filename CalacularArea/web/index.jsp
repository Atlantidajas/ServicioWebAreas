<%-- 
    Document   : index
    Created on : 08-may-2018, 11:37:14
    Author     : Jorge
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript" src="js/tipoArea.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calcular area</h1>
        
    <form action="RecogerDatos" method="post">
        <input type="text" name="radio" id="radio" placeholder="Introduzca radio" >
        <input type="submit" class="enviar" value="Calcular">
    </form>
    <form action="RecogerDatosCuadrado" method="post">
        <input type="text" name="lado" id="lado" placeholder="Introduzca lado">
        <input type="submit" class="enviar" value="Calcular">
    </form>
    <form action="RecogerDatosTriangulo" method="post">
        <input type="text" name="base" id="base" placeholder="Introduzca base triángulo">
        <input type="text" name="altura" id="altura" placeholder="Introduzca altura triángulo">
        <input type="submit" class="enviar" value="Calcular">
    </form>
        
    </body>
</html>

