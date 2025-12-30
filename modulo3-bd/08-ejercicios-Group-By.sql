-- Ejercicios

-- 1. "Necesito una lista que muestre el nombre del perfil y cuántos usuarios tenemos en cada uno"
-- 2. "Muestra cada categoría de productos y la suma total del dinero que representa ese stock (precio * stock).
-- Ordena de mayor a menor en base al dinero".
-- 3. "Cuenta cuántos productos distintos tenemos por categoría, PERO solo considera aquellos que tengan stock mayor a 5"
-- 4. "De la tabla ordenes, agrupa las compras por fecha (fecha_compra) pero solo del cliente con id_usuario = 1.
-- Muestra la fecha y cuánto gastó ese día.

-- 1
SELECT perfil, COUNT(*) AS 'Cantidad de usuarios'
FROM usuarios
GROUP BY perfil;

-- 2
SELECT categoria, SUM(precio * stock) AS 'Valor total de inventario'
FROM productos
GROUP BY categoria
ORDER BY SUM(precio * stock) DESC;

-- 3
SELECT categoria, COUNT(*) AS 'Productos disponibles'
FROM productos
WHERE stock > 5
GROUP BY categoria;

-- 4
SELECT DATE(fecha_compra) AS fecha, SUM(total) AS 'Total gastado'
FROM ordenes
WHERE id_usuario = 1
GROUP BY DATE(fecha_compra);
