package org.example.creacionales.factoryMethod.factories;

import org.example.creacionales.factoryMethod.impl.Avion;
import org.example.creacionales.factoryMethod.interfaces.Vehiculo;

public class AvionFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Avion();
    }
}
