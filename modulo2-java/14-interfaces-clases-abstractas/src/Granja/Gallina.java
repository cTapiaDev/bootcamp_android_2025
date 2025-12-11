package Granja;

public class Gallina extends Animal implements Productivo {

    public Gallina(String nombre) {
        super(nombre);
    }

    @Override
    public void producir() {
        System.out.println(this.nombre + " puso un huevo");
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.nombre + " dice: ¡Coco-rococó!");
    }
    
}
