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

        int notaAlumno = 82;
        char calificacion;

        System.out.println("Revisando la nota: " + notaAlumno);

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


        System.out.println("\n--------------------------");
        System.out.println("--------------------------\n");
        System.out.println("\n--------------------------");
        System.out.println("--------------------------\n");

        // Ejercicio 1 - Alerta de Batería Baja
        int bateria = 38;
        final int LIMITE_BATERIA = 20;

        System.out.println("Nivel de batería actual: " + bateria + "%");

        if (bateria <= LIMITE_BATERIA) {
            System.out.println("¡ALERTA! Batería baja.");
            System.out.println("Por favor, conecta tu cargador.");
        }

        System.out.println("...el sistema sigue funcionando...");

        
        System.out.println("\n--------------------------");
        System.out.println("--------------------------\n");

        // Ejercicio 2 - Verificador de descuento para Estudiantes
        double precioBase = 100;
        boolean esEstudiante = false;

        final double DESCUENTO = 0.10;
        double precioFinal;

        System.out.println("Cliente comprando por $" + precioBase);

        if (esEstudiante == true) {
            System.out.println("Aplicando descuento de estudiante...");
            double montoDescuento = precioBase * DESCUENTO;
            precioFinal = precioBase - montoDescuento;
        } else {
            System.out.println("No se aplica descuento.");
            precioFinal = precioBase;
        }

        System.out.println("El precio final a pagar es: $" + precioFinal);



        System.out.println("\n--------------------------");
        System.out.println("--------------------------\n");


        // Ejercicio 3 - Termostato Inteligente
        /*
         * Opciones:
         * - Hace frío
         * - Está agradable
         * - Hace calor
         */

        int temperaturaActual = 35;

        final int TEMP_MIN_AGRADABLE = 18;
        final int TEMP_MAX_AGRADABLE = 25;

        String accionTermostato;

        if (temperaturaActual > TEMP_MAX_AGRADABLE) {
            // Camino: Calor
            accionTermostato = "Encender el aire acondicionado";
        } else if (temperaturaActual < TEMP_MIN_AGRADABLE) {
            // Camino: Frío
            accionTermostato = "Encender la calefacción";
        } else {
            // Camino: Agradable
            accionTermostato = "Modo espera. Temperatura agradable";
        }

        System.out.println("Temperatura: " + temperaturaActual + "°C");
        System.out.println("Acción: " + accionTermostato);


        System.out.println("\n--------------------------");
        System.out.println("--------------------------\n");

        // Ejercicio 4 - Calculadora de Propina
        /*
         * Estándar es 15%
         * Si damos menos del 5 nos va a decir que es baja
         * Si damos más del 5 nos va a decir que es generosa 
         * 
         * 1- Necesitamos la cuenta - double
         * 2- Almacenar el % de propina
         * 3- Calcular cuanto es la propina
         */

        double cuenta = 20;
        final double PORCENTAJE_PROPINA = 0.15;

        double propina = cuenta * PORCENTAJE_PROPINA;
        double totalConPropina = cuenta + propina;

        System.out.println("--- Boleta ---");
        System.out.println("Monto de la cuenta: $" + cuenta);
        System.out.println("Propina (15%): $" + propina);
        System.out.println("Total a Pagar: $" + totalConPropina);

        if (propina > 5) {
            System.out.println("Mensaje: Es una propina generosa.");
        } else {
            System.out.println("Mensaje: Es una propina baja.");
        }


        System.out.println("\n--------------------------");
        System.out.println("--------------------------\n");


        // Ejercicio 5 - Comisión por Ventas
        /*
         * Un vendedor gana comisión según cuánto vende.
         * Si vende más de $10.000 -> gana un 10% de comisión
         * Si vende entre $5.000 y $10.000 -> gana un 5% de comisión
         * Si vende menos de $5.000 -> gana un 2% de comisión
         */
        
        String vendedor = "Cristian";
        double totalVentas = 10000;
        double porcentajeComision;

        if (totalVentas > 10000){
            porcentajeComision = 0.1;
        } else if (totalVentas >= 5000){
            porcentajeComision = 0.05;
        } else {
            porcentajeComision = 0.02;
        }

        double totalComision = totalVentas * porcentajeComision;

        System.out.println("El vendedor " + vendedor + " gana una comisión de " + totalComision);

        System.out.println("\n--------------------------");
        System.out.println("--------------------------\n");


        double boleta = 10000;
        double comisionA = 0.1;
        double comisionB = 0.05;
        double comisionC = 0.02;

        if (boleta > 10000) {

            double comision = comisionA * boleta;
            System.out.println("Gana 10% de comision por una Boleta de: $" + boleta + " y Obtuvo una comision de: $" + comision);
            
        } else if(boleta <= 10000 & boleta >= 5000){

            double comision = comisionB * boleta;
            System.out.println("Gana 5% de comision por una Boleta de: $" + boleta + " y Obtuvo una comision de: $" + comision);
        
        } else {

            double comision = comisionC * boleta;
            System.out.println("Gana 2% de comision por una Boleta de: $" + boleta + " y Obtuvo una comision de: $" + comision);
        }
        


        



        
    }
}
