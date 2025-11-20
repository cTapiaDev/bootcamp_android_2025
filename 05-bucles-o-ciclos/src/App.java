import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        // BUCLE WHILE
        /*
         * (mientras)
         * Por cada vuelta del bucle, se hace una pregunta,
         * si la respuesta es TRUE nos mantenemos en el bucle.
         * si la respuesta es FALSE se termina el bucle.
         * -- La condición se evalúa al inicio del bucle.
         */

        int contador = 1;

        while (contador <= 5) {
            System.out.println("Conteo: " + contador);
            contador++; // Incrementador
        }

        System.out.println("¡Bucle terminado! Contador final: " + contador);

        System.out.println("\n------------------------");
        System.out.println("------------------------\n");

        // Ejemplo de Despegue
        int cuentaRegresiva = 10;
        
        System.out.println("Iniciando secuencia de lanzamiento...");

        while (cuentaRegresiva >= 1) {
            System.out.println(cuentaRegresiva + "...");
            cuentaRegresiva--;
        }

        System.out.println("¡DESPEGUE!");

        System.out.println("\n------------------------");
        System.out.println("------------------------\n");



        // BUCLE DO-WHILE
        /*
         * Entra al ciclo primero una vez, y luego se ejecuta la pregunta de la condición.
         * Nos va a garantizar que el bloque de código se ejecute al menos una vez.
         */

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MI MENÚ ---");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            System.out.println("Elige una opción: ");

            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("¡Hola!");
            } else if (opcion == 2) {
                System.out.println("¡Adiós!");
            }

        } while (opcion != 3);

        System.out.println("¡Programa terminado!");
        scanner.close();


        System.out.println("\n------------------------");
        System.out.println("------------------------\n");
        


        // BUCLE FOR
        /*
         * for ( inicialización; condición; actualización ) { Bloque de código }
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println("Contador: " + i);
        }

        System.out.println("\n------------------------\n");

        int tabla = 7;
        for (int i = 1; i <= 10; i++) {
            int resultado = tabla * i;
            System.out.println(tabla + " x " + i + " = " + resultado);
        }

        System.out.println("\n------------------------\n");

        int sumaTotal = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(sumaTotal + " + " + i);
            sumaTotal += i; // sumaTotal = sumaTotal + i;
            System.out.println(" = " + sumaTotal);
        }

        System.out.println("La suma total es: " + sumaTotal);
        

    }
}
