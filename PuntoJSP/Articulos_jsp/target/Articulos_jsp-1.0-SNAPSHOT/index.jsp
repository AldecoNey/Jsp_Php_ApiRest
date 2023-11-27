<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Articulo</title>
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
            form {
                max-width: 400px;
                margin: 0 auto;
                background-color: #fff;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0px 0px 10px #ccc;
            }
            label {
                font-weight: bold;
            }
            input, select {
                width: 100%;
                padding: 5px;
                margin: 5px 0;
            }
            input[type="submit"] {
                background-color: #007BFF;
                color: #fff;
                border: none;
                padding: 10px;
                border-radius: 5px;
                cursor: pointer;
            }
        </style>
    </head>
    <body>
        <h1>Calculadora de Precio</h1>
        <form action="calcular_precio_venta.jsp" method="post">
            <label for="codigo">Código:</label>
            <input type="number" name="codigo" id="codigo" required><br><br>

            <label for="nombreArticulo">Nombre del Artículo:</label>
            <input type="text" name="nombreArticulo" id="nombreArticulo" required><br><br>

            <label for="precioCosto">Precio Costo:</label>
            <input type="number" name="precioCosto" id="precioCosto" required><br><br>

            <label for="margenGanancia">Margen de Ganancia:</label>
            <input type="number" name="margenGanancia" id="margenGanancia" required><br><br>

            <label for="fechaVencimiento">Fecha de Vencimiento:</label>
            <input type="date" name="fechaVencimiento" id="fechaVencimiento" required><br><br>

            <label for="montoIVA">Monto IVA:</label>
            <select name="montoIVA" id="montoIVA">
                <option value="0%">0%</option>
                <option value="10,5%">10,5%</option>
                <option value="21%">21%</option>
            </select><br><br>

            <input type="submit" value="CALCULAR">
        </form>
    </body>
</html>
