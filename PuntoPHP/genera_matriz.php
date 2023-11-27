<!DOCTYPE html>
<html>
<head>
    <title>Generación de Matriz</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
        }

        h2 {
            color: #333;
        }

        div {
            background-color: #fff;
            border: 1px solid #ccc;
            padding: 20px;
            max-width: 500px;
            margin: 0 auto;
        }

        p {
            font-size: 18px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        table, th, td {
            border: 1px solid #ccc;
        }

        th, td {
            padding: 10px;
        }

        th {
            background-color: #0077cc;
            color: #fff;
        }

        .highlight {
            background-color: #ffdddd; /* Color rojo suave */
        }
    </style>
</head>
<body>
    <h2>Generación de Matriz</h2>
    <div>
        <?php
        if ($_SERVER['REQUEST_METHOD'] === 'POST') {
            // Recupera el valor del formulario
            $valor = $_POST['valor'];

            // Valida que el valor sea impar
            if ($valor % 2 == 0) {
                die("El valor ingresado no es impar.");
            }

            // Genera una matriz simétrica de orden NxN con valores aleatorios
            $matriz = [];
            for ($i = 0; $i < $valor; $i++) {
                for ($j = 0; $j < $valor; $j++) {
                    $matriz[$i][$j] = rand(1, 100);
                }
            }

            // Obtiene los valores de la fila y columna central
            $filaCentral = $matriz[intval($valor / 2)];
            $columnaCentral = [];
            for ($i = 0; $i < $valor; $i++) {
                $columnaCentral[] = $matriz[$i][intval($valor / 2)];
            }

            // Calcula el promedio de las filas y columnas
            $promedioFilas = array_sum($filaCentral) / $valor;
            $promedioColumnas = array_sum($columnaCentral) / $valor;

            // Compara los promedios
            $resultado = ($promedioFilas > $promedioColumnas) ? "El promedio de las filas es mayor que el de las columnas." : "El promedio de las columnas es mayor que el de las filas.";

            // Imprime la matriz y los resultados
            echo "Matriz Resultante de $valor filas por $valor columnas:<br>";
            echo "<table>";
            for ($i = 0; $i < $valor; $i++) {
                echo "<tr>";
                for ($j = 0; $j < $valor; $j++) {
                    // Resalta la fila y columna central con un color rojo suave
                    $highlightClass = ($i == intval($valor / 2) || $j == intval($valor / 2)) ? 'highlight' : '';
                    echo "<td class='$highlightClass'>" . $matriz[$i][$j] . ' </td>';
                }
                echo "</tr>";
            }
            echo "</table>";
            echo "<br>";

            echo "Matriz filas " . implode(", ", $filaCentral) . " => Promedio $promedioFilas<br>";
            echo "Matriz columnas " . implode(", ", $columnaCentral) . " => Promedio $promedioColumnas<br>";

            echo $resultado;
        }
        ?>
    </div>
</body>
</html>