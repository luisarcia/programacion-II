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
public class Inventario {
    public static void obtener() {
       ArrayList<Vehiculo> listAutos = new ArrayList<>();

        Autos auto = new Autos();
        auto.setCodigo(1900);
        auto.setMarca("Nissan");
        auto.setTipo("Sedan");
        auto.setModelo(2019);
        auto.setPatente("AL9012");
        auto.setKilometraje(90023);

        listAutos.add(auto);

        Camionetas camioneta = new Camionetas();
        camioneta.setCodigo(1901);
        camioneta.setMarca("Chevrolet");
        camioneta.setTipo("Camioneta");
        camioneta.setModelo(2020);
        camioneta.setPatente("J5433");
        camioneta.setKilometraje(65153);
        
        listAutos.add(camioneta);

        Motocicletas motocicleta = new Motocicletas();
        motocicleta.setCodigo(1902);
        motocicleta.setMarca("Harley Davidson");
        motocicleta.setTipo("Moto");
        motocicleta.setModelo(2022);
        motocicleta.setPatente("AJ320");
        motocicleta.setKilometraje(10);

        listAutos.add(motocicleta);

        String output = "";
        output += "Inventario de Vehículos:\n";
        
        for (int i = 0; i < listAutos.size(); i++) {
            output += String.format("Código: %s | Marca: %s | Tipo de vehículo: %s | Año: %s | Patente: %s | Kilometraje: %s \n",
                listAutos.get(i).getCodigo(),
                listAutos.get(i).getMarca(),
                listAutos.get(i).getTipo(),
                listAutos.get(i).getModelo(),
                listAutos.get(i).getPatente(),
                listAutos.get(i).getKilometraje()
            );
        }
        
        
        output += "\n------------------------------------\n";

        System.out.println(output); 
    }
}
