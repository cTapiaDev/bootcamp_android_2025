-- Lógica para agrupar contenido
-- La cláusula GROUP BY
-- Filtrar por grupos (HAVING)

----------------
-- Agrupamiento básico

SELECT categoria, COUNT(*) AS 'Cantidad de productos'
FROM productos
GROUP BY categoria;

SELECT categoria, ROUND(SUM(precio * stock), 2) AS 'Valor de inventario'
FROM productos
GROUP BY categoria;

----------------
SELECT categoria, nombre, COUNT(*)
FROM productos
GROUP BY categoria;
-- No se puede hacer, ya que nombre no tiene espacio para poder visualizarse correctamente
-- En este caso, lo correcto es pedir solamente la cantidad de productos.
-- En resumen, quitarle 'nombre'

----------------
-- Reporte de peticiones agrupadas

SELECT
	categoria,
    COUNT(*) AS 'Cantidad de productos',
    ROUND(MIN(precio), 2) AS 'Precio más bajo',
    ROUND(MAX(precio), 2) AS 'Precio más alto',
    ROUND(AVG(precio), 2) AS 'Precio promedio'
FROM productos
GROUP BY categoria;

----------------
-- HAVING vs WHERE
----------------
-- WHERE: Filtra filas (antes de utilizar GROUP BY)
-- HAVING: Filtra grupos (luego de agrupar)

SELECT categoria, COUNT(*) as Cantidad
FROM productos
GROUP BY categoria
HAVING Cantidad >= 2;

SELECT categoria, COUNT(*) as Cantidad
FROM productos
WHERE precio > 25
GROUP BY categoria
HAVING Cantidad >= 2;
