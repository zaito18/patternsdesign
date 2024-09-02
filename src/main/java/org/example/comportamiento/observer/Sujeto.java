package org.example.comportamiento.observer;

public interface Sujeto {
    void registrarObservador(Observador observador);
    void eliminarObservador(Observador observador);
    void actualizarObservadores();
}
