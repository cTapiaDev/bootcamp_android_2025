package com.ejerciciostest;

public class Excavadora extends Maquina {

    public Excavadora(String modelo, int limiteHoras) {
        super(modelo, limiteHoras);
    }

    @Override
    public void trabajar(int horas) throws MaquinaExcepcion {
        this.horasUso += horas;

        if (this.horasUso > this.limiteHoras) {
            throw new MaquinaExcepcion("La excavadora " + this.modelo + " ha excedido el limite de uso");
        }

        System.out.println("La excavadora " + this.modelo + " trabajó " + horas + " horas. (Total uso: " + this.horasUso + ")");
    }
    
}
