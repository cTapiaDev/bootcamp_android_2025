import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final int TAMANO_TABLERO = 5;
    private static final int TOTAL_BARCOS = 3;

    // Tablero real
    private static final int AGUA_REAL = 0;
    private static final int BARCO_REAL = 1;

    // Tablero jugador
    private static final char AGUA_NO_EXPLORADA = '~';
    private static final char AGUA_FALLIDA = 'O';
    private static final char BARCO_HUNDIDO = 'X';

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // MATRIX
        char[][] tablero = new char[3][3];
        tablero[0][0] = 'X';
// 
        int[][] numeros = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(numeros[1][2]); // 6

        // imprimirMatrix(numeros);

        // Ejercicio

        /*
         * 1.
         * - Crear una matriz int[][] para una sala de cine 5x5
         * - 0 = Libre
         * - 1 = Ocupado
         * 
         * 2.
         * - En un comienzo todo está libre.
         * 
         * 3.
         * - Crear un método para mostrar la sala. (Imprimir una matriz).
         * 
         * 4.
         * - Crear un menú que nos permita:
         * - Ver la Sala.
         * - Reservar un asiento. (Validar que no esté ocupado)
         * - Salir.
         */

        // System.out.println("¡Bienvenido a Cine Java!");
        // System.out.println("Aqui podra disfrutar del mejor cine nacional ZZzzzZZz");

        // int[][] sala = {
        //         { 0, 0, 0, 0, 0 },
        //         { 0, 0, 0, 0, 0 },
        //         { 0, 0, 0, 0, 0 },
        //         { 0, 0, 0, 0, 0 },
        //         { 0, 0, 0, 0, 0 }
        // };

        // Scanner sc = new Scanner(System.in);
        // int opciones = 0;

        // do {
        //     System.out.println("Menú: ");
        //     System.out.println("1.- Ver asientos disponibles");
        //     System.out.println("2.- Reservar asientos");
        //     System.out.println("0.- Salir");
        //     opciones = sc.nextInt();

        //     switch (opciones) {
        //         case 1:
        //             verAsientos(sala);
        //             break;
        //         case 2:
        //             reservarAsientos(sala);
        //             break;
        //         case 0:
        //             System.out.println("Saliendo...");
        //             break;
        //         default:
        //             break;
        //     }

        // } while (opciones != 0);

        // int[][] cine = {
        // { 1, 2, 3, 4, 5 },
        // { 6, 7, 8, 9, 10 },
        // { 11, 12, 13, 14, 15 },
        // { 16, 17, 18, 19, 20 },
        // { 21, 22, 23, 24, 25 }
        // };

        // Scanner scanner = new Scanner(System.in);
        // boolean salir = false;

        // while (!salir) {
        // System.out.println("------ Menú ------");
        // System.out.println("1. Poner todos los elementos a 0");
        // System.out.println("2. Reservar primera posición libre");
        // System.out.println("3. Mostrar matriz");
        // System.out.println("4. Salir");
        // System.out.print("Seleccione una opción: ");

        // int opcion = scanner.nextInt();

        // switch (opcion) {
        // case 1:
        // limpiarCine(cine);
        // break;
        // case 2:
        // reservarCine(cine);
        // break;
        // case 3:
        // recorrerCine(cine);
        // break;
        // case 4:
        // salir = true;
        // System.out.println("Saliendo...");
        // break;
        // default:
        // System.out.println("Opción no válida, intente de nuevo.");
        // break;

        // }
        // }
        // scanner.close();

        // Ejemplo: matriz [Fila][columna]
        // int [][] matriz = {
        // Fila 0 Fila 1 Fila 2
        // {1, 2, 3},//Col 0 Col 1 Col 2
        // {4, 5, 6},//Col 0 Col 1 Col 2
        // {7, 8, 9}//Col 0 Col 1 Col 2
        // imprimir el valor 2
        // System.out.println(matriz[0][1]);
        // int fila, columna, ocupado;
        // boolean menu = true;
        // int [][] salaCine = {
        // {0, 0, 0, 0, 0}, // Fila 0
        // {0, 0, 0, 0, 0}, // Fila 1
        // {0, 0, 0, 0, 0}, // Fila 2
        // {0, 0, 0, 0, 0}, // Fila 3
        // {0, 0, 0, 0, 0}, // Fila 4
        // };
        // Scanner asiento = new Scanner(System.in);
        // while (menu==true) {
        // menu = menu(salaCine);
        // if(menu==false){
        // System.out.println("Desea volver al menu ? (true/false)");
        // menu=asiento.nextBoolean();
        // }
        // }
        // asiento.close();

        /*
         * EJERCICIO DE BATALLA NAVAL - JUEGO
         */

        System.out.println("--- ¡Bienvenidos a la Batalla Naval! ---");
        System.out.println("Tablero de " + TAMANO_TABLERO + "x" + TAMANO_TABLERO);
        System.out.println("Debes hundir " + TOTAL_BARCOS + " barcos.");

        int[][] tableroReal = new int[TAMANO_TABLERO][TAMANO_TABLERO];
        char[][] tableroJugador = new char[TAMANO_TABLERO][TAMANO_TABLERO];

        inicializarTableroJugador(tableroJugador);
        colocarBarcos(tableroReal);

        iniciarJuego(tableroReal, tableroJugador);

    }

    private static void inicializarTableroJugador(char[][] tablero) {
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                tablero[i][j] = AGUA_NO_EXPLORADA;
            }
        }
    }

    private static void colocarBarcos(int[][] tablero) {
        int barcosColocados = 0;

        while (barcosColocados < TOTAL_BARCOS) {
            int fila = (int) (Math.random() * TAMANO_TABLERO);
            int col = (int) (Math.random() * TAMANO_TABLERO);

            if (tablero[fila][col] == AGUA_REAL) {
                tablero[fila][col] = BARCO_REAL;
                barcosColocados++;
            }
        }
    }

    private static void iniciarJuego(int[][] real, char[][] jugador) {
        int barcosHundidos = 0;
        int turno = 1;

        while (barcosHundidos < TOTAL_BARCOS) {
            System.out.println("\n--- Turno " + turno + " ---");
            mostrarTablero(jugador);
            System.out.println("Barcos restantes: " + (TOTAL_BARCOS - barcosHundidos));

            int filaUsuario = 0;
            int colUsuario = 0;

            try {
                System.out.print("Ingrese Fila (1-" + TAMANO_TABLERO + "): ");
                filaUsuario = SC.nextInt();
                System.out.print("Ingrese Columna (1-" + TAMANO_TABLERO + "): ");
                colUsuario = SC.nextInt();

                filaUsuario--;
                colUsuario--;

                if (filaUsuario < 0 || filaUsuario >= TAMANO_TABLERO || colUsuario < 0
                        || colUsuario >= TAMANO_TABLERO) {
                    System.out.println("Coordenadas fuera del tablero. Intenta de nuevo.");
                    continue; // SALTA LA ITERACIÓN DEL BUCLE
                }

                if (jugador[filaUsuario][colUsuario] != AGUA_NO_EXPLORADA) {
                    System.out.println("Ya disparaste en esa coordenada. Intenta de nuevo.");
                    continue;
                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debes ingresar números.");
                SC.next();
                continue;
            }

            if (real[filaUsuario][colUsuario] == BARCO_REAL) {
                System.out.println("¡ACIERTO! has hundido un barco");
                jugador[filaUsuario][colUsuario] = BARCO_HUNDIDO;
                barcosHundidos++;
            } else {
                System.out.println("¡AGUA! Disparo fallido");
                jugador[filaUsuario][colUsuario] = AGUA_FALLIDA;
            }

            turno++;
        }
    }

    private static void mostrarTablero(char[][] tablero) {
        System.out.print("    ");
        for (int j = 0; j < TAMANO_TABLERO; j++) {
            System.out.print(" " + (j + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < TAMANO_TABLERO; i++) {

            System.out.print(" " + (i + 1) + " |");

            for (int j = 0; j < TAMANO_TABLERO; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println();
        }
    }

    // public static void imprimirMatrix(int[][] matrix) {

    // // Bucle externo
    // for (int i = 0; i < matrix.length; i++) {

    // // Bucle interno
    // for (int j = 0; j < matrix[i].length; j++) {
    // System.out.print(matrix[i][j] + " ");
    // }

    // System.out.println();
    // }
    // }

    // public static void verAsientos(int[][] salaCine) {
    //     System.out.println("Asientos disponibles estan marcados por un 0, los ya reservados por un 1.");

    //     for (int i = 0; i < salaCine.length; i++) {
    //         for (int j = 0; j < salaCine[i].length; j++) {
    //             System.out.print(salaCine[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static int reservarAsientos(int[][] salaCine) {
    //     Scanner reserva = new Scanner(System.in);

    //     System.out.println("Ingrese la fila (1 a " + salaCine.length + "): ");
    //     int fila = reserva.nextInt() - 1;

    //     System.out.println("Ingrese la columna (1 a " + salaCine[0].length + "): ");
    //     int columna = reserva.nextInt() - 1;

    //     if (fila < 0 || fila >= salaCine.length || columna < 0 || columna >= salaCine[0].length) {
    //         System.out.println("¡Asiento no existe!. Intente nuevamente.");
    //         return 0; 
    //     }

    //     if (salaCine[fila][columna] == 0) {
    //         salaCine[fila][columna] = 1;
    //         System.out.println("Asiento reservado con éxito.");
    //         return 1;
    //     } else {
    //         System.out.println("¡Asiento no disponible! Selecciona otro.");
    //         return 0;
    //     }

        

    // }

    // public static void recorrerCine(int[][] cine) {

    // // bucle externo

    // for (int i = 0; i < cine.length; i++) {
    // for (int j = 0; j < cine[i].length; j++) {
    // System.out.print(cine[i][j] + " ");

    // }
    // System.out.println();

    // }

    // }

    // public static void limpiarCine(int[][] cine) {

    // // bucle externo

    // for (int i = 0; i < cine.length; i++) {
    // for (int j = 0; j < cine[i].length; j++) {
    // cine[i][j] = 0;
    // System.out.print(cine[i][j] + " ");

    // }
    // System.out.println();

    // }

    // }

    // public static void reservarCine(int[][] cine) {

    // boolean reservado = false;
    // for (int i = 0; i < cine.length && !reservado; i++) {
    // for (int j = 0; j < cine[i].length && !reservado; j++) {
    // if (cine[i][j] == 0) {
    // cine[i][j] = 1; // Reservar
    // reservado = true;
    // }
    // }
    // }
    // }

    // ** EJEMPLO 3 **

    // public static boolean cineCompra(int [][] sala) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Ingrese la fila del asiento (1-5): ");
    // int fila = scanner.nextInt() - 1;
    // System.out.print("Ingrese la columna del asiento (1-5): ");
    // int columna = scanner.nextInt() - 1;
    // if(sala [fila][columna]==0){
    // sala [fila][columna]=1;
    // return true;
    // } else {
    // System.out.println("Asiento ocupado");
    // return false;
    // }
    // }

    // public static void mapa( int [][] sala) {
    // for (int i = 0; i < 5; i++) {
    // for (int j = 0; j < 5; j++) {
    // System.out.print(sala[i][j] + " ");
    // }
    // System.out.println();
    // }
    // }

    // public static boolean menu( int [][] sala) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Menu:");
    // System.out.println("1. Comprar Asiento");
    // System.out.println("2. Mostrar Mapa");
    // System.out.println("3. Salir");
    // System.out.print("Seleccione una opcion: ");
    // int opcion = scanner.nextInt();

    // switch (opcion) {
    // case 1:
    // System.out.println("Comprar Asiento");
    // boolean compra=cineCompra(sala);
    // if(compra==false){
    // System.out.println("El asiento ya esta ocupado, por favor seleccione otro
    // asiento.");
    // }
    // break;
    // case 2:
    // System.out.println("Mostrar Mapa");
    // mapa(sala);
    // break;
    // case 3:
    // System.out.println("Salir");
    // break;
    // default:
    // System.out.println("Opcion no valida");
    // break;
    // }
    // return false;
    // }
}
