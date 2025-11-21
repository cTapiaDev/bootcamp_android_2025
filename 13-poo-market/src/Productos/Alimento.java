package Productos;

public class Alimento extends Producto {
    private int diasParaVencimiento;

    public Alimento(String nombre, double precioBase, int stock, int diasParaVencimiento) {
        super(nombre, precioBase, stock);
        this.diasParaVencimiento = diasParaVencimiento;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioNormal = super.calcularPrecioFinal();

        if (this.diasParaVencimiento <= 3) {
            // System.out.println("¡¡OFERTA!! " + this.nombre);
            return precioNormal * 0.5;
        } else {
            return precioNormal;
        }
    }

}
