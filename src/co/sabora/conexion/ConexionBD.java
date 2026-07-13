/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.sabora.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3307/sabora";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public Connection conectar() {

        Connection conexion = null;

        try {

            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);

            System.out.println("Conexión exitosa a la base de datos.");

        } catch (SQLException e) {

            System.out.println("Error de conexión: " + e.getMessage());

        }

        return conexion;

    }
}