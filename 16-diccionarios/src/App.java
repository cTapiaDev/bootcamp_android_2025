import java.util.HashMap;
import java.util.Scanner;

public class App {

    static HashMap<String, Usuario> baseDeDatos = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        // // Clave: String, Valor: String
        // HashMap<String, String> agenda = new HashMap<>();

        // // Guardar (put)
        // agenda.put("111-1", "jperez123");
        // agenda.put("111-2", "jramirez456");

        // // Obtener un valor (get)
        // String usuario = agenda.get("111-1");

        // System.out.println("Usuario: " + usuario);

        System.out.println("\n====================================\n");

        baseDeDatos.put("user1", new Usuario("Ana Lopez", "1234", 5000, TipoCuenta.AHORRO));
        baseDeDatos.put("user2", new Usuario("Juanito Perez", "abcd", 10000, TipoCuenta.CORRIENTE));

        System.out.println("¡BIENVENIDO AL BANCO!");

        try {
            login();
        } catch (Exception e) {
            System.out.println("Error en el sistema: " + e.getMessage());
        }
    }

    public static void login() {
        System.out.print("Usuario: ");
        String user = scanner.nextLine();

        System.out.print("Password: ");
        String pass = scanner.nextLine();

        if (baseDeDatos.containsKey(user)) {
            Usuario usuarioActual = baseDeDatos.get(user);

            if (usuarioActual.validarPassword(pass)) {
                System.out.println("¡Bienvenido " + usuarioActual.getNombre() + "!");
                menuUsuario(usuarioActual);
            } else {
                System.out.println("¡Contraseña incorrecta!");
            }
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    public static void menuUsuario(Usuario user) {
        while (true) {
            System.out.println("\nSaldo actual: $" + user.getSaldo());
            System.out.println("1. Retirar dinero");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                String entrada = scanner.nextLine();
                int opcion = Integer.parseInt(entrada); // Esto puede fallar

                if (opcion == 1) {
                    System.out.print("Monto a retirar: ");
                    double monto = Double.parseDouble(scanner.nextLine());

                    user.retirar(monto);
                    System.out.println("¡Retiro exitoso!");
                } else if (opcion == 2) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número valido");
            } catch (Exception e) {
                System.out.println("Transacción rechazada: " + e.getMessage());
            }
        }
    }
}
