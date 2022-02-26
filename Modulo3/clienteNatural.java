/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.weblarc.programacion2.homework.modulo3;

/**
 *
 * @author luisarcia
 */
public class clienteNatural implements Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String email;
    
    clienteNatural(String nombre, String apellido, String telefono, String direccion, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String getApellido() {
        return apellido;
    }
    
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public String getTelefono() {
        return telefono;
    }
    
    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String getDireccion() {
        return direccion;
    }
    
    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String getEmail() {
        return email;
    }
    
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}