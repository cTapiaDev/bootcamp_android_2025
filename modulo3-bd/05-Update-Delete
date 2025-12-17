SELECT * FROM usuarios;
SELECT * FROM productos;

-- Actualización Simple (UPDATE)
UPDATE usuarios
SET apellido = 'Martínez'
WHERE id_usuario = 2;

-- Actualización Masiva
SET SQL_SAFE_UPDATES = 1; -- Desactiva el seguro de actualizaciones masivas
-- 0: Desactivado - 1:Activado

UPDATE productos
SET precio = 200.000;
-- Al realizar un UPDATE no olvidar el uso de WHERE

UPDATE productos
SET precio = precio + 50
WHERE nombre LIKE '%audifonos%';

-- Eliminar elementos (DELETE)
DELETE FROM productos
WHERE id_producto = 3;

INSERT INTO productos (nombre, categoria, precio, stock)
VALUES ('Parlante', 'Audio', '25', 5);
