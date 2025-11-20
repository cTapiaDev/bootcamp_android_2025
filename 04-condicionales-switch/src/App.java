public class App {
    public static void main(String[] args) throws Exception {

        // Operadores Lógicos
        // && (Y), || (O) ! (NOT)

        // Operador AND (&&)
        /*
         * Exige que AMBAS condiciones sean true.
         * Si una sola condición es false, el resultado total es false.
         * 
         * true && true = true
         * false && true = false
         * true && false = false
         * false && false = false
         */

        boolean carnet = false;
        boolean entrada = true;

        System.out.println("¿Tiene carnet?: " + carnet);
        System.out.println("¿Tiene entrada?: " + entrada);

        if (carnet == true && entrada == true) {
            System.out.println("¡Bienvenido al concierto!");
        } else {
            System.out.println("Acceso denegado.");
        }

        System.out.println("\n------------------------");
        System.out.println("------------------------\n");

        // Operador OR (||)
        /*
         * Solo necesito que UNA de las condiciones sea true.
         * Solo va a ser false si ambas son false.
         * 
         * true || true = true
         * false || true = true
         * true || false = true
         * false || false = false
         */

        boolean esEstudiante = false;
        boolean esJubilado = true;

        System.out.println("¿Es estudiante?: " + esEstudiante);
        System.out.println("¿Es jubilado?: " + esJubilado);

        if (esEstudiante == true || esJubilado == true) {
            System.out.println("¡Felicidades! Tienes un descuento.");
        } else {
            System.out.println("No tiene descuento que aplicar.");
        }


        System.out.println("\n------------------------");
        System.out.println("------------------------\n");

        // Operador NOT (!)
        /*
         * Simplemente va a invertir un booleano.
         * 
         * !true = false
         * !false = true
         * 
         * boolean estaLloviendo = false;
         * 
         * if (!estaLloviendo) {}
         */

        boolean tieneMembresia = true;
        System.out.println("¿Tiene membresia?: " + tieneMembresia);

        if (!tieneMembresia) {
            System.out.println("Por favor, pague su membresia.");
        } else {
            System.out.println("¡Bienvenido!");
        }


        System.out.println("\n------------------------");
        System.out.println("------------------------\n");


        // Switch
        /*
         * Semeja a la creación de un menú.
         */

        int diaSemana = 3;
        String nombreDia;

        if (diaSemana == 1) {
            nombreDia = "Lunes";
        } else if (diaSemana == 2) {
            nombreDia = "Martes";
        } else if (diaSemana == 3) {
            nombreDia = "Miércoles";
        } else if (diaSemana == 4) {
            nombreDia = "Jueves";
        } else if (diaSemana == 5) {
            nombreDia = "Viernes";
        } else if (diaSemana == 6) {
            nombreDia = "Sábado";
        } else if (diaSemana == 7) {
            nombreDia = "Domingo";
        } else {
            nombreDia = "Día inválido";
        }

        System.out.println("El día " + diaSemana + " es: " + nombreDia + " (else-if)");

        switch (diaSemana) {
            case 1: 
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
                break;
        }

        System.out.println("El día " + diaSemana + " es: " + nombreDia);


        System.out.println("\n------------------------");
        System.out.println("------------------------\n");


        String luz = "rojo";

        switch (luz) {
            case "rojo" -> {
                System.out.println("¡Detente!");
            }
            case "amarillo" -> System.out.println("Avanza con precaución");
            case "verde" -> System.out.println("¡Avanza!");
            default -> System.out.println("Semaforo malo.");
        }




    }
}
