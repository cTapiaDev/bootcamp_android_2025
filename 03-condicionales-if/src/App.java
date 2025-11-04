public class App {
    public static void main(String[] args) throws Exception {
        
        // CONDICIONAL IF
        /*
         * Si (if) está lloviendo (condición == true),
         * entonces {abro el paraguas}.
         */

        double nota = 5.5;
        final double NOTA_APROBACION = 4.0;

        if (nota >= NOTA_APROBACION) {
            System.out.println("¡Felicitaciones! Aprobaste");
        }

        System.out.println("Ejemplo de IF terminado.");

        System.out.println("\n--------------------------");
        System.out.println("--------------------------\n");



        // CONDICIONAL IF-ELSE
        /*
         * Si (if) llueve (condición == true), 
         * { abro el paraguas }
         * Si no (else)
         * { me pongo lentes de sol }
         */

        int edad = 16;
        final int LIMITE_EDAD = 18;

        System.out.println("Una persona de " + edad + " años quiere entrar.");

        if (edad >= LIMITE_EDAD) {
            // Bloque TRUE
            System.out.println("Acceso Permitido.");
        } else {
            // Bloque FALSE
            System.out.println("Acceso Denegado. Eres menor de edad.");
        }

        System.out.println("Fin de la revisión de edad.");

        System.out.println("\n--------------------------");
        System.out.println("--------------------------\n");



        // CONDICIONAL IF ELSE-IF
        /*
         * if (luz == "Rojo") { Detener el auto }
         * else if (luz == "Amarillo") { Bajar la velocidad }
         * else { Avanzar }
         */

        // Particularidades del ejemplo
        /*
         * Si la nota es 90 o más, es una "A".
         * Si no, pero es 80 o más, es una "B".
         * Si no, pero es 70 o más, es una "C".
         * Si no, pero es 60 o más, es una "D".
         * Si no cumple ninguna, es una "F".
         */

        int notaAlumno = 22;
        char calificacion;

        System.out.println("Revisando la nota: " + notaAlumno);

        System.out.println(notaAlumno >= 80);

        if (notaAlumno >= 90) {
            calificacion = 'A';
        } else if (notaAlumno >= 80) {
            calificacion = 'B';
        } else if (notaAlumno >= 70) {
            calificacion = 'C';
        } else if (notaAlumno >= 60) {
            calificacion = 'D';
        } else {
            calificacion = 'F';
        }

        System.out.println("La calificación en letra es: " + calificacion);

    }
}
