<%-- 
    Document   : calcular_precio_venta
    Created on : 8 nov. 2023, 17:37:57
    Author     : neyda
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcular precio</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f5f5f5;
            }
            h1 {
                text-align: center;
                background-color: #007BFF;
                color: #fff;
                padding: 10px;
            }
            p {
                margin: 10px;
            }
        </style>
    </head>
    <body>
        <h1>Resultado del Cálculo del precio de venta</h1>

        <%-- Recupera los datos del formulario --%>
        <%
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            String nombreArticulo = request.getParameter("nombreArticulo");
            double precioCosto = Double.parseDouble(request.getParameter("precioCosto"));
            double margenGanancia = Double.parseDouble(request.getParameter("margenGanancia"));
            double montoIVA = Double.parseDouble(request.getParameter("montoIVA"));
            
            //Calculo del precio de venta
            double precioVenta = precioCosto + (precioCosto * (margenGanancia / 100)) + (precioCosto * (montoIVA / 100));
        %>

        <p>Código: <%= codigo%></p>
        <p>Nombre del Artículo: <%= nombreArticulo%></p>
        <p>Precio de costo: $<%= precioCosto%></p>
        <p>Margen de ganancia: <%= margenGanancia%>% </p>
        <p>Fecha de vencimiento: <%= request.getParameter("fechaVencimiento")%></p>
        <p>Monto IVA: <%= montoIVA%>%</p>
        <p><strong>Precio de venta: $<%= precioVenta%></strong></p>
    </body>
</html>

