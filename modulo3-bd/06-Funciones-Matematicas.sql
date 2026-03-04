-- COUNT, SUM, AVG, MAX, MIN
-- Alias (AS)
SELECT * FROM pizza_planet_db.productos;
SELECT * FROM productos;

-- 1. COUNT (Contar)
SELECT COUNT(*) FROM productos;

SELECT COUNT(*) AS 'Total clientes'
FROM usuarios WHERE perfil = 'cliente';

SELECT COUNT(descripcion) FROM pizza_planet_db.productos;

-- 2. SUM & AVG (Suma y Promedio)
SELECT SUM(stock) AS 'Unidades de Bodega' FROM productos;

SELECT AVG(precio) AS 'Precio Promedio' FROM productos;

SELECT SUM(total) AS 'Facturación Total' FROM ordenes;

SELECT SUM(total) AS 'Ventas del día' FROM ordenes
WHERE DATE(fecha_compra) = CURRENT_DATE;

-- 3. MAX y MIN
SELECT
	MAX(precio) AS 'Producto más caro',
    MIN(precio) AS 'Producto más barato'
FROM productos;

SELECT MIN(fecha_compra) AS 'Fecha de Inaguración' FROM ordenes;

SELECT MAX(ultimo_login) AS 'Última Conexión' 
FROM usuarios WHERE id_usuario = 1;

-- Calculos
SELECT SUM(precio * stock) AS 'Valor total del inventario'
FROM productos;

SELECT AVG(precio * 1.19) AS 'Precio promedio con IVA'
FROM productos;

SELECT nombre, MAX(precio) FROM productos; -- Esto es un error conceptual
SELECT nombre, precio 
FROM productos
ORDER BY precio DESC LIMIT 1;

-- Ejercicios
-- 1. Ticket promedio: ¿Cuánto gasta en promedio un cliente en cada compra? (tabla ordenes)
-- 2. Stock crítico: ¿Cuál es la cantidad mínima de stock que tenemos de algún producto? (tabla productos)
-- 3. Venta potencial: Si vendiéramos todo el stock de productos de la categoría 'Telefonía', ¿Cuánto dinero juntaríamos?
-- 4. Auditoria de pedidos: ¿Cuál es el número de pedido (ID) más alto generado hasta ahora?

-- 1
SELECT AVG(total) AS 'Ticket Promedio' FROM ordenes;

-- 2
SELECT MIN(stock) AS 'Stock crítico' FROM productos;

-- 3
SELECT ROUND(SUM(precio * stock), 2) AS 'Venta potencial'
FROM productos
WHERE categoria = 'Telefonía';

-- 4
SELECT MAX(id_orden) AS 'Último pedido' FROM ordenes;

-- Redondear
SELECT ROUND(AVG(precio), 2) FROM productos;
