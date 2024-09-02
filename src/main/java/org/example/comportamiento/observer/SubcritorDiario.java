package org.example.comportamiento.observer;

public class SubcritorDiario implements Observador {

    private String name;

    public SubcritorDiario(String name) {
        this.name =name;
    }

    @Override
    public void actualizar(String novedades) {
        System.out.println(name + " ha recibido la noticia: " + novedades);
    }
}
