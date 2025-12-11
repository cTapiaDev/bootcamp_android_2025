package Granja;


public class Vaca extends Animal implements Productivo {

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.nombre + " dice: ¡Muuuu!");
    }

    @Override
    public void producir() {
        System.out.println(this.nombre + " está siendo ordeñada. Produciendo Leche");
    }
    
}
