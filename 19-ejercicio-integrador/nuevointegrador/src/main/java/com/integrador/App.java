package com.integrador;

/**
 * Sistema Eco-Smart Home
 *
 * --- Contexto del Proyecto
 * Una startup de tecnología verde ("GreenTech") está desarrollando un concentrador (Hub) para casas inteligentes. 
 * El objetivo no es solo encender y apagar luces, sino calcular la eficiencia energética del hogar. 
 * Necesitan un backend en Java que permita gestionar distintos tipos de dispositivos inteligentes, 
 * controlar sus estados y estimar el consumo eléctrico mensual.
 * 
 * 1. Modelado de Dispositivos (Herencia) -- Dispositivo
 * --- Atributos: id, nombre, estado (encendido/apagado) y ubicación.
 * --- Tres clases hijas --> 
 * -----> Lámpara Inteligente: Tiene un brillo de 0-100%
 * -----> Termostato: temperatura actual y deseada.
 * -----> Televisor: tiene números de canales y volumen.
 * 
 * 2. Lógica de Consumo
 * - No todos los dispositivos tienen el mismo nivel de consumo. 
 * - Implementa una interfaz llamada Consumible con el método calcularConsumoMensual(int horasDiarias)
 * - Regla Lámpara: Tiene un consumo base de 5 watts, pero si el brillo es mayor al 80%, consume un 20% extra.
 * - Regla Termostato: Su consumo es de 2000 watts, pero si la diferencia entre temperatura actual y deseada es menor a 2 grados, 
 * consume la mitad de watts (1000).
 * - Regla Televisor: Tiene un consumo de 150 watts, pero si está en "modo espera", consume una constante de 5 watts.
 * 
 * 3. El Hub Central (Gestor/main)
 * - Administrar la lista de dispositivos electronicos.
 * - Se debe hacer prueba de:
 * --> Agregar/Eliminar dispositivos.
 * --> Encender/Apagar todos los dispositivos. (Centralizado o por ubicación).
 * --> Reporte de consumo: este método debe recibir las horas promedio de uso diario y devolver el consumo total estimado de la casa en KW.
 * 
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        
    }
}
