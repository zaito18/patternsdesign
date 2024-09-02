package org.example.estructurales.decorator;

public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription();
    }

    @Override
    public double getPrice() {
        return bebida.getPrice();
    }
}
