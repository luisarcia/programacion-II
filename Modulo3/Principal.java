/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.weblarc.programacion2.homework.modulo3;

/**
 *
 * @author luisarcia
 */
public class Principal {
    public static void main(String[] args) {
        clienteNatural Elon = new clienteNatural(
                "Elon",
                "Musk",
                "9979328",
                "Coclé, Penonomé, Urb. Villa Cumbrera #1, Cl2, Casa 23",
                "elon.musk@gmail.com"
        );
        
        Cuenta cuenta1 = new Cuenta("1000238737", 3567.29, Elon);
        cuenta1.transaccion(3000, transactionType.DEPOSITO);
        
        clienteNatural Bill = new clienteNatural(
                "Bill",
                "Gates",
                "7747747",
                "Chiriquí, David, Urb. La Feria #3, Cl1, Casa 34",
                "bill.gate@outlook.com"
        );

        Cuenta cuenta2 = new Cuenta("1000356664", 3567.29, Bill);
        cuenta2.transaccion(500, transactionType.RETIRO);
    }
}