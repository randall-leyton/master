/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Demo.modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author r_ley
 */
public class ModelConexionMysql {
    
    public static String clase="com.mysql.jdbc.Driver";
    public static final String user="root";
    public static final String pass="";
    public static final String url= "jdbc:mysql://localhost/conectar";
    
    public static Connection conexion(){
        Connection conexion=null;
        try{
           Class.forName(clase);
           conexion = (Connection)DriverManager.getConnection(url, user, pass);
           JOptionPane.showMessageDialog(null, "coneccion establecida");
           
        }catch( ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "coneccion establecida");
        }
        return  conexion;
    }
}
