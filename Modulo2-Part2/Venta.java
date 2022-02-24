/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.weblarc.programacion2.homework2.modulo2;
import java.util.*;

/**
 *
 * @author luisarcia
 */
public class Venta {
    private double monto;
    private int codigoVehiculo;
    private String nombre, apellido, ci;
    
    public Venta(double monto, int codigoVehiculo, String apellido, String nombre, String ci ) {
        this.monto = monto;
        this.codigoVehiculo = codigoVehiculo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
}