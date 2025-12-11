package Granja;

public class Tractor implements Productivo {
    private String modelo;

    public Tractor(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void producir() {
        System.out.println("El Tractor " + this.modelo + " está cosechando el trigo");
    }
    
}
