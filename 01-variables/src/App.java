public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("--- Tipos de Variables ---");

        // TIPOS DE VARIABLES PRIMITIVAS

        System.out.println("\n--- 1. Variables Primitivas ---");

        // --- Números Enteros ---
        // byte: Rango -128 a 127
        byte numeroByte = 127;
        System.out.println("byte: " + numeroByte);

        // short: Rango -32.768 a 32.767
        short numeroShort = 32767;
        System.out.println("short: " + numeroShort);

        // int: Rango -2.147.483.648 a 2.147.483.647
        int numeroInt = -2147483648;
        System.out.println("int: " + numeroInt);

        // long: números muy grandes
        long numeroLong = 9000000000000000L;
        System.out.println("long: " + numeroLong);


        // --- Números Decimales (Flotantes) ---
        // float: número decimal simple.
        float numeroFloat = 3.1415f;
        System.out.println("float: " + numeroFloat);

        // double: número decimal más común y preciso.
        double numeroDouble = 3.141516;
        System.out.println("double: " + numeroDouble);

        
        // --- Otros tipos de datos Primitivos ---
        // boolean: Solo pueden ser verdadero (true) o falso (false)
        boolean esJavaDivertido = true;
        System.out.println("boolean: " + esJavaDivertido);

        // char: Representa un carácter único. *Se define solo con comillas simples ' '
        char inicial = 'C';
        System.out.println("char: " + inicial);


        System.out.println("-----------------------------");

        // TIPOS DE OBJETOS COMO VARIABLE

        System.out.println("\n--- 2. Variables de Objetos ---");
        // String: A pesar de ser un objeto, no deja de ser una cadena de texto.
        String saludo = "¡Hola, futuros programadores de Kotlin!";
        System.out.println("String: " + saludo);


        System.out.println("-----------------------------");

        // CONSTANTES
        System.out.println("\n--- 3. Constantes ---");
        // Se declara con la palabra "final". Por convención, se escriben en mayúscula.
        final double PI = 3.14;
        System.out.println("final: " + PI);


        System.out.println("-----------------------------");

        // INFERENCIAS DE TIPOS (A partir de Java 10)
        System.out.println("\n--- 4. Inferencia de Tipos con 'var' ---");

        var numeroInferido = 25;
        var textoInferido = "Java es genial";

        System.out.println("var (entero): El compilador infiere el tipo 'int': " + numeroInferido);
        System.out.println("var (texto): El compilador infiere el tipo 'String': " + textoInferido);




        System.out.println("\n-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------\n");


        String nombreCompleto = "Juan Pérez";
        int edad = 25;
        double salarioDeseado = 2500.00;
        boolean leGustanLosVideojuegos = true;

        System.out.println("--- Perfil del Usuario ---");
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Salario: $" + salarioDeseado);
        System.out.println("¿Le gustan los videojuegos?: " + leGustanLosVideojuegos);


        System.out.println("\n-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------\n");

        int cantidadManzanas = 5;
        double temperatura = 25.5;
        char colorPuerta = 'R';
        boolean hayClases = true;
    }
}
