package org.example.estructurales.decorator;

public class AzucarDecorator extends BebidaDecorator{
    public AzucarDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", con azúcar" ;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0;
    }
}
