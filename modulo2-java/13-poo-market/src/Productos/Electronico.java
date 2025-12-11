package Productos;

public class Electronico extends Producto {
    private String marca;
    
    public Electronico(String nombre, double precioBase, int stock, String marca) {
        super(nombre, precioBase, stock);
        this.marca = marca;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioConIva = super.calcularPrecioFinal();
        double impuestoLujo = this.precioBase * 0.10;
        return precioConIva + impuestoLujo;
    }

    public String getMarca() { return this.marca; }
}
