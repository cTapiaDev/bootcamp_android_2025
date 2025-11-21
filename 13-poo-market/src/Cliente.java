public class Cliente {
    private String nombre;
    private boolean esVip;

    public Cliente(String nombre, boolean esVip) {
        this.nombre = nombre;
        this.esVip = esVip;
    }

    public String getNombre() { return nombre; }
    public boolean esVip() { return esVip; }
}
