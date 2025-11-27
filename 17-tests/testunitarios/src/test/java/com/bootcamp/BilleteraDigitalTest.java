package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BilleteraDigitalTest {
    
    BilleteraDigital billetera;

    @BeforeEach
    void setup() {
        // System.out.println("Setup!!!");
        billetera = new BilleteraDigital();
    }

    @Test
    @DisplayName("Debe permitir cargar saldo positivo")
    void testCargarSaldo() {
        // System.out.println("testCargarSaldo...");
        billetera.cargarSaldo(150);
        assertEquals(150, billetera.getSaldo(), "El saldo actual es: " + billetera.getSaldo());
    }

    @Test
    @DisplayName("NO debe permitir cargar saldo negativo")
    void testCargarSaldoNegativo() {
        // System.out.println("testCargarSaldoNegativo...");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            billetera.cargarSaldo(-50);
        });

        assertEquals("El monto debe ser positivo", exception.getMessage());
    }

    @Test
    @DisplayName("Debe restar saldo al pagar")
    void testPagar() {
        // System.out.println("testPagar...");
        billetera.cargarSaldo(200);
        billetera.pagar(50);
        assertEquals(150, billetera.getSaldo());
    }

    @Test
    @DisplayName("Debe lanzar un error si no hay fondos suficientes")
    void testPagarSinFondos() {
        // System.out.println("testPagarSinFondos...");
        billetera.cargarSaldo(10);
        assertThrows(IllegalArgumentException.class, () -> {
            billetera.pagar(50);
        });
    }

    @Test
    @DisplayName("Debe identificar usuarios Premium")
    void testUsuarioPremium() {
        // System.out.println("testUsuarioPremium...");
        billetera.cargarSaldo(500);
        assertFalse(billetera.esUsuarioPremium(), "Con 500 no debería ser premium");

        billetera.cargarSaldo(700);
        assertTrue(billetera.esUsuarioPremium(), "Con más de 1000 debería ser premium");

    }

}
