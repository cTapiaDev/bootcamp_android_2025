public class App {
    public static void main(String[] args) throws Exception {
        

        // --- OPERADORES ARITMÉTICOS ---
        System.out.println("------------------------------");
        System.out.println("--- OPERADORES ARITMÉTICOS ---");
        System.out.println("------------------------------\n");

        /* 
         * Suma (+)
         * Resta (-)
         * Multiplicación (*)
         * División (/)
         * Módulo o Resto (%): Es lo que devuelve el resto de una división.
         */

        int numA = 10;
        int numB = 3;

        int suma = numA + numB;
        int resta = numA - numB;
        int multi = numA * numB;
        int division = numA / numB;
        int resto = numA % numB;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multi);
        System.out.println("División: " + division);
        System.out.println("Resto de la división: " + resto);


        // --- EL OPERADOR + CON STRINGS (Concatenación) ---
        System.out.println("\n---------------------");
        System.out.println("--- CONCATENACIÓN ---");
        System.out.println("---------------------\n");

        /*
         * número + número = Suma
         * String + String = Unión de textos
         * String + número = Unión (El número se convierte en texto)
         */

        String nombre = "Javier";
        String apellido = "García";
        int edad = 30;

        // String + String
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Nombre Completo: " + nombreCompleto);

        // String + número
        String presentacion = "Mi nombre es " + nombre + " y tengo " + edad + " años.";
        System.out.println(presentacion);

        System.out.println("Cálculo erróneo: 10 + 5 = " + 10 + 5);
        System.out.println("Cálculo correcto: 10 + 5 = " + (10 + 5));


        // --- OPERADORES DE ASIGNACIÓN ---
        System.out.println("\n--------------------------------");
        System.out.println("--- OPERADORES DE ASIGNACIÓN ---");
        System.out.println("--------------------------------\n");

        /*
         * Asignación simple (=)
         * Asignación compuesta (+=, -=, *=, /=) -> x += 5; -> x = x + 5;
         * Incremento (++) -> contador = 0; -> contador = contador + 1; -> contador++;
         * Decremento (--) contador--
         */

        int puntos = 100;

        // Sumarle 20 puntos
        // puntos = puntos + 20;
        puntos += 20;
        System.out.println("Puntos después de sumar: " + puntos);

        // Restarle 50
        puntos -= 50;
        System.out.println("Puntos después de restar: " + puntos);

        // Incrementar en 1
        int vidas = 3;
        // vidas = vidas + 1;
        vidas++;
        System.out.println("Vidas después de incrementar: " + vidas);


        // --- OPERADORES DE COMPARACIÓN ---
        System.out.println("\n---------------------------------");
        System.out.println("--- OPERADORES DE COMPARACIÓN ---");
        System.out.println("---------------------------------\n");

        /*
         * Igual a (==) -> Compara si dos valores son idénticos.
         * Distinto de (!=) -> Compara si dos valores son diferentes.
         * Mayor que (>) -> Si el valor de la izquierda es mayor que el de la derecha.
         * Menor que (<) -> Si el valor de la izquierda es menor que el de la derecha.
         * Mayor o igual que (>=)
         * Menor o igual que (<=)
         */

        int edad1 = 25;
        int edad2 = 25;

        boolean sonIguales = edad1 == edad2;
        boolean sonDiferentes = edad1 != edad2;
        boolean esMayor = edad1 > edad2;
        boolean esMenor = edad1 < edad2;
        boolean esMayorIgual = edad1 >= edad2;
        boolean esMenorIgual = edad1 <= edad2;

        System.out.println("¿Tienen la misma edad?: " + sonIguales);
        System.out.println("¿Tienen edades diferentes?: " + sonDiferentes);
        System.out.println("¿Su edad es mayor?: " + esMayor);
        System.out.println("¿Su edad es menor?: " + esMenor);
        System.out.println("¿Su edad es mayor o igual?: " + esMayorIgual);
        System.out.println("¿Su edad es menor o igual?: " + esMenorIgual);
    }
}
