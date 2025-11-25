public class Pelicula extends Contenido {
    private boolean ganoOscar;

    public Pelicula(String titulo, int duracion, String genero, boolean ganoOscar) {
        super(titulo, duracion, genero);
        this.ganoOscar = ganoOscar;
    }

    @Override
    public void mostrarDetalles() {
        System.out.print("Pelicula: " + this.titulo + " (" + this.duracion + " min) [" + this.genero + "]");
        if (ganoOscar) {
            System.out.print(" ¡Ganó un oscar!");
        }
        System.out.println();
    }

    @Override
    public void reproducir() {
        System.out.println("Iniciando película...");
    }

    @Override
    public void pausar() {
        System.out.println("Película pausada");
    }
    
    
}
