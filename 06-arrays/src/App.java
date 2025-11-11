public class App {
    public static void main(String[] args) throws Exception {
        

        // ARRAYS
        int[] numeros = new int[4]; // index: 0, 1, 2, 3

        String[] diasDeSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"}; // index: 0, 1, 2, 3, 4

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


    }
}
