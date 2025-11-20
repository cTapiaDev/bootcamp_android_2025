public class Auto {
    // Atributos
    String marca;
    String modelo;
    String color;
    private int velocidad;

    public Auto() {} // Constructor

    public Auto(String marca, String modelo, String color) { // Constructor
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }

    public void acelerar() {
        this.velocidad += 10;
        System.out.println("El auto " + this.marca + " aceleró. Velocidad: " + this.velocidad);
    }

    // Getter (Me sirve para leer)
    public int getVelocidad() {
        return this.velocidad;
    }

    // Setter (Me sirve para editar un atributo)
    public void setVelocidad(int nuevaVelocidad) {
        if (nuevaVelocidad >= 0) {
            this.velocidad = nuevaVelocidad;
        } else {
            System.out.println("Error: No se aceptan velocidades negativas.");
        }
    }
}