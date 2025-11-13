public class App {
    public static void main(String[] args) throws Exception {
        

        /*
         * WET --> Write Everything Twice / Escribelo Todo Dos Veces.
         * DRY --> Don't Repeat Yourself / No Te Repitas.
         */

        saludar();

        saludarPersona("Roberto");
        saludarPersona("Ana");

        registrarUsuario("admin", "admin");

        int resultadoSuma = sumar(10, 5);
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("El doble de la suma es: " + (resultadoSuma * 2));


        System.out.println("\n------------------------\n");

        // Refactorizar código
        double[] cursoA = {5.6, 4.1, 2.6, 7.0};
        double promA = calcularPromedio(cursoA);
        System.out.println("Promedio A: " + promA);

        double[] cursoB = {6.6, 2.1, 4.6, 6.5};
        double promB = calcularPromedio(cursoB);
        System.out.println("Promedio B: " + promB);

        double[] cursoC = {};
        double promC = calcularPromedio(cursoC);
        System.out.println("Promedio C: " + promC);
    }


    public static void saludar() {
        System.out.println("--- ¡Hola, Mundo! ---");
        System.out.println("¡Estoy dentro de un método!");
    }

    public static void saludarPersona(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido/a");
    }

    public static void registrarUsuario(String usuario, String password) {
        System.out.println("Registrando a '" + usuario + "' con la clave: '" + password + "'");
    }

    public static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        if (notas.length == 0) {
            return 0.0;
        }

        return suma / notas.length;
    }

}
