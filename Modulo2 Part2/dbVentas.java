/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.weblarc.programacion2.homework2.modulo2;
import java.util.ArrayList;
/**
 *
 * @author luisarcia
 */
public class dbVentas {
   /**
    * Obtiene los registros de venta
    */
    public static void obtenerRegistros() {
        ArrayList <Venta> db = new ArrayList<>();
        String output = "";
        double totalVendido = 0.00;
        
        db.add(new Venta(25499.49, 1902, "Perez", "Ricardo", "4-67-28"));
        db.add(new Venta(13499.98, 1900, "McDonals", "Rolando", "1-267-328"));
        db.add(new Venta(54499.17, 1901, "Gonzalez", "Juan", "4-345-28"));
        db.add(new Venta(15100.50, 1902, "Hoo", "Jhon", "8-687-268"));
        db.add(new Venta(9584.99, 1900, "Blanco", "Danny", "9-667-288"));
        db.add(new Venta(11499.99, 1900, "Flores", "María", "2-67-6628"));
        db.add(new Venta(25699.92, 1902, "Rein1a", "Reinaldo", "10-647-128"));
        db.add(new Venta(32650.01, 1901, "Hernández", "Alicia", "7-674-28"));
        db.add(new Venta(98200.00, 1901, "Cervantes", "Michelle", "6-567-27"));
        db.add(new Venta(113209.45, 1901, "Pinto", "José", "2-73-28"));
        
        output += "Reportes de venta: \n";
        
        for (int i = 0; i < db.size(); i++) {
            totalVendido += db.get(i).getMonto();
            
            output += String.format( "Monto: %.2f | Código: %s | Apellido: %s | Nombre: %s | CI: %s \n",
                    db.get(i).getMonto(),
                    db.get(i).getCodigoVehiculo(),
                    db.get(i).getNombre(),
                    db.get(i).getApellido(),
                    db.get(i).getCi()
            );
        }
        
        output += String.format("\nTotal de autos vendidos: %s", db.size());
        output += String.format("\nMonto Total Vendido: $%.2f", totalVendido);
        
        System.out.println(output);
    }
}