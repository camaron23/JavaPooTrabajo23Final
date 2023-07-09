/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.modelo;

import java.io.Serializable;

/**
 *
 * @author sergi
 */

public class Cliente implements Serializable{
    private static final long serialVersionUID = -1315886448553080707L;
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String telefono;
    private String email;
    private String usuario;
    private String contraseña;

    public Cliente(String nombre, String apellidos, String dni, String direccion, String telefono, String email, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Cliente() {
        this("", "", "", "", "", "", "", "");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    @Override
    public String toString() {
        return  "Nombre: " + nombre +
                "\nApellidos: " + apellidos + 
                "\nDni: " + dni +
                "\nDireccion: " + direccion +
                "\nTelefono: " + telefono + 
                "\nEmail: " + email +
                "\nUsuario: " + usuario + 
                "\nContraseña: " + contraseña + 
                "\n\n";
    }


}
