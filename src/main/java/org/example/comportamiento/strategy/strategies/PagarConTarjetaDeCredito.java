package org.example.comportamiento.strategy.strategies;

public class PagarConTarjetaDeCredito implements EstrategiaDePago{
    @Override
    public void pagar(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using Credit Card.");
    }
}
