/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.puntoRest.controlador;

import com.puntoRest.modelo.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author neyda
 */
public class FacturaDAO {
    private Connection connection;

    public FacturaDAO() throws SQLException, ClassNotFoundException {
        // Inicializa la conexión a la base de datos aquí
        connection = Conexion.conectar();
    }

    public List<Factura> getAllFacturas() throws SQLException {
        List<Factura> facturas = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM factura");
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Factura factura = extractFacturaFromResultSet(resultSet);
                facturas.add(factura);
            }
        }
        return facturas;
    }

    public List<Factura> searchFacturasByPuntoVentaYComprobante(int puntoVenta, long nroComprobante) throws SQLException {
        List<Factura> facturas = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM factura WHERE puntoVenta = ? AND nroComprobante = ?");
             ResultSet resultSet = statement.executeQuery()) {
            statement.setInt(1, puntoVenta);
            statement.setLong(2, nroComprobante);
            while (resultSet.next()) {
                Factura factura = extractFacturaFromResultSet(resultSet);
                facturas.add(factura);
            }
        }
        return facturas;
    }

    public Factura getFacturaById(long id) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM factura WHERE id = ?")) {
            statement.setLong(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return extractFacturaFromResultSet(resultSet);
                }
            }
        }
        return null;
    }

    private Factura extractFacturaFromResultSet(ResultSet resultSet) throws SQLException {
        long id = resultSet.getLong("id");
        Date fechaComprobante = resultSet.getDate("fechaComprobante");
        char letraComprobante = resultSet.getString("letraComprobante").charAt(0);
        double montoTotal = resultSet.getDouble("montoTotal");
        long nroComprobante = resultSet.getLong("nroComprobante");
        // Otras p
    }
}
