/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andres
 */
public class Conexion {

    public static void main(String[] args) {
        
        Connection conexion = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("DRIVER Java a la Bd cargado!!");

        } catch (ClassNotFoundException ex) {
            System.out.println("Error: no se encuentra el Driver" + ex);
        }
        
        try {
            String urlbd = "jdbc:derby://localhost:1527/Cuentas ";//url para conectarnos a la base de datos utilizando la sintaxis de JDBC
            conexion = DriverManager.getConnection(urlbd, "examen", "examen");// se establece la coneccion a la bace de datos
            System.out.println("Conexion establecida  a la BD");
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo establecer  conexion a la BD !!" + ex);
        }
  
    }
    
}
