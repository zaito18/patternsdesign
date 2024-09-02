package org.example.creacionales.factoryMethod.factories;

import org.example.creacionales.factoryMethod.impl.Moto;
import org.example.creacionales.factoryMethod.interfaces.Vehiculo;

public class MotoFactory extends VehiculoFactory{
    @Override
    public Vehiculo crearVehiculo() {
            return new Moto();

    }
}
