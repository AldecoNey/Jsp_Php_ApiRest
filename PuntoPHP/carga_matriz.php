<!DOCTYPE html>
<html>
<head>
    <title>Carga de Matriz</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
        }

        h2 {
            color: #333;
        }

        form {
            background-color: #fff;
            border: 1px solid #ccc;
            padding: 20px;
            max-width: 300px;
            margin: 0 auto;
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
        }

        input[type="submit"] {
            background-color: #0077cc;
            color: #fff;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:disabled {
            background-color: #ccc;
            cursor: not-allowed;
        }
    </style>
</head>
<body>
    <h2>Carga de Matriz</h2>
    <form action="genera_matriz.php" method="post" onsubmit="return validarNumeroImpar();">
        <label for="valor">Valor (numérico impar):</label>
        <input type="number" name="valor" id="valor" required>
        <input type="submit" value="Generar Matriz" id="submitBtn" disabled>
    </form>
    <script>
        function validarNumeroImpar() {
            var valor = document.getElementById('valor').value;
            if (valor % 2 === 0) {
                return false;
            }
            return true;
        }

        document.getElementById('valor').addEventListener('input', function() {
            var valor = this.value;
            var submitBtn = document.getElementById('submitBtn');
            if (valor % 2 === 0) {
                submitBtn.disabled = true;
            } else {
                submitBtn.disabled = false;
            }
        });
    </script>
</body>
</html>