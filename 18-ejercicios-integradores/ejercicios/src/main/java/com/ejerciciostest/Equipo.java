package com.ejerciciostest;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Jugador> integrantes;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.integrantes = new ArrayList<>();
    }

    public void agregarJugador(Jugador j) {
        // Validación: Máximo 5 jugadores
        if (this.integrantes.size() >= 5) {
            throw new IllegalStateException("El equipo ya está completo (Máx. 5 jugadores)");
        }
        this.integrantes.add(j);
    }

    public double obtenerPuntajeEquipo() {
        double total = 0;
        for (Jugador j : integrantes) {
            total += j.calcularValor();
        }
        return total;
    }
}
