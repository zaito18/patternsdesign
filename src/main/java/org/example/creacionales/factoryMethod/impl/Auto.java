package org.example.creacionales.factoryMethod.impl;

import org.example.creacionales.factoryMethod.interfaces.Vehiculo;

public class Auto implements Vehiculo {
    @Override
    public void probar() {
        System.out.println("Manejando auto");
    }
}
