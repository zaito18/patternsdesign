package org.example.creacionales.builder;

public class Pizza {

    private String tamanio;
    private boolean conQueso;
    private boolean conPepperoni;
    private boolean conBacon;

    public Pizza(String tamanio, boolean conQueso, boolean conPepperoni){
        this.tamanio = tamanio;
        this.conQueso = conQueso;
        this.conPepperoni = conPepperoni;
    }


    public Pizza(PizzaBuilder builder) {
        this.tamanio = builder.tamanio;
        this.conBacon = builder.conBacon;
        this.conPepperoni = builder.conPepperoni;
        this.conQueso = builder.conQueso;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tamanio='" + tamanio + '\'' +
                ", conQueso=" + conQueso +
                ", conPepperoni=" + conPepperoni +
                ", conBacon=" + conBacon +
                '}';
    }
}
