package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach // Se ejecuta antes de cada @Test
    void setup() {
        calculadora = new Calculadora();
        System.out.println("Método setup...");
    }

    @Test
    void testSumar() {
        int resultado = calculadora.sumar(5, 5);

        assertEquals(10, resultado);
    }

    @Test
    @DisplayName("Probando la división normal")
    void testDividir() {
        System.out.println("TestDividir...");

        assertEquals(5.0, calculadora.dividir(10, 2));
    }

    @Test
    @DisplayName("Debe lanzar una excepción si divido por cero")
    void testDividirCero() {
        System.out.println("TestDividirCero...");

        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(10.0, 0.0);
        });
    }

    
}
