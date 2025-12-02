package com.integradordoc;


/**
 * 1. Interfaz: Inspeccionable
 * -- Método: boolean inspeccionar() -> Devuelve un true si la carga es segura para zarpar.
 * 
 * 2. Clase Abstracta: Carga
 * -- Atributo: id (String), pesoToneladas (double), destino (String).
 * -- Constructor.
 * -- Método: cargarEnBarco() <- si inspeccionar es true, la carga se sube al barco, si no, queda retenida en aduana.
 * 
 * 3. Clases Hijas
 * --- ContenedorEstandar
 * - Atributo: tieneSelloSeguridad (boolean)
 * - Regla de negocio: Solo pasa la inspección si el peso es menor a 30 toneladas y tiene el sello de seguridad intacto.
 * 
 * --- ContenedorQuimico
 * - Atributo: nivelPeligrosidad (int) // 1 al 5
 * - Regla de negocio: Solo la pasa la inspección si el peso es menor a 20 toneladas y el nivel de peligrosidad es menor a 4.
 * 
 * 4. Gestor (GruaPortuaria)
 * - Recibe un ArrayList<Carga>
 * - Procesa la lista intentando cargar todo en el barco. 
 */


public class App 
{
    public static void main( String[] args )
    {
        
    }
}
