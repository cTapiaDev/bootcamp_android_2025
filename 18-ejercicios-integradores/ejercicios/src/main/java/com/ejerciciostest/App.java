package com.ejerciciostest;

/**
 * Clase Padre -> Jugador
 * --- Atributos: nickname, rol, puntajeHabilidad
 * --- Método: calcularValor() --> Retornar puntajeHabilidad
 * 
 * Clase Hija -> JugadorPro
 * --- Atributo: nivelExperiencia (Junior, Mid, Senior)
 * --- Método: calcularValor() --> Si es un Senior, su puntaje vale un 20% más
 * 
 * Clase Equipo
 * --- Atributos: nombreEquipo, integrantes (ArrayList)
 * --- Método: agregarJugador(Jugador j) --> El método solo nos deja tener 5 jugadores.
 * --- Método: obtenerPuntajeEquipo() --> La suma de los puntajes de todos los integrantes del equipo.
 *
 * Testing
 * --- Crear un EquipoTest
 * --- Probar que el calculo de los puntajes sea correcto.
 * --- Probar que no se puedan agregar 6 jugadores (assertThrows).
 */


public class App 
{
    public static void main( String[] args )
    {
        
    }
}
