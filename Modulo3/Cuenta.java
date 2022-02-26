/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.weblarc.programacion2.homework.modulo3;

enum transactionType {
    RETIRO,
    DEPOSITO
};

/**
 *
 * @author luisarcia
 */
public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private clienteNatural propietario;

    /**
     * Establece los parametros iniciales de la cuenta
     * @param numeroCuenta  //número de cueneta
     * @param saldo         //saldo de la cuenta
     * @param propietario   //propietario de la cuenta
     */
    Cuenta(String numeroCuenta, double saldo, clienteNatural propietario) {
        this.numeroCuenta   = numeroCuenta;
        this.saldo          = saldo;
        this.propietario    = propietario;
    }
    
    public void transaccion(double cantidad, transactionType tipoTransaccion) {
        double saldoAnterior = this.saldo;
        String output = "Resumen de la transacción:\n";
        
        String infoCliente = "Detalle de la cuenta:\n";
        infoCliente += String.format("  💳 No. Cuenta: %s\n", this.numeroCuenta);
        infoCliente += String.format("  👨 Cliente: %s %s\n", this.propietario.getNombre(), this.propietario.getApellido());
        infoCliente += String.format("  📞 Teléfono: %s\n", this.propietario.getTelefono());
        infoCliente += String.format("  📧 Email: %s\n", this.propietario.getEmail());
        infoCliente += String.format("  🏠 Direccion: %s\n", this.propietario.getDireccion());

        switch(tipoTransaccion) {
            case DEPOSITO:
                this.saldo += cantidad;
                
                output += String.format("💰 Saldo anterior: $%.2f\n", saldoAnterior);
                output += String.format("🟢 Se realizó un %s a la cuenta: %s por un monto de: $%.2f.\n", tipoTransaccion, this.numeroCuenta, cantidad);
                output += String.format("💰 Su nuevo saldo es: $%.2f\n", this.saldo);
                output += "\n";
                output += infoCliente;
                
                break;
            case RETIRO:
                double nuevoSaldo = this.saldo - cantidad;
                
                if( nuevoSaldo < 0) {
                    output += String.format("🔴 No tiene saldo suficiente para realizar un %s de $%.2f de la cuenta %s.\n", tipoTransaccion, cantidad ,this.numeroCuenta);
                    output += String.format("💰 Saldo actual: $%.2f\n", saldoAnterior);
                    output += "\n";
                    output += infoCliente;
                } else {
                    this.saldo = nuevoSaldo;
                    output += String.format("💰 Saldo anterior: $%.2f\n", saldoAnterior);
                    output += String.format("🟢 Se realizó un %s a la cuenta: %s por un monto de: $%.2f\n", tipoTransaccion, this.numeroCuenta, cantidad);
                    output += String.format("💰 Su nuevo saldo es: $%.2f\n", this.saldo);
                    output += "\n";
                    output += infoCliente;
                }

                break;
            default:
                output = "🔴 Tipo de transacción no es válida";
        }
        
        System.out.println(output + "\n");
    }
}