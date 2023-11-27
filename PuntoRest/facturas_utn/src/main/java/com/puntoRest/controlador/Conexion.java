/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.puntoRest.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author neyda
 */
public class Conexion {
    private Connection conexion;
    
    public Connection conectar() throws SQLException, ClassNotFoundException{
       Class.forName("com.mysql.jdbc.Driver");
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/productos", "root", "mysql");
            System.out.println("Conexión exitosa a la base de datos.");
            return conexion;
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Devuelve null si la conexión falla
        }
    }
    public void desconectar() throws SQLException {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}