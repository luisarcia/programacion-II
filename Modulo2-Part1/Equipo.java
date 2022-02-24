/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.weblarc.programacion2.homework.modulo2;

/**
 *
 * @author luisarcia
 */
public class Equipo implements Comparable<Equipo> {
    private String name;
    private int
            partidos_Ganados,
            Puntos_a_Favor,
            Puntos_En_Contra;
    
    /**
     * 
     * @param name
     * @param partidos_Ganados
     * @param Puntos_a_Favor
     * @param Puntos_En_Contra 
     */
    Equipo(String name, int partidos_Ganados, int Puntos_a_Favor, int Puntos_En_Contra) {
        this.name               = name;
        this.partidos_Ganados   = partidos_Ganados;
        this.Puntos_a_Favor     = Puntos_a_Favor;
        this.Puntos_En_Contra   = Puntos_En_Contra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPartidos_Ganados() {
        return partidos_Ganados;
    }

    public void setPartidos_Ganados(int partidos_Ganados) {
        this.partidos_Ganados = partidos_Ganados;
    }

    public int getPuntos_a_Favor() {
        return Puntos_a_Favor;
    }

    public void setPuntos_a_Favor(int Puntos_a_Favor) {
        this.Puntos_a_Favor = Puntos_a_Favor;
    }

    public int getPuntos_En_Contra() {
        return Puntos_En_Contra;
    }

    public void setPuntos_En_Contra(int Puntos_En_Contra) {
        this.Puntos_En_Contra = Puntos_En_Contra;
    }
    
    @Override
    public int compareTo(Equipo e) {
        if(e.getPartidos_Ganados() < partidos_Ganados) {
            return -1;
        } else if(e.getPartidos_Ganados() == partidos_Ganados ) {
            if( e.getPuntos_a_Favor() < Puntos_a_Favor) {
                return -1;
            } else if(e.getPuntos_a_Favor() == Puntos_a_Favor) {
                if( e.getPuntos_En_Contra() < Puntos_En_Contra) {
                    return -1;
                }
            }
        }

        return 0;
    }
}