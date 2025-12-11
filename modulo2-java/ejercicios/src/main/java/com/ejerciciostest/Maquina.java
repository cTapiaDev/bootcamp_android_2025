package com.ejerciciostest;

public abstract class Maquina implements Mantenible {
    protected String modelo;
    protected int horasUso;
    protected int limiteHoras;

    public Maquina(String modelo, int limiteHoras) {
        this.modelo = modelo;
        this.limiteHoras = limiteHoras;
        this.horasUso = 0;
    }

    public abstract void trabajar(int horas) throws MaquinaExcepcion;

    public void realizarMantenimiento() {
        this.horasUso = 0;
        System.out.println("\nSe realizó un mantenimiento a " + this.modelo + ". Horas reseteadas a 0.");
    }

    public String getModelo() {
        return this.modelo;
    }
    
}
