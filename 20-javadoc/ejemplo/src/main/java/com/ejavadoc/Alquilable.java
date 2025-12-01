package com.ejavadoc;

/**
 * Define el comportamiento de cualquier objeto que pueda ser alquilado.
 */
public interface Alquilable {
    /**
     * Inicia el proceso de alquiler por una cantidad determinada de días.
     * @param dias La cantidad de días que durará el alquiler.
     * @return El costo total del alquiler.
     */
    double alquilar(int dias);

    /**
     * Finaliza el alquiler y deja el vehículo disponible otra vez.
     */
    void devolver();
}
