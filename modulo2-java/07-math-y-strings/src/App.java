import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        // La Clase Math
        /*
         * Math.random()
         */

        double numeroAleatorio = Math.random();
        System.out.println("Número aleatorio simple: " + numeroAleatorio); // 0.0 - 0.99...

        double escalado = numeroAleatorio * 10;
        System.out.println("Número escalado: " + escalado);

        int enteroAleatorio = (int) escalado;
        System.out.println("Número entero: " + enteroAleatorio);

        int dado = (int)(Math.random() * 6) + 1;
        /*
         * 1. Math.random() --> 0.0 a 0.99...
         * 2. Math.random() * 6 --> 0.0 a 5.99...
         * 3. (int)(...) --> 0, 1, 2, 3, 4 o 5
         * 4. ... + 1 --> 1, 2, 3, 4, 5 o 6
         */
        System.out.println("Dado: " + dado);

        System.out.println("\n----------------");
        System.out.println("----------------\n");

        // // Adivina el número
        // int numeroSecreto = (int)(Math.random() * 100) + 1; // Rango 1-100
        // Scanner sc = new Scanner(System.in);

        // int intentoJugador = 0;

        // System.out.println("Estoy pensando en un número entre 1 y 100...");
        // while (intentoJugador != numeroSecreto) {

        //     System.out.print("Ingresa el número: ");
        //     intentoJugador = sc.nextInt();

        //     if (intentoJugador == numeroSecreto) {
        //         System.out.println("¡GANASTE! Adivinaste el número secreto (" + numeroSecreto + ")");
        //     } else if (intentoJugador > numeroSecreto) {
        //         System.out.println("¡Fallaste! El número secreto es MÁS BAJO");
        //     } else {
        //         System.out.println("¡Fallaste! El número secreto es MÁS ALTO");
        //     }
        // }

        // sc.close();


        System.out.println("\n----------------");
        System.out.println("----------------\n");

        // La Clase String
        /*
         * Es inmutable. Quiere decir que no puede cambiar, una vez creado.
         * Esto quiere decir que todos los métodos no modifican al original,
         * crean una nueva copia.
         */

        // charAt(index)
        /*
         * ¿Qué carácter hay en la posición del índice?
         */
        String saludo = "Hola"; // H[0], o[1], l[2], a[3]

        char primeraLetra = saludo.charAt(0);
        
        System.out.println("La primera letra es: " + primeraLetra);

        for (int i = 0; i < saludo.length(); i++) {
            System.out.println("Letra en " + i + ": " + saludo.charAt(i));
        }

        System.out.println("\n----------------");
        System.out.println("----------------\n");



        // indexOf(String)
        /*
         * Es una especie de "buscador"
         * te va a dar la posición del elemento (índice)
         * si no lo encuentra, te va a dar un -1
         */
        String email = "carlos.santana@gmail.com";

        int posArroba = email.indexOf("@");
        int posPuntoCom = email.indexOf(".com");
        int posZeta = email.indexOf("z");

        System.out.println("El '@' está en el índice: " + posArroba);
        System.out.println("El '.com' está en el índice: " + posPuntoCom);
        System.out.println("La 'z' está en el índice: " + posZeta);


        System.out.println("\n----------------");
        System.out.println("----------------\n");



        // substring(inicio, fin)
        /*
         * Nos sirve para extraer un "trozo" del String original.
         */
        String usuario = email.substring(0, posArroba); // int beginIndex, int endIndex
        String dominio = email.substring(posArroba + 1); // int beginIndex

        System.out.println("Usuario: " + usuario);
        System.out.println("Dominio: " + dominio);


        System.out.println("\n----------------");
        System.out.println("----------------\n");


        // toUpperCase() y toLowerCase()
        /*
         * toUpperCase() = MAYÚSCULAS
         * toLowerCase() = minúsculas
         */
        
        String respuestaUsuario = " Si ";
        System.out.println("Respuesta original: [" + respuestaUsuario + "]");

        // .trim() --> Quita los espacios al principio y al final
        String respuestaLimpia = respuestaUsuario.trim().toLowerCase(); // "Si" -> "si"
        System.out.println("Respuesta limpia: [" + respuestaLimpia + "]");

        if (respuestaLimpia.equals("si")) { // equals me sirve para comprar cadenas
            System.out.println("El usuario confirmó");
        } else {
            System.out.println("El usuario denegó");
        }

        System.out.println("\n----------------");
        System.out.println("----------------\n");


        // replace(antiguo, nuevo)
        /*
         * Es básicamente un elemento que nos 
         * sirve para buscar y reemplazar
         */

        String frase = "El cielo es azul y el mar es azul";

        String fraseModificada = frase.replace("azul", "verde");

        System.out.println("Original: " + frase);
        System.out.println("Modificado: " + fraseModificada);
        
        String comentario = "Este producto es una estafa";
        String comentarioCensurado = comentario.replace("estafa", "*****");
        System.out.println("Censurado: " + comentarioCensurado);


        System.out.println("\n----------------");
        System.out.println("----------------\n");


        // Ejercicio: Generador de Nombres de Usuario
        String nombre = "Juan";
        String apellido = "Santana";

        System.out.println("Creando usuario para: " + nombre + " " + apellido);

        char primeraLetraNombre = nombre.charAt(0);
        int numeroRandom = (int)(Math.random() * 900) + 100;

        String nombreUsuario = primeraLetraNombre + apellido + numeroRandom;
        String usuarioFinal = nombreUsuario.toLowerCase();

        System.out.println("Username generado: " + usuarioFinal);


        System.out.println("\n----------------");
        System.out.println("----------------\n");


        // equals(String) y equalsIgnoreCase(String)
        /*
         * .equals() --> Va a comprobar si el contenido es idéntico (es sensible a mayúsculas).
         * .equalsIgnoreCase() --> Comprueba el contenido, e ignora si son mayúsculas o minúsculas.
         */
        String contrasenaGuardada = "JavaEsGenial123";
        String inputUsuario = "javaesgenial123";

        System.out.println("¿Comparando con == ?: " + (contrasenaGuardada == inputUsuario));

        System.out.println("¿Comparando con .equals()?: " + (contrasenaGuardada.equals(inputUsuario)));

        System.out.println("¿Comparando con .equalsIgnoreCase()?: " + (contrasenaGuardada.equalsIgnoreCase(inputUsuario)));



        System.out.println("\n----------------");
        System.out.println("----------------\n");

        // contains(texto)
        /*
         * Solo de vuelve un true o un false.
         * En caso de que el String contenga lo que buscamos.
         */

        String mensaje = "Este es un mensaje de oferta";

        if (mensaje.contains("oferta")) {
            System.out.println("La palabra si existe");
        } else {
            System.out.println("La palabra no existe");
        }



        System.out.println("\n----------------");
        System.out.println("----------------\n");

        // startsWith(prefijo) - endsWith(sufijo)
        /*
         * Podemos comprobar si el String empieza o termina con un texto específico.
         */

        String nombreArchivo = "documento_prueba.pdf";
        String url = "http://www.google.com";

        if (nombreArchivo.endsWith(".pdf")) {
            System.out.println("Es un archivo PDF válido");
        } else {
            System.out.println("Carga un archivo con el formato correcto");
        }

        if (!url.startsWith("https://")) {
            System.out.println("¡Advertencia! La conexión no es segura");
        }




        System.out.println("\n----------------");
        System.out.println("----------------\n");

        // isEmpty() y isBlank()
        /*
         * isEmpty() --> Devuelve un true solo si el largo es 0 --> ""
         * isBlank() --> Devuelve un true si el largo es 0 o si contiene espacios en blanco --> " ", "   "
         */

        String input1 = "";
        String input2 = "   ";

        System.out.println("Input 1 -- isEmpty: " + input1.isEmpty()); // true
        System.out.println("Input 2 -- isEmpty: " + input2.isEmpty()); // false
        System.out.println("Input 1 -- isBlank: " + input1.isBlank()); // true
        System.out.println("Input 2 -- isBlank: " + input2.isBlank()); // true



        System.out.println("\n----------------");
        System.out.println("----------------\n");

        // split(separador)

        String datos = "Manzana,Pera,Naranja,Plátano";
        
        String[] frutas = datos.split(",");

        System.out.println("Mi lista de frutas tiene " + frutas.length + " frutas");

        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }




    }
}
