package com.bootcamp;

public class Calculadora {
    
    public int sumar(int a, int b) {
        return a + b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No dividir por cero");
        }
        return a / b;
    }

}
