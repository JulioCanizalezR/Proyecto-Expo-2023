/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
/**
 *
 * @author totib
 */
public class Conexion {
    public static Connection getConnection(){
        String conexionUrl ="jdbc:sqlserver://localhost:55772;"
                            +"dabaseName=clinica;"
                            +"user=Julimox;"
                            +"passwperd=yoloxD13;"
                            +"encrypt=true;trustServerCertificate=true";
                
                try {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException e) {
                    System.out.println(e.toString());
                    return null;
        }
    }
}
