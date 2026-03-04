-- Parte 1 (DDL)
-- 1. Crea una base de datos con el nombre pizza_planet_db
-- 2. Crea una tabla productos:
	-- Debe tener ID, nombre, descripción, precio y categoria.
    -- La categoria debe llevar un ENUM: 'Pizzas', 'Bebidas', 'Postres'.
    -- El precio no puede ser nulo.
-- 3. Crea una tabla clientes:
	-- Debe tener ID, nombre, dirección y teléfono.
    -- El teléfono debe ser único.
-- 4. Creación de estructura de ventas.
	-- Tabla pedidos: Quién compró (ID_cliente), cuándo (fecha/hora automática) y el total.
    -- Tabla detalle-pedido: Qué productos incluye ese pedido, cantidad y el precio de venta.
    -- IMPORTANTE: Establecer correctamente las Foreign Keys. Pueden agregarle una dependencia de borrado automático.
	-- (ON DELETE CASCADE).



-- 1
CREATE DATABASE IF NOT EXISTS pizza_planet_db;
USE pizza_planet_db;

-- 2
CREATE TABLE productos (
	id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(8, 2) NOT NULL,
    categoria ENUM('Pizzas', 'Bebidas', 'Postres') DEFAULT 'Pizzas' NOT NULL
);

DESCRIBE productos;

-- 3
CREATE TABLE clientes (
	id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(300),
    telefono VARCHAR(20) NOT NULL UNIQUE
);

-- 4
CREATE TABLE pedidos (
	id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(8, 2),
    
    CONSTRAINT fk_pedido_cliente 
		FOREIGN KEY (id_cliente)
		REFERENCES clientes(id_cliente)
);

CREATE TABLE detalle_pedido (
	id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL,
    precio_venta DECIMAL(8, 2) NOT NULL,
    
    CONSTRAINT fk_detalle_pedido
		FOREIGN KEY (id_pedido)
		REFERENCES pedidos(id_pedido)
		ON DELETE CASCADE,
	
    CONSTRAINT fk_detalle_producto
		FOREIGN KEY (id_producto)
        REFERENCES productos(id_producto)
        ON DELETE CASCADE
);



-- Parte 2 (DML) - Poblado de Datos
-- 1. Insertar al menos 5 productos variados (ej: "Pizza Margarita", "Pepsi", etc.)
-- 2. Inserta 3 clientes ficticios.
-- 3. Simulación de negocio:
	-- El cliente 1 llama y pide 2 Pizzas y 3 Bebidas
    -- (Genera los INSERT necesarios para registrar este pedido)
	-- Deben registrar un INSERT de pedidos.
    -- Deben registrar un INSERT de detalle_pedidos.
    
-- 1
INSERT INTO productos (nombre, categoria, precio) VALUES
('Pizza Margarita', 'Pizzas', 12.50),
('Pizza Pepperoni', 'Pizzas', 15.00),
('Lata Coca-Cola', 'Bebidas', 2.50),
('Agua Mineral', 'Bebidas', 1.50),
('Lata Monster', 'Bebidas', 5.00);

SELECT * FROM productos;

-- 2
INSERT INTO clientes (nombre, direccion, telefono) VALUES
('Juan Pérez', 'Av. Siempre Viva', '569123456578'),
('Maria Lopez', 'Calle los Robles 123', '1234564321'),
('Carlos Ruiz', 'Alameda 01', '+569 2341455');

SELECT * FROM clientes;

-- 3
INSERT INTO pedidos (id_cliente, total)
VALUES (1, 32.5);

SELECT * FROM pedidos;

INSERT INTO detalle_pedido (id_pedido, id_producto, cantidad, precio_venta) VALUES
(1, 1, 2, 12.50),
(1, 3, 3, 2.50);

SELECT * FROM detalle_pedido;
    
    
    
-- Parte 3 (Queries)
-- 1. Mostrar nombre y precio de todos los productos de categoría 'Pizzas' que cuesten menos de $15.00, 
-- ordenados del más barato al más caro.
-- 2. Encuentra el teléfono del cliente que se llama '<insert-nombre>'.
-- 3. Muestra todos los pedidos realizados hoy.

-- 1
SELECT nombre, precio FROM productos
WHERE categoria = 'Pizzas' AND precio < 15.00
ORDER BY precio;

-- 2
SELECT nombre, telefono FROM clientes
WHERE nombre LIKE '%maria%';

-- 3
SELECT * FROM pedidos
WHERE DATE(fecha) = CURRENT_DATE;
