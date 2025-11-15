import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejercicio 1
        /*
         * 1. Crear un array de enteros int[] que contenga 6 notas.
         * 2. Crear un método que sirva para calcular el promedio.
         * 3. Utilizar un for-each para sumar las notas.
         * 4. Obtener el resultado del promedio (les puede ayudar .length)
         * 5. Recordar que el método debe retornar el resultado.
         * 6. La llamada del método para calcular el promedio debe guardar su resultado
         * en una variable dentro del main.
         */

        int[] notas = { 5, 3, 4, 6, 5, 7 };
        double resultado = promedioNotas(notas);
        System.out.println("El promedio es: " + resultado);

        // Ejercicio 2
        /*
         * 1. Crear un método que pueda contar las vocales que tiene una frase.
         * 2. No es necesario que el método retorne un dato.
         * 3. Dentro del bucle recuerden que para recorrer un texto, pueden utilizar
         * .chartAt(i)
         * 4. Recomendación: Pueden tener dentro del ciclo un switch que evalúe si es o
         * no una vocal.
         * 5. Solo importa saber cuantas vocales tiene la frase.
         */

        // lector();

        // Ejercicio 2 (-- Ejemplo 2)

        String frase = "Esta es una frase de ejemplo";
        int cantidadVocales = contarVocales(frase);
        System.out.println("La cantidad de vocales en la frase es: " + cantidadVocales);

        // Ejercicio 3 (-- Ejemplo 3)
        contarVocales2(frase);

        // ---- EJEMPLO DE MÉTODOS RECARGADOS ----
        int areaCuadrado = calcularArea(5);
        System.out.println("El área del cuadrado es: " + areaCuadrado);

        int areaRectangulo = calcularArea(4, 6);
        System.out.println("El área del rectángulo es: " + areaRectangulo);

        // EJERCICIO 3
        /*
         * 1. Crea una matriz de 3x3 de valores numéricos (Los valores pueden ser
         * aleatorios y asignados manual en la creación)
         * 2. Crea un método que permita encontrar el número más alto de la matriz.
         * 3. Recuerda utilizar bucles anidados [i][j] para poder recorrer una matriz
         * completa.
         */

        int[][] numeros = {
                { 3, 5, 20 },
                { 11, 23, 44 },
                { 100, 2, 203 }
        };

        int numeroMayor = numeroMasAlto(numeros);

        System.out.println("El numero mayor de la matriz es: " + numeroMayor);

        // EJERCICIO 4
        /*
         * 1. Crea un arreglo que contenga palabras prohibidas: 'oferta', 'gratis',
         * 'urgente'
         * 2. Simula un método que esté recibiendo el "asunto" de un correo para revisar
         * si contiene o no spam.
         * 3. Dentro del método valida que el asunto entregado no contenga alguna de las
         * palabras prohibidas.
         * 4. En caso de que si contenga 1 o más, retorna un boolean para avisar que
         * justamente es spam.
         */

        String[] palabrasProhibidas = {
                "oferta",
                "gratis",
                "urgente"
        };
        String asunto = "oferta, tienes que abrir esto";
        boolean validaCorreo = esSpam(asunto, palabrasProhibidas);
        System.out.println("¿Correo tiene SPAM? " + validaCorreo);

        // Ejercicio 4 (Ejemplo 2)

        String asunto2 = "urgente";
        int validarAsunto = validar(asunto2);

        if (validarAsunto == 1) {
            System.out.println("El correo es spam");
        } else {
            System.out.println("El correo no es spam ");
        }

    }

    // ----- Método Ejercicio 1 -----
    public static double promedioNotas(int[] notasParametro) {
        int suma = 0;
        double promedio = 0;

        for (int nota : notasParametro) {
            suma += nota;
        }

        promedio = suma / notasParametro.length;

        return promedio;
    }

    // ---- Método Ejercicio 2 ----
    // public static void lector() {
    // Scanner lector = new Scanner(System.in);

    // System.out.println("Ingrese una frase para saber cuantas vocales posee: ");
    // String frase = lector.nextLine();

    // int contador = 0;
    // char[] vocales = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

    // for (int i = 0; i < frase.length(); i++) {
    // char vocal = frase.charAt(i);
    // for (int j = 0; j < vocales.length; j++) {
    // if (vocal == vocales[j]) {
    // contador++;
    // }
    // }

    // }

    // System.out.println("La cantidad de vocales de la frase: " + frase + " son: "
    // + contador);
    // lector.close();
    // }

    // ---- Método Ejercicio 2 (Ejemplo 2) ----
    public static int contarVocales(String texto) {
        int contador = 0;
        texto = texto.toLowerCase(); // Para evaluar sin importar mayúsculas/minúsculas

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
                    break;
                default:
                    // No es vocal
                    break;
            }
        }
        return contador;
    }

    // --- Método Ejercicio 2 (Ejemplo 3) ---
    public static void contarVocales2(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase();
        char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < cadena.length(); i++) { // h -
            for (char vocal : vocales) {
                if (cadena.charAt(i) == vocal) {
                    contador++;
                    break;
                }
            }
        }
        System.out.println("Cantidad de vocales: " + contador);
    }

    // ---- EJEMPLO DE MÉTODOS RECARGADOS ----
    public static int calcularArea(int lado) {
        System.out.println("Llamando al método de 1 parámetro");
        return lado * lado;
    }

    public static int calcularArea(int base, int altura) {
        System.out.println("Llamando al método de 2 parámetros");
        return base * altura;
    }

    // EJERCICIO 3
    public static int numeroMasAlto(int numerosParametro[][]) {
        int numeroMayor = 0;

        for (int i = 0; i < numerosParametro.length; i++) {
            for (int j = 0; j < numerosParametro[i].length; j++) {
                int numeroActual = numerosParametro[i][j];
                if (numeroActual > numeroMayor) {
                    numeroMayor = numeroActual;
                }
            }
        }

        return numeroMayor;
    }

    public static int[][] MatrizAleatoria(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100); // rango 0–99
            }
        }
        return matriz;
    }

    // EJERCICIO 4
    public static boolean esSpam(String asunto, String[] prohibidas) {
        for (String palabra : prohibidas) {
            if (asunto.toLowerCase().contains(palabra)) {
                return true;
            }
        }
        return false;
    }

    // Ejercicio 4 (Ejemplo 2)

    public static int validar(String asunto) {
        if (asunto == null)
            return 0;
        String s = asunto.toLowerCase();
        if (s.contains("urgente") || s.contains("gratis") || s.contains("oferta")) {
            return 1;
        } else {
            return 0;
        }
    }
}
