/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Demo.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author r_ley
 */
public class ModelMetodosMysql {
    public static ModelConexionMysql conexion= new ModelConexionMysql();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero =0;
    
    static public int guardar(String nombre, String apellidos,String Email, String clave){
        int resultado=0;
        Connection conexion = null;
        
        String sentencia_guardar= ("INSERT INTO usuario(nombre,apellido,Email,clave) VALUE(?,?,?,?)");
        try{
            conexion = ModelConexionMysql.conexion();
            sentencia_preparada= conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, Email);
            sentencia_preparada.setString(4, clave);
            resultado= sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "el error"+ e);
        }
        return resultado;
    }
}
