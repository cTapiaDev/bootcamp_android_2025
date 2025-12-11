package Personajes;
public class Personaje {

    // Atributos
    protected String nombre;
    protected String clase;
    protected int nivel;
    protected int vidaActual;
    protected int vidaMaxima;
    protected int ataque;
    protected int defensa;

    public Personaje(String nombre, String clase, int vidaMax, int atk, int def) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = 1;
        this.vidaMaxima = vidaMax;
        this.vidaActual = this.vidaMaxima;
        this.ataque = atk;
        this.defensa = def;
    }

    // public Personaje(String nombre, String clase) {
    //     this.nombre = nombre;
    //     this.clase = clase;
    //     this.nivel = 1;

    //     switch (clase.toLowerCase()) {
    //         case "guerrero":
    //             this.vidaMaxima = 150;
    //             this.ataque = 15;
    //             this.defensa = 5;
    //             break;
    //         case "mago":
    //             this.vidaMaxima = 80;
    //             this.ataque = 25;
    //             this.defensa = 0;
    //             break;
    //         case "picaro":
    //             this.vidaMaxima = 100;
    //             this.ataque = 20;
    //             this.defensa = 2;
    //             break;
    //         default:
    //             this.vidaMaxima = 50;
    //             this.ataque = 5;
    //             this.defensa = 0;
    //             break;
    //     }
    //     this.vidaActual = this.vidaMaxima;
    // }

    public void mostrarFicha() {
        System.out.println("\n--- FICHA DE PERSONAJE ---");
        System.out.println("Nombre: " + this.nombre + " | Clase: " + this.clase + " | Nivel: " + this.nivel);
        System.out.println("Vida: " + this.vidaActual + "/" + this.vidaMaxima);
        System.out.println("Ataque: " + this.ataque + " | Defensa: " + this.defensa);
        System.out.println("--------------------------");
    }

    public void subirNivel() {
        this.nivel++;
        this.vidaMaxima += 20;
        this.ataque += 5;
        this.vidaActual = this.vidaMaxima;
        System.out.println("¡" + this.nombre + " ha subido al nivel " + this.nivel + "!");
    }

    public void curar(int cantidad) {
        if (this.vidaActual == 0) {
            System.out.println(this.nombre + " está inconsciente y no puede curarse solo.");
            return;
        }

        this.vidaActual += cantidad;

        if (this.vidaActual > this.vidaMaxima) {
            this.vidaActual = this.vidaMaxima;
        }
        System.out.println(this.nombre + " se ha curado " + cantidad + " PV. Vida: " + vidaActual);
    }

    public void recibirDano(int cantidad) {
        int danoReal = cantidad - this.defensa;

        if (danoReal < 0) {
            danoReal = 0;
        }

        this.vidaActual -= danoReal;

        if (this.vidaActual <= 0) {
            this.vidaActual = 0;
            System.out.println(this.nombre + " ha recibido " + danoReal + " de daño y ha caído en combate");
        } else {
            System.out.println(this.nombre + " recibe " + danoReal + " de daño. Vida restante: " + this.vidaActual);
        }
    }

    public void atacar(Personaje enemigo) {
        System.out.println(this.nombre + " hace un ataque normal.");
        enemigo.recibirDano(this.ataque);
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean estaVivo() {
        return this.vidaActual > 0;
    }

}