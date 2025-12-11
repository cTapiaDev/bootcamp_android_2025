public class Cancion implements Reproducible {
    
    @Override
    public void reproducir() {
        System.out.println("Iniciando canción...");
    }

    @Override
    public void pausar() {
        System.out.println("Canción en pausa...");
    }
}
