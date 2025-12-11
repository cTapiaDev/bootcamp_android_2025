SELECT VERSION();
SELECT USER();

CREATE DATABASE IF NOT EXISTS tech_zone;
USE tech_zone;

CREATE TABLE productos (
	id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(50),
    precio DECIMAL(10, 2) NOT NULL,
    stock INT DEFAULT 0,
    fecha_ingreso DATE DEFAULT (CURRENT_DATE)
);

INSERT INTO productos (nombre, categoria, precio, stock)
VALUES ('Laptop Gamer X1', 'Computación', 1200.50, 10);

INSERT INTO productos (nombre, categoria, precio, stock, fecha_ingreso)
VALUES ('Laptop Gamer X2', 'Computación', 1200.50, 10, '2025-12-02');

INSERT INTO productos (nombre, categoria, precio, stock) VALUES
('Mouse Inalámbrico', 'Periféricos', 25, 50),
('Teclado Mecánico', 'Periféricos', 80.00, 30),
('Monitor 24 pulgadas', 'Computación', 180.00, 15),
('Smartphone', 'Telefonía', 950, 5),
('Audifonos', 'Audio', 45.50, 150);

--

SELECT * FROM productos;

SELECT nombre, stock
FROM productos
WHERE stock <= 10;

SELECT * FROM productos
WHERE categoria = 'Computación' AND precio > 500;

--

CREATE TABLE usuarios (
	id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    
    -- Se suelen separar para filtrar mejor los datos
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    
    -- Si tengo un elemento unique, y alguien intenta guardar nuevamente el mismo email
    -- la DB va a dar un error, por que debe ser único
    email VARCHAR(100) NOT NULL UNIQUE,
    
    -- Solo se permiten los valores listados
    perfil ENUM('cliente', 'admin', 'vendedor') DEFAULT 'cliente',
    
    -- (0 o 1) 1 = Activo, 0 = Inactivo
    activo TINYINT DEFAULT 1,
    
    -- DATE = 'YYYY-MM-DD'
    -- DATETIME = 'YYYY-MM-DD HH:MM:SS'
    ultimo_login DATETIME DEFAULT CURRENT_TIMESTAMP
);

DESCRIBE usuarios;
DESCRIBE productos;

ALTER TABLE productos
MODIFY COLUMN precio DECIMAL(12, 3) NOT NULL;

ALTER TABLE productos
CHANGE COLUMN fecha_ingreso fecha DATE DEFAULT (CURRENT_DATE);

ALTER TABLE productos
ADD COLUMN descripcion TEXT AFTER categoria;

ALTER TABLE productos
DROP COLUMN descripcion;


--

CREATE TABLE borrame (
	id INT,
    dato VARCHAR(10)
);

INSERT INTO borrame (id, dato) VALUES 
(1, 'uno'),
(2, 'dos'),
(3, 'tres'),
(4, 'cuatro'),
(5, 'cinco'),
(6, 'seis');

SELECT * FROM borrame;

-- Este comando elimina todos los datos de la tabla, pero conserva la estructura de la misma
TRUNCATE TABLE borrame;

DROP TABLE borrame;

-- INT -- Números enteros
-- VARCHAR(n) -- Textos variables
-- CHAR(n) -- Siglas, prefijos
-- TEXT -- Textos muy largos, Comentarios o Posts
-- DECIMAL(m, d) -- Dinero o finanzas
-- DATE -- Solo la fecha 'YYYY-MM-DD'
-- DATETIME -- Fecha + Hora 'YYYY-MM-DD HH:MM:SS'
-- TINYINT -- Reemplaza a un boolean - 1 (True), 0 (False)