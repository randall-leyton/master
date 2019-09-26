/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Demo.modelo.entity;

/**
 *
 * @author r_ley
 */
public class Usuario {
    private String email;
    private long id;
    private String clave;
    private String apellidos;
    private String nombre;
    private int tipo;
    
    public Usuario(){
        
    }

    public Usuario(String email, long id, String clave, String apellidos, String nombre, int tipo) {
        this.email = email;
        this.id = id;
        this.clave = clave;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Usuario(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
