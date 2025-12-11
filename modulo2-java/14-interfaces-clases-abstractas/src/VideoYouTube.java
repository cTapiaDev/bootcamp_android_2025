public class VideoYouTube implements Reproducible {

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo video en 4k...");
    }

    @Override
    public void pausar() {
        System.out.println("Video pausado...");
    }
    
}
