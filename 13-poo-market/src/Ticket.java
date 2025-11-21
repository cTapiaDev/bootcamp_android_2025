import java.util.ArrayList;
import Productos.Producto;

public class Ticket {
    private Cliente cliente;
    private ArrayList<Producto> listaProductos;
    private double total;

    public Ticket(Cliente cliente) {
        this.cliente = cliente;
        this.listaProductos = new ArrayList<>();
        this.total = 0;
    }

    public void agregarProducto(Producto producto) {
        if (producto.vender()) {
            this.listaProductos.add(producto);
            this.total += producto.calcularPrecioFinal();
            System.out.println("Producto Agregado: " + producto.getNombre());
        } else {
            System.out.println("No hay stock de " + producto.getNombre());
        }
    }

    public void imprimirRecibo() {
        System.out.println("\n============================");
        System.out.println("        MARKET JAVA");
        System.out.println("============================");
        System.out.println("Cliente: " + cliente.getNombre() + (cliente.esVip() ? " [VIP]" : ""));
        System.out.println("----------------------------");

        for (Producto p : listaProductos) {
            System.out.println(p.getNombre() + " -- Precio: " + p.calcularPrecioFinal());
        }

        System.out.println("\n============================");
        System.out.printf("TOTAL A PAGAR: $%.2f", this.total);
        System.out.println("\n============================");
    }
}
