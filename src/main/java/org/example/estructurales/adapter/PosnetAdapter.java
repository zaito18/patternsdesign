package org.example.estructurales.adapter;

public class PosnetAdapter implements ProcesadorDePago {

    private Posnet posnet;


    public PosnetAdapter(Posnet posnet) {
        this.posnet = posnet;
    }

    @Override
    public void ejecutarTransaccion(String cliente, double valor) {
        //logica adicional del adapter para matchear el input de la interfaz incompatible
        posnet.ejecutarTransaccion(cliente, valor);
    }
}
