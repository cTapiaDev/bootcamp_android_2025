package com.ejerciciostest;

public class MaquinaExcepcion extends Exception {
    public MaquinaExcepcion(String mensaje) {
        super("¡Alerta!" + mensaje);
    }
}
