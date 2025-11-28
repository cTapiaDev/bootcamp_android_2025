package com.ejerciciostest;

public class GruaElectrica extends Maquina {
    private int nivelBatearia;

    public GruaElectrica(String modelo, int limiteHoras) {
        super(modelo, limiteHoras);
        this.nivelBatearia = 100;
    }

    @Override
    public void trabajar(int horas) throws MaquinaExcepcion {
        int consumoNecesario = horas * 10;

        if (this.nivelBatearia < consumoNecesario) {
            throw new MaquinaExcepcion("La Grúa " + this.modelo + " se quedó sin batería suficiente para seguir trabajando. Requiere " + consumoNecesario + "% pero tiene " + this.nivelBatearia + "%.");
        }

        this.nivelBatearia -= consumoNecesario;
        this.horasUso += horas;

        if (this.horasUso > this.limiteHoras) {
            throw new MaquinaExcepcion("La Grúa " + this.modelo + " ha excedido el limite de uso");
        }

        System.out.println("La Grúa " + this.modelo + " trabajó " + horas + " horas. Batería restante: " + this.nivelBatearia + "%");
    }

    @Override
    public void realizarMantenimiento() {
        super.realizarMantenimiento();
        this.nivelBatearia = 100;
        System.out.println("Batería recargada al 100% !!!");
    }
    
}
