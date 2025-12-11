package com.ejavadoc;

import java.util.ArrayList;

/**
 * Gestor central de la flota.
 */
public class Agencia {
    private ArrayList<Vehiculo> flota;
    
    public Agencia() {
        this.flota = new ArrayList<>();
    }

    public void agregarFlota(Vehiculo v) {
        this.flota.add(v);
    }

    /**
     * Busca un vehículo por patente y calcula el alquiler.
     * @param patente Identificador único.
     * @param dias Cantidad de días a rentar.
     */
    public void rentarVehiculo(String patente, int dias) {
        for (Vehiculo v : flota) {

            if (v.getPatente().equalsIgnoreCase(patente)) {

                if (!v.estaAlquilado()) {
                    double precio = v.alquilar(dias);

                    System.out.println("Alquiler exitoso para " + v.getModelo());
                    System.out.println("   --> Costo Total: $" + precio);
                } else {
                    System.out.println("El vehículo ya está alquilado");
                }

            }
        }
        System.out.println("Vehículo no encontrado.");
    }
}
