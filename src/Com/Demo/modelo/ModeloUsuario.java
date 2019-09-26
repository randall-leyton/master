/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Demo.modelo;

import Com.Demo.modelo.entity.Usuario;
import java.util.ArrayList;

/**
 *
 * @author r_ley
 */
public class ModeloUsuario extends Model{
    private static ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
      
            
    static public void RecorrerArray(){
        
        Usuarios.clear();
        
            
        
        Usuario a1= new Usuario("admin@gmail.com","123456");        
        Usuario a2= new Usuario("r.leyton@gmail.com", "75171616");
        Usuario a3= new Usuario("abcde@gmail.com", "123456");
        Usuarios.add(a1);
        Usuarios.add(a2);
        Usuarios.add(a3);
        
    }
    
    static public boolean logIn20(Usuario user){
        
        RecorrerArray();
        boolean band= false;
        int i=0;
        while(band == false & i<Usuarios.size()){
            if( user.getEmail().compareTo(Usuarios.get(i).getEmail())==0  &&
                    user.getClave().compareTo(Usuarios.get(i).getClave())==0 ){
                System.out.println(Usuarios.get(i).getEmail()  +"*********"+Usuarios.get(i).getClave() );
                
                band= true;
            }else{
                band=false;
                i++;
            }
        }
        return band;
    }
    
//    static public boolean logIn(Usuario user){
//        boolean band= false;
//        if(user.getEmail().compareTo("admin@gmail.com")== 0 &&
//                user.getClave().compareTo("123456")==0){
//            band =true;
//        }else{
//            band= false;
//        }
//        return band;
//    }
    static public long RecuperarContra(Usuario user, String clave){
        long status =0;
        if(user.getEmail().compareTo("admin@gmail.com")== 0){
            user.setClave(clave);
            status=500;
            System.out.println(status+"if modelo");
        }else{
            status=0;
        }
        return status ;
    }
}
