import java.util.ArrayList;

import Personajes.Guerrero;
import Personajes.Mago;
import Personajes.Personaje;

public class App {
    public static void main(String[] args) throws Exception {
        // Tipo Nombre = Instancia
        Auto miAuto = new Auto();
        Auto miTercerAuto = new Auto("Toyota", "Corolla", "Verde");

        miAuto.marca = "Toyota";
        miAuto.color = "Rojo";

        Auto otroAuto = new Auto();

        otroAuto.marca = "Ford";
        otroAuto.color = "Azul";

        System.out.println("Mi auto es: " + miAuto.marca);
        System.out.println("Mi otro auto es: " + otroAuto.marca);

        miAuto.setVelocidad(100);
        otroAuto.setVelocidad(150);
        miTercerAuto.setVelocidad(50);

        System.out.println("La velocidad de mi auto es: " + miAuto.getVelocidad());
        System.out.println("La velocidad de mi otro auto es: " + otroAuto.getVelocidad());

        System.out.println("El modelo de mi tercer auto es: " + miTercerAuto.modelo);
        miTercerAuto.acelerar();



        System.out.println("\n-----------------------------\n");

        // Personaje heroe = new Personaje("Aragorn", "Guerrero");

    //     heroe.mostrarFicha();
    //     heroe.subirNivel();
    //     heroe.mostrarFicha();

        Guerrero guerrero = new Guerrero("William");
        Mago mago = new Mago("Merlin");

        guerrero.mostrarFicha();
        mago.lanzarBolaFuego(guerrero);

        mago.atacar(guerrero);
        guerrero.atacar(mago);

        System.out.println("\n-----------------------------\n");

        ArrayList<Personaje> horda = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            if (Math.random() > 0.5) {
                horda.add(new Guerrero("Soldado " + i));
            } else {
                horda.add(new Mago("Hechicero " + i));
            }
        }

        Personaje jefe = new Guerrero("BOSS");
        System.out.println("¡Una horda de " + horda.size() + " enemigos está atacando!");

        for (Personaje enemigo : horda) {
            enemigo.mostrarFicha();
            
            if (enemigo instanceof Mago) {
                ((Mago) enemigo).lanzarBolaFuego(jefe);
            } else {
                enemigo.atacar(jefe);
            }
            System.out.println("---");
        }

        jefe.mostrarFicha();
        
    }


    
}
