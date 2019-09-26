/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Demo.controller;

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
    public long RecueperarClave(String usuario, String clave1, String clave2){
        long status = 0;
        Usuario user =new Usuario(usuario,clave1);
            status = ModeloUsuario.RecuperarContra(user, clave2);
            System.out.println(status);
            return status;
    }
    
    
}
