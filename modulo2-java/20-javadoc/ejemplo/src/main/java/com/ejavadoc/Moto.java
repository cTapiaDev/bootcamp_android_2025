package com.ejavadoc;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String patente, String modelo, double precioBaseDia, int cilindrada) {
        super(patente, modelo, precioBaseDia);
        this.cilindrada = cilindrada;
    }

    /**
     * Calcula el alquiler de una moto.
     * <p>
     * <b>Regla de negocio:</b> Precio base por día.
     * Si la moto es de alta cilindrada (mayor a 300cc), se aplica un 20% de recargo.
     * </p>
     * @param dias Días de alquiler.
     * @return Precio final ajustado por cilindrada.
     */
    @Override
    public double alquilar(int dias) {
        if (this.alquilado) return 0;

        this.alquilado = true;
        double costoTotal = this.precioBaseDia * dias;

        if (this.cilindrada > 300) {
            costoTotal = costoTotal * 1.20;
        }

        return costoTotal;

    }
    
}
