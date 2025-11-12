import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        // ARRAYS
        int[] numeros = new int[4]; // index: 0, 1, 2, 3

        String diasDeSemana[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"}; // index: 0, 1, 2, 3, 4

        numeros[0] = 9;
        numeros[1] = 7;
        numeros[2] = 10;
        numeros[3] = 6;

        System.out.println("La primera nota es: " + numeros[0]);
        System.out.println("El tercer día es: " + diasDeSemana[2]);

        System.out.println("Tengo " + numeros.length + " notas");
        System.out.println("Tengo " + diasDeSemana.length + " días");


        System.out.println("\n---------------------------");
        System.out.println("---------------------------\n");


        String[] listaDeCompras = {"Leche", "Huevos", "Pan", "Manzanas", "Café", "Queso", "Jamón"};

        System.out.println("--- Mi Lista de Compras (" + listaDeCompras.length + " productos) ---");

        for (int i = 0; i < listaDeCompras.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + listaDeCompras[i]);
        }

        for (int i = 0; i < diasDeSemana.length; i++) {
            System.out.println(diasDeSemana[i]);
        }

        System.out.println("\n---------------------------");
        System.out.println("---------------------------\n");

        double[] notas = {6.5, 7.0, 4.2, 5.5, 3.3};
        double suma = 0.0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        double promedio = suma / notas.length;

        System.out.println("La suma de las notas es: " + suma);
        System.out.println("El promedio es: " + promedio);

        System.out.println("\n---------------------------");
        System.out.println("---------------------------\n");



        // FOR-EACH
        String[] listaDeLenguajes = {"Java", "Kotlin", "JavaScript", "Python", "C", "Go", "Cobol", "Ruby"};

        System.out.println("--- Lista de Lenguajes de Programación (con for-each) ---");

        for (String lenguaje : listaDeLenguajes) {
            System.out.println("Lenguaje: " + lenguaje);
        }



        System.out.println("\n---------------------------");
        System.out.println("---------------------------\n");

        // Ejercicio Integrador
        
        // double saldo = 1000.0;
        // int opcion;
        // Scanner sc = new Scanner(System.in);

        // do {
        //     System.out.println("\n\n--- BIENVENIDO AL BANCO ---");
        //     System.out.println("1. Consultar Saldo");
        //     System.out.println("2. Depositar Dinero");
        //     System.out.println("3. Retirar Dinero");
        //     System.out.println("4. Salir");
        //     System.out.println("Por favor, elija una opción: ");

        //     opcion = sc.nextInt();

        //     switch (opcion) {
        //         case 1:
        //             System.out.println("Su saldo actual es: $" + saldo);
        //             break;
        //         case 2:
        //             System.out.print("Ingrese el monto a depositar: $");
        //             double deposito = sc.nextDouble();
        //             saldo += deposito; // saldo = saldo + deposito;
        //             System.out.println("Depósito exitoso. Su nuevo saldo es: $" + saldo);
        //             break;
        //         case 3:
        //             System.out.print("Ingrese el monto a retirar: $");
        //             double retiro = sc.nextDouble();

        //             if (retiro > saldo) {
        //                 System.out.println("Error: Fondos insuficientes");
        //             } else {
        //                 saldo -= retiro; // saldo = saldo - retiro;
        //                 System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
        //             }
        //             break;
        //         case 4:
        //             System.out.println("¡Gracias por usar nuestro Banco!");
        //             break;
        //         default:
        //             System.out.println("Opción inválida. Por favor, intente de nuevo");
        //     }

        // } while (opcion != 4);

        // sc.close();




        System.out.println("\n---------------------------");
        System.out.println("---------------------------\n");

        // Ejercicio Integrador - Calificaciones del Curso

        double[] notas2 = {6.5, 4.0, 4.2, 5.5, 5.0, 3.4, 7.0, 2.0};

        double sumaTotal = 0.0;
        double notaMasAlta = notas2[0];
        double notaMasBaja = notas2[0];

        System.out.println("analizando " + notas2.length + " notas...");

        for (int i = 0; i < notas2.length; i++) {

            double notaActual = notas2[i];

            sumaTotal += notas2[i];

            if (notaActual > notaMasAlta) {
                notaMasAlta = notaActual;
            }

            if (notaActual < notaMasBaja) {
                notaMasBaja = notaActual;
            }
        }

        double promedioFinal = sumaTotal / notas2.length;

        System.out.println("\n--- REPORTE DEL CURSO ---");
        System.out.println("Promedio: " + promedioFinal);
        System.out.println("Nota más alta: " + notaMasAlta);
        System.out.println("Nota más baja: " + notaMasBaja);



    }
}
