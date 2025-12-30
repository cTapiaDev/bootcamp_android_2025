-- Proyecto StreamDB
-- Debes diseñar la base de datos para una plataforma de streaming que gestione usuarios, el catálogo de películas y
-- el historial de visualizaciones.
-- Objetivo: Modelar, crear y poblar una base de datos relacional.

-- Entidades Requeridas:
-- Usuario: id_usuario (PK), nombre, email, plan (ej. 'Básico, 'Premium').
-- Película: id_pelicula (PK), titulo, genero, lanzamiento (año de lanzamiento)
-- Visualización: id_visualizacion (PK), id_usuario (FK), id_pelicula (FK), fecha_hora

-- 1. Entorno y Creación
	-- Crea la base de datos.
	-- Selecciona la base de datos.
    -- Verifica la creación listando las base de datos disponibles.
    
CREATE DATABASE IF NOT EXISTS streamdb;
USE streamdb;
SHOW DATABASES;
    
-- 2. DDL
	-- Crear las tablas de Usuario, Pelicula y Visualizacion.
    -- Definir correctamente las Primary Keys y los tipos de datos.
    -- Establecer las Foreign Keys y sus respectivas uniones.
    -- Aplicar restricciones NOT NULL en campos que pueda ser obligatorios (ej. email, titulo, etc.)

-- Entidades Requeridas:
-- Usuario: id_usuario (PK), nombre, email, plan (ej. 'Básico, 'Premium').
CREATE TABLE usuarios (
	id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    plan ENUM('Basico', 'Premium') DEFAULT 'Basico'
);

-- Película: id_pelicula (PK), titulo, genero, lanzamiento (año de lanzamiento)
CREATE TABLE peliculas (
	id_pelicula INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    genero VARCHAR(50),
    lanzamiento INT
);

-- Visualización: id_visualizacion (PK), id_usuario (FK), id_pelicula (FK), fecha_hora
CREATE TABLE visualizaciones (
	id_visualizacion INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_pelicula INT NOT NULL,
    fecha_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    
    CONSTRAINT fk_vis_usuario
		FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
        ON DELETE CASCADE,
	
    CONSTRAINT fk_vis_pelicula
		FOREIGN KEY (id_pelicula) REFERENCES peliculas(id_pelicula)
        ON DELETE CASCADE
);


-- 3. DML
	-- INSERT: Agregar 5 usuarios, 5 películas y 10 registros de visualizaciones.
INSERT INTO usuarios (nombre, email, plan) VALUES
('Juan Perez', 'juan@gmail.com', 'Basico'),
('Ana Gomez', 'ana@gmail.com', 'Premium'),
('Jose Vasquez', 'jose@gmail.com', 'Basico'),
('Luisa Lane', 'luisa@gmail.com', 'Premium'),
('Mari Lopez', 'maria@gmail.com', 'Basico');

INSERT INTO peliculas (titulo, genero, lanzamiento) VALUES
('Inception', 'Ciencia Ficción', 2011),
('Titanic', 'Romance', 1995),
('Avengers', 'Acción', 2012),
('Interestellar', 'Ciencia Ficción', 2012),
('El Padrino', 'Drama', 1970);

INSERT INTO visualizaciones (id_usuario, id_pelicula, fecha_hora) VALUES
(1, 1, '2025-11-01 20:00:00'),
(1, 3, '2025-11-01 20:00:00'),
(2, 2, '2025-11-01 20:00:00'),
(2, 1, '2025-11-01 20:00:00'),
(3, 5, '2025-11-01 20:00:00'),
(4, 4, '2025-11-01 20:00:00'),
(4, 1, '2025-11-01 20:00:00'),
(4, 2, '2025-11-01 20:00:00'),
(5, 3, '2025-11-01 20:00:00'),
(2, 5, '2025-11-01 20:00:00');    
    
    -- UPDATE: Modificar el plan de un usuario de 'Básico' a 'Premium'.
UPDATE usuarios
SET plan = 'Premium'
WHERE email = 'maria@gmail.com';

    -- DELETE: Eliminar una visualización específica por su ID.
DELETE FROM visualizaciones
WHERE id_visualizacion = 1;
    

    
-- 4. Consultas
	-- Listar todas las películas del género "Ciencia Ficción".
SELECT * FROM peliculas
WHERE genero = 'Ciencia Ficción';
    
    -- Mostrar el nombre del usuario y el título de la película que vio.
SELECT
	u.nombre,
    p.titulo
FROM usuarios u
INNER JOIN visualizaciones v ON u.id_usuario = v.id_usuario
INNER JOIN peliculas p ON v.id_pelicula = p.id_pelicula;

    -- Contar cuántas películas ha visto cada usuario.
SELECT 
	u.nombre,
	COUNT(v.id_visualizacion) AS 'Total Vistas'
FROM usuarios u
LEFT JOIN visualizaciones v ON u.id_usuario = v.id_usuario
GROUP BY u.id_usuario;

    -- Obtener el usuario que ha visto más películas.
SELECT
	u.nombre,
    COUNT(v.id_visualizacion) AS Total
FROM usuarios u
LEFT JOIN visualizaciones v ON u.id_usuario = v.id_usuario
GROUP BY u.id_usuario
ORDER BY Total DESC
LIMIT 1;
