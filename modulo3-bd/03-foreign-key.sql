SELECT * FROM productos;

-- Buscar cualquier producto que tenga la palabra "Gamer"
SELECT * FROM productos
WHERE fecha LIKE '%11%';

SELECT * FROM productos
WHERE nombre LIKE 'audifonos';

-- Cuando tengamos el simbolo "_" es para buscar un solo carácter
-- En cambio, el simbolo "%" básicamente significa "cualquier cosa"

SELECT * FROM productos
WHERE categoria = 'Computación' AND precio < 1000;
-- Consultas logicas se utilizan con AND y OR

SELECT * FROM productos
WHERE nombre LIKE '%Monitor%' OR precio > 1000;

-- Prioridad por paréntesis
SELECT * FROM productos
WHERE (categoria = 'Telefonía' OR categoria = 'Computación')
AND stock > 1;

-- ORDER BY: La idea es que los usuarios nunca vean los datos desordenados
SELECT nombre, precio FROM productos
ORDER BY precio;
-- Por defecto, siempre va a ordenar de manera ascendente (ASC)

SELECT nombre, precio FROM productos
ORDER BY precio DESC;

SELECT categoria, nombre, precio FROM productos
ORDER BY categoria ASC, precio DESC;
-- Primero ordena por categoría, y dentro de cada una, por precio

SELECT nombre, precio FROM productos
ORDER BY precio
LIMIT 3;

SELECT * FROM usuarios;

-- EJERCICIOS
-- 1) Busca productos de la categoria 'Telefonía' que cuesten más de 500 dolares
-- 2) Lista todos los productos que tengan stock entre 1 y 10 unidades, ordenados por cantidad de menor a mayor
-- 3) Encuentra todos los usuarios cuyo correo sea 'techzone.com'

-- 1
SELECT * FROM productos
WHERE categoria = 'Telefonía' AND precio > 500;

-- 2
SELECT * FROM productos
WHERE stock BETWEEN 1 AND 10
ORDER BY stock ASC;

-- 3
SELECT nombre, email FROM usuarios
WHERE email LIKE '%@techzone%';

SELECT * FROM usuarios;

CREATE TABLE ordenes (
	id_orden INT AUTO_INCREMENT PRIMARY KEY,
    
    -- Clave Foránea (FK)
    -- Debe ser el mismo campo que tiene la PK
    id_usuario INT NOT NULL,
    
    fecha_compra DATETIME DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10, 2) DEFAULT 0.00,
    estado ENUM('pendiente', 'pagado', 'enviado', 'cancelado') DEFAULT 'pendiente',
    
    -- DEFINICIÓN EXPLICITA DE LA RELACIÓN
    CONSTRAINT fk_orden_usuario
		FOREIGN KEY (id_usuario)
        REFERENCES usuarios(id_usuario)
        ON DELETE RESTRICT -- Si intento borrar el usuario, no voy a poder mientras esté relacionado a una orden
        ON UPDATE CASCADE -- Si cambio el ID del usuario, se actualiza en la relación
);

DESCRIBE ordenes;

CREATE TABLE detalles_orden (
	id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    
    id_orden INT NOT NULL,
    id_producto INT NOT NULL,
    
    -- Datos propios del detalle
    cantidad INT NOT NULL,
    precio_unitario DECIMAL(10, 2) NOT NULL,
    
    -- RELACIÓN CON ORDENES
    CONSTRAINT fk_detalle_orden
		FOREIGN KEY (id_orden)
        REFERENCES ordenes(id_orden)
        ON DELETE CASCADE,
        
	-- RELACIÓN CON PRODUCTOS
    CONSTRAINT fk_detalle_producto
		FOREIGN KEY (id_producto)
        REFERENCES productos(id_producto)
        ON DELETE RESTRICT
);


SELECT * FROM usuarios
WHERE id_usuario = 2;

-- Insertar un dato en ordenes
INSERT INTO ordenes (id_usuario, total, estado)
VALUES (2, 23000.00, 'pagado');

SELECT LAST_INSERT_ID();

INSERT INTO detalles_orden (id_orden, id_producto, cantidad, precio_unitario) VALUES
(1, 1, 1, 2000.00),
(1, 4, 2, 150.00);

SELECT * FROM detalles_orden;
