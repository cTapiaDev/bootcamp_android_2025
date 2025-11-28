package com.ejerciciostest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ejerciciostest.EquipoJugador.Equipo;
import com.ejerciciostest.EquipoJugador.Jugador;
import com.ejerciciostest.EquipoJugador.JugadorPro;

public class EquipoTest {
    
    Equipo equipo;

    @BeforeEach
    void setup() {
        equipo = new Equipo("Bootcamp-Gaming");
    }

    @Test
    @DisplayName("Debe calcular correctamente el puntaje total del Equipo")
    void testObtenerPuntajeEquipo() {

        Jugador j1 = new Jugador("FakerBase", "Mid", 100);
        Jugador j2 = new JugadorPro("FakerPro", "Mid", 100, "Senior");
        Jugador j3 = new JugadorPro("Rookie", "Jungle", 100, "Junior");

        equipo.agregarJugador(j1);
        equipo.agregarJugador(j2);
        equipo.agregarJugador(j3);

        assertEquals(320, equipo.obtenerPuntajeEquipo(), 0.01);
    }

    @Test
    @DisplayName("Debe lanzar una excepción al intentar agregar un 6to jugador")
    void testAgregarJugador() {

        equipo.agregarJugador(new Jugador("J1", "Rol", 10));
        equipo.agregarJugador(new Jugador("J2", "Rol", 10));
        equipo.agregarJugador(new Jugador("J3", "Rol", 10));
        equipo.agregarJugador(new Jugador("J4", "Rol", 10));
        equipo.agregarJugador(new Jugador("J5", "Rol", 10));

        assertThrows(IllegalStateException.class, () -> {
            equipo.agregarJugador(new Jugador("J6", "Rol", 10));
        });
    }

}
