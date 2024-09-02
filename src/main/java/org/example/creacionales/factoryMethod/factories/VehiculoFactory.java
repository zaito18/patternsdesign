package org.example.creacionales.factoryMethod.factories;

import org.example.creacionales.factoryMethod.interfaces.Vehiculo;

public abstract class VehiculoFactory {

    public Vehiculo venderVehiculo() {
        System.out.println(
                "Vendiendo Vehiculo"
        );
        Vehiculo vehiculo = crearVehiculo();
        vehiculo.probar();
        return vehiculo;
    }

    public abstract Vehiculo crearVehiculo();
}
