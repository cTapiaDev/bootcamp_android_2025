-- SUBCONSULTAS

SELECT *
FROM productos
WHERE precio > (
	SELECT AVG(precio)
    FROM productos
);

-- SUBCONSULTAS IN
SELECT nombre, email
FROM usuarios
WHERE id_usuario IN (
	SELECT id_usuario
    FROM ordenes
    WHERE id_orden IN (
		SELECT id_orden
        FROM detalles_orden
        WHERE id_producto = 1
    )
);

-- NOT IN
SELECT nombre, email
FROM usuarios
WHERE id_usuario NOT IN (
	SELECT DISTINCT id_usuario
    FROM ordenes
);

SELECT AVG(gasto_total_cliente) as 'Promedio Global'
FROM(
	SELECT id_usuario, SUM(total) as gasto_total_cliente
    FROM ordenes
    GROUP BY id_usuario
) AS tabla_resumen;

SELECT *
FROM productos p
WHERE EXISTS (
	SELECT 1
    FROM detalles_orden d
    WHERE d.id_producto = p.id_producto
);

-- Forma nueva de hacer una subconsulta
WITH promedio_general AS (
	SELECT AVG(precio) AS precio_avg
    FROM productos
)
SELECT * FROM productos
JOIN promedio_general
WHERE precio > precio_avg;

-- Cambio de formato
SELECT
	UPPER(nombre) AS nombre_mayusculas,
    LOWER(categoria) AS categoria_minusculas,
    CONCAT(nombre, ' - $', precio) AS etiqueta_producto
FROM productos;

SELECT
	email,
    SUBSTRING_INDEX(email, '@', -1) AS proveedor_correo,
    LENGTH(email) AS extencion_email
FROM usuarios;

