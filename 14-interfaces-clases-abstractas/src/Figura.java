public abstract class Figura { // No puede ser instanciada
    protected String color;
    
    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea();

    public void mostrarColor() {
        System.out.println("Color: " + this.color);
    }
}
