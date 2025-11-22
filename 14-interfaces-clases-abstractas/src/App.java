import java.util.ArrayList;
import Granja.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Animal> misMascotas = new ArrayList<>();
        misMascotas.add(new Vaca("Lola"));
        misMascotas.add(new Gallina("Turuleca"));
        misMascotas.add(new Perro("Firulais"));

        for (Animal a : misMascotas) {
            a.hacerSonido();
        }

        System.out.println("\n-------------------------\n");

        ArrayList<Productivo> unidadesDeProduccion = new ArrayList<>();
        unidadesDeProduccion.add(new Vaca("Lola"));
        unidadesDeProduccion.add(new Gallina("Turuleca"));
        unidadesDeProduccion.add(new Tractor("John Deere"));

        for (Productivo unidad : unidadesDeProduccion) {
            unidad.producir();
        }

    }
}
