-- LEFT JOIN y RIGHT JOIN

-- Ingreso de cliente 'fantasma'
INSERT INTO usuarios (nombre, apellido, email, perfil)
VALUES ('Gasparin', 'SinCompras', 'gasparin@test.com', 'cliente');

-- Ingreso de 'producto olvidado'
INSERT INTO productos (nombre, categoria, precio, stock)
VALUES ('DVD', 'Electrónica', 20.00, 100);

SELECT * FROM usuarios WHERE email = 'gasparin@test.com';
SELECT * FROM productos WHERE nombre = 'DVD';


-- LEFT JOIN
SELECT
	u.nombre,
    u.email,
    o.id_orden,
    o.total
FROM usuarios u -- Le damos prioridad a esta tabla
LEFT JOIN ordenes o -- Figurar como un complemente de 'usuarios'
ON u.id_usuario = o.id_usuario;

-- Quiero buscar solo los usuarios que no tengan relación con alguna orden
SELECT
	u.nombre,
    u.email
FROM usuarios u
LEFT JOIN ordenes o ON u.id_usuario = o.id_usuario
WHERE o.id_orden IS NULL;

--
--

-- RIGHT JOIN
-- Es el espejo del LEFT JOIN
SELECT
	u.nombre,
    o.id_orden
FROM ordenes o 
RIGHT JOIN usuarios u
ON o.id_usuario = u.id_usuario;

--
-- Vamos a buscar productos sin ventas

SELECT
	p.nombre,
    p.stock,
    d.id_detalle
FROM productos p
LEFT JOIN detalles_orden d ON p.id_producto = d.id_producto
WHERE d.id_detalle IS NULL;
