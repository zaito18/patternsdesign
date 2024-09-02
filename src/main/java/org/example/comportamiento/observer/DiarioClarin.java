package org.example.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class DiarioClarin implements Sujeto {
    private List<Observador> observadores;

    public void publicarNoticia(String novedades) {
        this.novedades = novedades;
        actualizarObservadores();
    }

    private String novedades;

    public DiarioClarin() {
        this.observadores = new ArrayList<Observador>();
    }

    @Override
    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observador observador) {
    observadores.remove(observador);
    }

    @Override
    public void actualizarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(novedades);
        }
    }





}
