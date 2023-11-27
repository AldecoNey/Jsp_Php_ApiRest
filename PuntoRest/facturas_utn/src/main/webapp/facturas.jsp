<%-- 
    Document   : facturas
    Created on : 8 nov. 2023, 18:09:02
    Author     : neyda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Facturas</title>
</head>
<body>
  
    <form action="/tu_aplicacion/rest/facturas/buscar" method="GET">
        Punto de Venta: <input type="text" name="puntoVenta">
        Comprobante: <input type="text" name="comprobante">
        <input type="submit" value="Buscar">
    </form>

   
    <table>
        <tr>
            <th>Fecha</th>
            <th>Comprobante</th>
            <th>Punto Venta</th>
         
        </tr>
        <c:forEach items="${facturas}" var="factura">
            <tr>
                <td>${factura.fecha}</td>
                <td>${factura.comprobante}</td>
                <td>${factura.puntoVenta}</td>
           
            </tr>
        </c:forEach>
    </table>
</body>
</html>

