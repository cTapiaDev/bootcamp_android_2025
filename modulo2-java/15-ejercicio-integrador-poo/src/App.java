import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* 
        * - Interfaz: Reproducible -> 2 métodos: reproducir y pausar.
        * 
        * - Clase Abstracta: Contenido
        *   Atributos: titulo, duracion, genero
        *   Método abstracto: mostrarDetalles()
        * 
        * - Clases Concretas: 
        *   - Pelicula:
        *       - Atributo: ganoOscar
        *       - Métodos: reproducir, pausar, mostrarDetalles.
        * 
        *   - Serie:
        *       - Atributo: temporadas, estaFinalizada.
        *       - Métodos: reproducir, pausar, mostrarDetalles.
        * 
        * - En el Main
        *   - Crear un ArrayList<Contenido>
        *   - Agregar 2 Peliculas y 2 Series
        *   - Crear un bucle polimórfico que simule una maratón.
        *   - Por cada elemento, deben mostrar su detalle.
        */

        ArrayList<Contenido> miLista = new ArrayList<>();

        miLista.add(new Pelicula("Inception", 120, "Ciencia Ficción", true));
        miLista.add(new Pelicula("Batman", 90, "Acción", false));
        miLista.add(new Serie("Breaking Bad", 50, "Drama", 5, true));
        miLista.add(new Serie("Stranger Things", 60, "Ciencia Ficción", 5, false));

        System.out.println("\n--- Mi lista de reproducción (" + miLista.size() + ") ---");

        for(Contenido e : miLista) {
            e.mostrarDetalles();
            e.reproducir();
            System.out.println("---------------------\n");
        }


    }
}
