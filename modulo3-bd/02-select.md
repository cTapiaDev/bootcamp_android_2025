SELECT * FROM usuarios;

-- Insertar administrador
INSERT INTO usuarios (nombre, apellido, email, perfil)
VALUES ('Cuenta', 'Admin', 'admin@techzone.com', 'admin');

-- Insertar clientes
INSERT INTO usuarios (nombre, apellido, email) VALUES 
('Maria', 'García', 'maria.garcia@techzone.com'),
('Roberto', 'Pérez', 'roberto.perez@techzone.com');

-- Prueba: email duplicado
INSERT INTO usuarios (nombre, apellido, email) 
VALUES ('Maria', 'García', 'maria.garcia@techzone.com');
-- Mientras le intente pasar un email duplicado, no me va guardar la fila

-- Prueba: perfil inexistente
INSERT INTO usuarios (nombre, apellido, email, perfil) 
VALUES ('Maria', 'García', 'maria.garcia@techzone.com', 'invitado');
-- Tengo que si o si utilizar los perfiles ya listados


SELECT * FROM productos;

CREATE TABLE productos_oferta (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(100),
    precio_oferta DECIMAL(12, 3)
);

INSERT INTO productos_oferta (nombre_producto, precio_oferta)
SELECT nombre, (precio * 0.80)
FROM productos
WHERE precio < 100;

SELECT * FROM productos_oferta;

-- SELECT

SELECT nombre, precio
FROM productos;

-- Con esta forma me van a salir categorias repetidas
SELECT categoria FROM productos;

-- Filtrar los que son iguales
SELECT DISTINCT categoria FROM productos;

-- Filtros con WHERE
-- Manera exacta
SELECT * FROM productos WHERE categoria = 'Telefonía';

-- Mayor o menor
SELECT nombre, stock
FROM productos
WHERE precio > 1000;

-- Diferente de
SELECT nombre, categoria
FROM productos
WHERE categoria <> 'Periféricos';

-- Filtros con Rangos (BETWEEN)
SELECT * FROM productos
WHERE precio BETWEEN 80 AND 950;

-- Filtro de Listas (IN)
SELECT * FROM productos
WHERE categoria IN ('Periféricos', 'Audio', 'Accesorios');
