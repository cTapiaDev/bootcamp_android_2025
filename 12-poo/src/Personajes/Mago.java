package Personajes;
public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre) {
        super(nombre, "Mago", 80, 25, 0);
        this.mana = 100;
    }

    public void lanzarBolaFuego(Personaje enemigo) {
        if (this.mana >= 20) {
            this.mana -= 20;
            System.out.println(this.nombre + " lanza bola de fuego! (-20 de maná)");
            enemigo.recibirDano(this.ataque);
        } else {
            System.out.println("¡No hay suficiente maná!");
        }
    }
}
