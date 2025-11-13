import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // "Piedra, Papel o Tijera"

        /*
         * 1.
         * - Crear un array que contenga los 3 valores posibles. (piedra, papel o
         * tijera)
         * - Crear los dos marcadores necesarios, para sacar un ganador al mejor de 3.
         * 
         * 2.
         * - Crear un bucle para controlar las rondas.
         * 
         * 3.
         * - Necesito que la computadora tenga su opción aleatoria.
         * - Según el índice aleatorio, puede guardar su jugada en una variable.
         * 
         * - Le pueden pedir al jugador por medio de la consola (Scanner) que haga su
         * elección.
         * - Ahora pueden imprimir ambas jugadas por consola y el resultado.
         * 
         * - Según el resultado se aumenta o no alguno de los marcadores.
         * 
         * 4.
         * - Cuando el bucle termine pueden imprimir un mensaje con el reporte de los
         * resultados.
         */

        // Scanner sc = new Scanner(System.in);

        // String jugadas[] = {"piedra", "papel", "tijeras"};

        // int contadorUsuaario = 0, contadorMaquina = 0;
        // int opciones = 0;

        // System.out.println("--- Bienvenido al juego del cachipun ---");
        // System.out.println("Las reglas son: \n");
        // System.out.println("I.- Se debe elegir entre las opciones: piedra, papel o
        // tijeras ");
        // System.out.println("II.- Piedra le gana a tijeras pero pierde con papel");
        // System.out.println("III.- Tijeras le gana a papel pero pierde con piedra");
        // System.out.println("IV.- Papel le gana a piedra pero pierde con tijeras");
        // System.out.println("V.- Gana el mejor de 3 partidas");
        // System.out.println("¡Comencemos!\n");

        // do{
        // System.out.println("Elija una opción:");
        // System.out.println("1.- Piedra");
        // System.out.println("2.- Papel");
        // System.out.println("3.- Tijeras");
        // System.out.println("0.- Salir");

        // opciones = sc.nextInt();

        // Random r = new Random();
        // int n = r.nextInt(3);

        // switch (opciones) {
        // case 1:
        // System.out.println("¡Has seleccionado PIEDRA!");
        // System.out.println("Tu contrincante ha seleccionado: " +
        // jugadas[n].toUpperCase());

        // if(jugadas[n] == jugadas[0])
        // {
        // System.out.println("¡Es un empate!");
        // System.out.println("LLevas perdido: " + contadorMaquina);
        // System.out.println("LLevas ganado: " + contadorUsuaario);
        // }
        // else if(jugadas[n] == jugadas[1])
        // {
        // System.out.println("¡Pierdes la ronda!");
        // contadorMaquina++;
        // System.out.println("LLevas perdido: " + contadorMaquina);
        // }
        // else
        // {
        // System.out.println("¡Ganaste la ronda!");
        // contadorUsuaario++;
        // System.out.println("LLevas ganado: " + contadorUsuaario);
        // }
        // break;
        // case 2:
        // System.out.println("¡Has seleccionado PAPEL!");
        // System.out.println("Tu contrincante ha seleccionado: " +
        // jugadas[n].toUpperCase());

        // if(jugadas[n] == jugadas[1])
        // {
        // System.out.println("¡Es un empate!");
        // System.out.println("LLevas perdido: " + contadorMaquina);
        // System.out.println("LLevas ganado: " + contadorUsuaario);
        // }
        // else if(jugadas[n] == jugadas[2])
        // {
        // System.out.println("¡Pierdes la ronda!");
        // contadorMaquina++;
        // System.out.println("LLevas perdido: " + contadorMaquina);
        // }
        // else
        // {
        // System.out.println("¡Ganaste la ronda!");
        // contadorUsuaario++;
        // System.out.println("LLevas ganado: " + contadorUsuaario);
        // }
        // break;
        // case 3:
        // System.out.println("¡Has seleccionado TIJERA!");
        // System.out.println("Tu contrincante ha seleccionado: " +
        // jugadas[n].toUpperCase());

        // if(jugadas[n] == jugadas[2])
        // {
        // System.out.println("¡Es un empate!");
        // System.out.println("LLevas perdido: " + contadorMaquina);
        // System.out.println("LLevas ganado: " + contadorUsuaario);
        // }
        // else if(jugadas[n] == jugadas[0])
        // {
        // System.out.println("¡Pierdes la ronda!");
        // contadorMaquina++;
        // System.out.println("LLevas perdido: " + contadorMaquina);
        // }
        // else
        // {
        // System.out.println("¡Ganaste la ronda!");
        // contadorUsuaario++;
        // System.out.println("LLevas ganado: " +contadorUsuaario);
        // }
        // break;
        // case 0:
        // System.out.println("¡Te has retirado de la partida!");
        // break;
        // default:
        // System.out.println("¡Seleccione una opción valida!");
        // break;
        // }

        // if(contadorMaquina > 2 || contadorUsuaario > 2)
        // {
        // opciones = 0;
        // System.out.println("Se acabo la partida los puntajes son: ");
        // System.out.println("Usuario: " + contadorUsuaario);
        // System.out.println("Maquina: " + contadorMaquina);
        // }

        // } while (opciones != 0);

        // sc.close();


        // -----------------------------------



        // Scanner consola = new Scanner(System.in);
        // String[] opciones = { "piedra", "papel", "tijeras" };

        // int victoriasUsuario = 0;
        // int victoriasComputador = 0;

        // // numero para la compu
        // int numeroAleatorio;

        // // cada intento del compu del arreglo
        // String intentoComputador;

        // do {
        //     System.out.println("1. Piedra ");
        //     System.out.println("2. Papel ");
        //     System.out.println("3. Tijeras ");
        //     System.out.println("Elige una opción: ");

        //     int opcionUsuario = consola.nextInt();
        //     String intentoUsuario = "";
        //     numeroAleatorio = (int) (Math.random() * 3);
        //     intentoComputador = opciones[numeroAleatorio];

        //     switch (opcionUsuario) {
        //         case 1:
        //             intentoUsuario = opciones[0];
        //             break;

        //         case 2:
        //             intentoUsuario = opciones[1];
        //             break;
        //         case 3:
        //             intentoUsuario = opciones[2];
        //             break;
        //         default:
        //             System.out.println("Opción no válida. Las opciones son 1, 2 y 3");

        //     }
        //     if (intentoComputador.equals(intentoUsuario)) {
        //         System.out.println("Empate");

        //     } else if (intentoComputador.equals(opciones[0]) && intentoUsuario.equals(opciones[2])) {
        //         victoriasComputador++;
        //         System.out.println("El compu eligio " + intentoComputador + ", usuario eligió " + intentoUsuario);
        //         System.out.println("Punto para el compu");
        //     } else if (intentoComputador.equals(opciones[2]) && intentoUsuario.equals(opciones[0])) {
        //         victoriasUsuario++;
        //         System.out.println("Punto para el usuario");
        //         System.out.println("El compu eligio " + intentoComputador + ", usuario eligió " + intentoUsuario);

        //     } else if (intentoComputador.equals(opciones[1]) && intentoUsuario.equals(opciones[0])) {
        //         victoriasComputador++;
        //         System.out.println("Punto para el compu");
        //         System.out.println("El compu eligio " + intentoComputador + ", usuario eligió " + intentoUsuario);

        //     } else if (intentoComputador.equals(opciones[0]) && intentoUsuario.equals(opciones[1])) {
        //         victoriasUsuario++;
        //         System.out.println("Punto para el usuario");
        //         System.out.println("El compu eligio " + intentoComputador + ", usuario eligió " + intentoUsuario);

        //     } else if (intentoComputador.equals(opciones[2]) && intentoUsuario.equals(opciones[1])) {
        //         victoriasComputador++;
        //         System.out.println("Punto para el compu");
        //         System.out.println("El compu eligio " + intentoComputador + ", usuario eligió " + intentoUsuario);

        //     } else if (intentoComputador.equals(opciones[1]) && intentoUsuario.equals(opciones[2])) {
        //         victoriasUsuario++;
        //         System.out.println("Punto para el usuario");
        //         System.out.println("El compu eligio " + intentoComputador + " usuario eligió " + intentoUsuario);

        //     }

        //     System.out.println("Victorias usuario: " + victoriasUsuario);
        //     System.out.println("Victorias computador: " + victoriasComputador);

        // } while (victoriasUsuario < 2 && victoriasComputador < 2);

        // if (victoriasUsuario == 2) {
        //     System.out.println("Muy bien, ganaste");
        // } else {
        //     System.out.println("Mejor suerte para la próxima");
        // }


        //Paso 1 - Creacion de array y marcadores

        String[] opciones = {"Piedra", "Papel", "Tijera"};
        int marcadorJugador = 0, marcadorComputadora = 0;
        Scanner sc = new Scanner(System.in);

        //Paso 2 - Bucle de 3 rondas
        while (marcadorJugador < 2 && marcadorComputadora < 2) {
            
            System.out.println("\n--- Nueva Ronda ---");
                        
            //Paso 3 - Eleccion aleatoria de la computadora
            int indiceComputadora = (int)(Math.random() * 3);
            String jugadaComputadora = opciones[indiceComputadora].toLowerCase();

            //Eleccion del jugador
            System.out.println("Elige tu opción (Piedra, Papel o Tijera): ");
            String jugadaJugador = sc.nextLine().trim().toLowerCase();

            if (
                !jugadaJugador.equals("piedra") &&
                !jugadaJugador.equals("papel") &&
                !jugadaJugador.equals("tijera")
            ) {
                System.out.println("Opción inválida. Por favor elige Piedra, Papel o Tijera.");
                continue; 
            }

            System.out.println("Computadora eligió: " + jugadaComputadora);
            System.out.println("Jugador eligió: " + jugadaJugador);

            //Determinacion del ganador de la ronda
            if (jugadaJugador.equals(jugadaComputadora)) {
                System.out.println("Empate en esta ronda.");
                
            } else if (
                (jugadaJugador.equals("piedra") && jugadaComputadora.equals("tijera")) ||
                (jugadaJugador.equals("papel") && jugadaComputadora.equals("piedra")) ||
                (jugadaJugador.equals("tijera") && jugadaComputadora.equals("papel"))
            ) {
                System.out.println("Jugador gana esta ronda.");
                marcadorJugador++;
                
            } else {
                System.out.println("Computadora gana esta ronda.");
                marcadorComputadora++;
            }
  
        }

        sc.close();

        //Paso 4 - Determinacion del ganador final
        System.out.println("Marcador final - Jugador: " + marcadorJugador + " | Computadora: " + marcadorComputadora);
        if (marcadorJugador > marcadorComputadora) {
            System.out.println("¡Jugador gana el juego!");
        } else if (marcadorComputadora > marcadorJugador) {
            System.out.println("¡Computadora gana el juego!");
        }
    }
}
