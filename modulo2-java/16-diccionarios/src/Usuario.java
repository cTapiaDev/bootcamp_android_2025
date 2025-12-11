public class Usuario {
    private String nombre;
    private String password;
    private double saldo;
    private TipoCuenta tipo;

    public Usuario(String nombre, String password, double saldo, TipoCuenta tipo) {
        this.nombre = nombre;
        this.password = password;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public boolean validarPassword(String inputPass) {
        return this.password.equals(inputPass);
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad > saldo) {
            throw new Exception("Fondos insuficientes. Saldo actual: $" + this.saldo);
        }
        if (cantidad < 0) {
            throw new Exception("No puedes retirar cantidades negativas");
        }
        this.saldo -= cantidad;
    }

    public String getNombre() { return this.nombre; }
    public double getSaldo() { return this.saldo; }


}
