package com.bootcamp;

public class BilleteraDigital {
    private double saldo;

    public BilleteraDigital() {
        this.saldo = 0;
    }

    public void cargarSaldo(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        this.saldo += monto;
    }

    public void pagar(double monto) {
        if (monto > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar este pago");
        }
        this.saldo -= monto;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean esUsuarioPremium() {
        return this.saldo >= 1000;
    }
}
