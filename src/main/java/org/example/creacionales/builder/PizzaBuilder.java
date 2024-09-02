package org.example.creacionales.builder;

public class PizzaBuilder {

    String tamanio;
    boolean conQueso;
    boolean conPepperoni;
    boolean conBacon;


    public PizzaBuilder seleccionarTamanio(String tamanio) {
        this.tamanio = tamanio;
        return this;
    }

    public PizzaBuilder agregarQueso() {
        this.conQueso= true;
        return this;
    }

    public PizzaBuilder agregarPepperoni() {
        this.conPepperoni = true;
        return this;
    }

    public PizzaBuilder agregarBacon() {
        this.conBacon = true;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
}
