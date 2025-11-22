package Granja;

public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public void comer() {
        System.out.println(this.nombre + " está comiendo");
    }

    public String getNombre() {
        return this.nombre;
    }
}
