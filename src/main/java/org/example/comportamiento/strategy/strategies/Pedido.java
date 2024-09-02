package org.example.comportamiento.strategy.strategies;

public class Pedido {
    private EstrategiaDePago estrategia;

    public void setEstrategia(EstrategiaDePago estrategia) {
        this.estrategia = estrategia;
    }

    public void confirmacion(int precio){
        if(estrategia == null){
            System.out.println("Por favor, selecciona un método de pago.");
        }else {
            estrategia.pagar(precio);
        }
    }



}
