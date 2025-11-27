package com.ejerciciostest;

public class JugadorPro extends Jugador {
    private String nivelExperiencia; // Junior, Mid o Senior

    public JugadorPro(String nickname, String rol, double puntajeHabilidad, String nivelExperiencia) {
        super(nickname, rol, puntajeHabilidad);
        this.nivelExperiencia = nivelExperiencia;
    }

    @Override
    public double calcularValor() {
        double valorBase = super.calcularValor();

        if (this.nivelExperiencia.equalsIgnoreCase("Senior")) {
            return valorBase * 1.20;
        } else {
            return valorBase;
        }
    }
    
}
