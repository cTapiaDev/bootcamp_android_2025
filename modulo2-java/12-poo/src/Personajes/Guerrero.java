package Personajes;
public class Guerrero extends Personaje {
    
    // HEREDO DESDE PERSONAJE
    public Guerrero(String nombre) { 
        super(nombre, "Guerrero", 150, 15, 5);
    }

    @Override
    public void atacar(Personaje enemigo) {
        if (this.vidaActual < 50) {
            System.out.println("¡" + this.nombre + " entra en Furia y golpea doble!");
            enemigo.recibirDano(this.ataque * 2);
        } else {
            System.out.println(this.nombre + " golpea con su espada");
            enemigo.recibirDano(this.ataque);
        }
    }
}
