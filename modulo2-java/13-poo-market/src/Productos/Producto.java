package Productos;

public class Producto {
    protected String nombre;
    protected double precioBase;
    protected int stock;

    public Producto(String nombre, double precioBase, int stock) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public double calcularPrecioFinal() {
        return this.precioBase * 1.19;
    }

    public boolean vender() {
        if (this.stock > 0) {
            this.stock--;
            return true;
        } else {
            return false;
        }
    }

    public String getNombre() { return nombre; }
    public int getStock() { return stock; }
}
