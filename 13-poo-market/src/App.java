import Productos.Alimento;
import Productos.Electronico;

public class App {
    public static void main(String[] args) throws Exception {

        Electronico celular = new Electronico("iPhone 15", 1000.0, 1, "Apple");
        Alimento leche = new Alimento("Leche", 1.5, 2, 10);
        Alimento yogurt = new Alimento("Yogurt", 1.0, 30, 2);

        Cliente cliente1 = new Cliente("Juan Pérez", true);

        System.out.println("--- Iniciando venta para " + cliente1.getNombre() + " ---");
        Ticket ticket = new Ticket(cliente1);

        ticket.agregarProducto(leche);
        ticket.agregarProducto(leche);
        ticket.agregarProducto(leche); // Debería dar un error

        ticket.agregarProducto(celular);
        ticket.agregarProducto(celular); // Debería dar un error

        ticket.agregarProducto(yogurt);

        ticket.imprimirRecibo();


    }
}
