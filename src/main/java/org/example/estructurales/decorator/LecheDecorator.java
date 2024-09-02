package org.example.estructurales.decorator;

public class LecheDecorator extends BebidaDecorator{
    public LecheDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", con leche";
    }

    @Override
    public double getPrice() {
        return bebida.getPrice() + 10.0; // Coste adicional por la leche
    }
}
