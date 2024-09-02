package org.example.comportamiento.strategy.strategies;

public class PagarConPaypal implements EstrategiaDePago{
    @Override
    public void pagar(int paymentAmount) {
         System.out.println("Paying " + paymentAmount + " using Paypal.");
    }
}
