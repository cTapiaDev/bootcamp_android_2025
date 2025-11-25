public abstract class Contenido implements Reproducible {
    protected String titulo;
    protected int duracion;
    protected String genero;

    public Contenido(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    public abstract void mostrarDetalles();
}
