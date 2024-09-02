package org.example.creacionales.factoryMethod.factories;

import org.example.creacionales.factoryMethod.impl.Auto;
import org.example.creacionales.factoryMethod.interfaces.Vehiculo;

public class AutoFactory extends VehiculoFactory{
    @Override
    public Vehiculo crearVehiculo() {

        return new Auto();
    }
}
