<%-- 
    Document   : calcular_precio_venta
    Created on : 8 nov. 2023, 16:57:54
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
        <h1>Resultado del C�lculo del precio de venta</h1>

        <%
     int codigo = Integer.parseInt(request.getParameter("codigo"));
    String nombreArticulo = request.getParameter("nombreArticulo");
    double precioCosto = Double.parseDouble(request.getParameter("precioCosto"));
    double margenGanancia = Double.parseDouble(request.getParameter("margenGanancia"));
    
    String montoIVAString = request.getParameter("montoIVA");
    montoIVAString = montoIVAString.replace(",", "").replace("%", "");
    double montoIVA = Double.parseDouble(montoIVAString);
    
    double precioVenta = precioCosto + (precioCosto * (margenGanancia / 100)) + (precioCosto * (montoIVA / 100));
        %>

        <p>C�digo: <%= codigo%></p>
        <p>Nombre del Art�culo: <%= nombreArticulo%></p>
        <p>Precio de costo: $<%= precioCosto%></p>
        <p>Margen de ganancia: <%= margenGanancia%>% </p>
        <p>Fecha de vencimiento: <%= request.getParameter("fechaVencimiento")%></p>
        <p>Monto IVA: <%= montoIVA%>%</p>
        <p><strong>Precio de venta: $<%= precioVenta%></strong></p>
    </body>
</html>
