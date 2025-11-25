public class Serie extends Contenido {
    private int temporadas;
    private boolean estaFinalizada;

    public Serie(String titulo, int duracion, String genero, int temporadas, boolean estaFinalizada) {
        super(titulo, duracion, genero);
        this.temporadas = temporadas;
        this.estaFinalizada = estaFinalizada;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo " + this.titulo + "...");
    }

    @Override
    public void pausar() {
        System.out.println("Serie pausada");
    }

    @Override
    public void mostrarDetalles() {
        System.out.print("Serie: " + this.titulo + " [" + this.genero + "] - " + this.temporadas + " Temporadas");
        if (estaFinalizada) {
            System.out.print(" (Finalizada)");
        } else {
            System.out.print(" (En emisión)");
        }
        System.out.println();
    }
    
}
