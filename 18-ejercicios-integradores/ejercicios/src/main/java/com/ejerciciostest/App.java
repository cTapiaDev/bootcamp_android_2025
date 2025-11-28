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

// -----------------------------------------------

/**
 * Interfaz -> Mantenible
 * --- Método: realizarMantenimiento() -> Resetea el contador de horas. (Esto es una idea, aquí no lleva nada).
 * 
 * Clase Abstracta -> Maquina (Implements)
 * --- Atributos: modelo, horasUso, limiteHoras
 * --- Método abstracto: trabajar(int horas)
 * 
 * Clases Concretas (Hijas):
 * -> Excavadora (Combustible): Al trabajar, suma horas. Si pasa el limite, lanza una excepción.
 * -> GruaElectrica (Electricas): Igual a la de arriba, pero tiene un atributo nivelBateria. Si trabaja y no tiene batería, lanza excepción.
 * 
 * Excepción -> Controlarlo con un print. (Cualquier maquina que sobrepase el limite de horas, cae aquí)
 * 
 * Sistema de Inventario (HashMap) (Es la class que tiene el main)
 * --- HashMap<String, Maquina> - El String simula un código de serie.
 * --- Método: asignarTrabajo(String código, int horas) -> Busca en el mapa y ejecuta trabajar().
 * --- (opcional) --> try-catch para capturar si la máquina se avería.
 * 
 * Si toman el opcional, recuerden que la validación se podría hacer en trabajar() throws MaquinaExcepcion;
 */

public class App 
{
    // --- Sistema de Inventario ---
    public static void main( String[] args )
    {
        
    }

    public static void asignarTrabajo(String codigo, int horas) {

    }
}
