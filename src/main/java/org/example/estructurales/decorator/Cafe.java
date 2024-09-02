package org.example.estructurales.decorator;

public class Cafe implements Bebida{
    @Override
    public String getDescription() {
        return "es un cafe";
    }

    @Override
    public double getPrice() {
        return 1000;
    }
}
