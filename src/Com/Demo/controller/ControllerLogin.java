/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Demo.controller;

import Com.Demo.modelo.ModelMetodosMysql;
import Com.Demo.modelo.ModeloUsuario;
import Com.Demo.modelo.entity.Usuario;

/**
 *
 * @author r_ley
 */
public class ControllerLogin extends Controller{
    public ControllerLogin(){
        
    }    
    public boolean LogIn(String usuario, String clave){
        boolean band= false;  
        Usuario user =new Usuario(usuario, clave);
        band= ModeloUsuario.logIn20(user);
        return band ;
    }
    public long LoigUp(){
        long status=0 ;
        return status;
    }
    public long RecueperarClave(String usuario, String clave1){
        long status = 0;
        Usuario user =new Usuario(usuario,clave1);
            status = ModeloUsuario.RecuperarContra(user);
            System.out.println(status);
            return status;
    }
    public boolean Registrar (String nombre , String Apellido, String Email,String Clave){
        boolean band= false;
        Usuario user=new Usuario (Email, Clave ,Apellido,nombre);
        System.out.println("hola controler");
        band = ModeloUsuario.Registrar(user);
        return band;
    }
    public int RegistrarMysql(String nombre , String apellido, String Email, String clave){
        int resultado;
        resultado = ModelMetodosMysql.guardar(nombre, apellido, Email, clave);
        return resultado;
    }
    
    
}
