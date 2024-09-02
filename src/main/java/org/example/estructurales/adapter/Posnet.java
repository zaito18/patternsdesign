package org.example.estructurales.adapter;

public class Posnet{
    private String nombreMarca;

    public Posnet(String nombreMarca){
        this.nombreMarca = nombreMarca;
    }

    public void ejecutarTransaccion(String cliente, double valor) {
        System.out.println("transaccion ejecutada mediante "+ nombreMarca);
        System.out.println("Realizando cobro de $" + valor + " al titular " + cliente + " VIA QR usando Posnet.");    }
}
