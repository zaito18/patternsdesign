package org.example.estructurales.adapter;

public class TransferenciasBancarias implements ProcesadorDePago {
    private String nombre;

    public TransferenciasBancarias(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void ejecutarTransaccion(String cliente, double valor) {
        System.out.println("transaccion ejecutada mediante "+ nombre);
        System.out.println("Procesando pago de $" + valor + " para " + cliente + " a través de transferencia bancaria.");    }
}
