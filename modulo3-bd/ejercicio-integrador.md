# Sistema de Logística y Mantenimiento "TransAndes"

<b>Contexto:</b> La empresa de transporte "TransAndes" tiene un desastre en sus registros. Tienen camiones, choferes, rutas asignadas y un historial de reparaciones mecánicas, pero todo está en cuadernos separados. El Gerente de Operaciones necesita cruzar información crítica: "¿Qué camión gasta más combustible por kilómetro?", "¿Estamos gastando más en reparaciones que lo que produce el camión?", "¿Qué choferes tienen licencia por vencer?".

---

## Requerimientos del modelo (Tablas):
1. <b>Vehículos:</b> Deben tener patente, modelo, año, kilometraje actual y estado (Activo, En Taller, Baja).
2. <b>Conductores:</b> Nombre, licencia, fecha de vencimiento de licencia y categoría.
3. <b>Rutas:</b> Origen, destino y distancia estándar en KM.
4. <b>Bitácora de Viajes (Tabla Central):</b> Registra qué conductor usó qué vehículo, en qué ruta, la fecha, y cuánto combustible consumió realmente.
5. <b>Mantenimientos:</b> Registra las reparaciones de los vehículos (Costo, descripción, fecha, tipo: Preventivo/Correctivo).

## Reglas de Negocio:
- El kilometraje de un vehículo no puede ser negativo.
- El costo de mantenimiento debe ser mayor a 0.
- El consumo de combustible no puede ser 0.

## Entregable SQL:
1. Script de creación de la base de datos con integridad referencial (FK).
2. Poblado de datos coherente (al menos 5 vehículos, 5 choferes, 5 rutas, 10 viajes, 5 mantenimientos).
3. <b>Reportes (Queries):</b>
    - <u>Eficiencia:</u> Calcular el rendimiento (Km/Litro) promedio por vehículo.
    - <u>Alerta:</u> Listar conductores con licencias que vencen en el próximo mes (o año actual).
    - <u>Finanzas:</u> Calcular el "Costo Total de Propiedad" por vehículo (Suma de mantenimientos).
4. <b>Vista Ejecutiva:</b> Una vista que muestre: Patente, Modelo, Total de Viajes realizados y Total gastado en Mantenimiento.
