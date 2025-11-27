package com.ejerciciostest;

public class Jugador {
    protected String nickname;
    protected String rol;
    protected double puntajeHabilidad;

    public Jugador(String nickname, String rol, double puntajeHabilidad) {
        this.nickname = nickname;
        this.rol = rol;
        this.puntajeHabilidad = puntajeHabilidad;
    }

    public double calcularValor() {
        return this.puntajeHabilidad;
    }
}
