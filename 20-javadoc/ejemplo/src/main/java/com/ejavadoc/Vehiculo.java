package com.ejavadoc;

/**
 * Clase base que representa cualquier vehículo de la flota.
 * @author Bootcamp Android
 */
public abstract class Vehiculo implements Alquilable {
    protected String patente;
    protected String modelo;
    protected double precioBaseDia;
    protected boolean alquilado;

    public Vehiculo(String patente, String modelo, double precioBaseDia) {
        this.patente = patente;
        this.modelo = modelo;
        this.precioBaseDia = precioBaseDia;
        this.alquilado = false;
    }

    @Override
    public void devolver() {
        this.alquilado = false;
        System.out.println("Vehículo " + this.patente + " devuelto y disponible");
    }

    public boolean estaAlquilado() {
        return this.alquilado;
    }

    public String getPatente() { return this.patente; }
    public String getModelo() { return this.modelo; }


}
