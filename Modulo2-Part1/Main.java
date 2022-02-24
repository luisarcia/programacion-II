/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.weblarc.programacion2.homework.modulo2;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author luisarcia
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <Equipo> listEquipos = new ArrayList();

        String output   = "";
        String p1       = "🥇 1er Lugar: %s | Partidos Ganados: %s | Puntos a favor: %s | Puntos en contra: %s\n";
        String p2       = "🥈 2do Lugar: %s | Partidos Ganados: %s | Puntos a favor: %s | Puntos en contra: %s\n";
        String p3       = "🥉 3er Lugar: %s | Partidos Ganados: %s | Puntos a favor: %s | Puntos en contra: %s\n";
        String p4       = "🏳 4to Lugar: %s | Partidos Ganados: %s | Puntos a favor: %s | Puntos en contra: %s\n";
        String p5       = "🏳 5to Lugar: %s | Partidos Ganados: %s | Puntos a favor: %s | Puntos en contra: %s\n";
        String msg      = "";
        
        listEquipos.add(new Equipo("Metro", 10, 4, 1));
        listEquipos.add(new Equipo("Chiriquí", 2, 24, 10));
        listEquipos.add(new Equipo("Bocas", 10, 4, 23));
        listEquipos.add(new Equipo("Herrera", 15, 4, 29));
        listEquipos.add(new Equipo("Los Santos", 10, 14, 2));
        
        Collections.sort(listEquipos);

        for (int i = 0; i < listEquipos.size(); i++) {
            if( i == 0 )  msg = p1;
            if( i == 1 )  msg = p2;
            if( i == 2 )  msg = p3;
            if( i == 3 )  msg = p4;
            if( i == 4 )  msg = p5;

            output += String.format(msg,
                    listEquipos.get(i).getName(),
                    listEquipos.get(i).getPartidos_Ganados(),
                    listEquipos.get(i).getPuntos_a_Favor(),
                    listEquipos.get(i).getPuntos_En_Contra());
        }
        
        System.out.println(output);   
    }
}