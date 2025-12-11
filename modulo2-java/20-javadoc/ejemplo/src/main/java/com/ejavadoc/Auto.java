package com.ejavadoc;

public class Auto extends Vehiculo {
    private int cantidadAsientos;

    public Auto(String patente, String modelo, double precioBaseDia, int cantidadAsientos) {
        super(patente, modelo, precioBaseDia);
        this.cantidadAsientos = cantidadAsientos;
    }

    /**
     * Calcula el alquiler de un auto.
     * <p>
     * <b>Regla de negocio:</b> El precio es el base por día, más un recargo único
     * de $50 por cada asiento que tenga el vehículo.
     * </p>
     * @param dias Días de alquiler.
     * @return Precio final (base * días) + (50 * asientos)
     */
    @Override
    public double alquilar(int dias) {
        if (this.alquilado) return 0;

        this.alquilado = true;

        double costoTiempo = this.precioBaseDia * dias;
        double recargoAsientos = 50 * this.cantidadAsientos;

        return costoTiempo + recargoAsientos;
    }
    
}
