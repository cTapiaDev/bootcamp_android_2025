CREATE DATABASE IF NOT EXISTS normalizacion;

CREATE TABLE tabla_sucia (
	nombre_empleado VARCHAR(100),
    departamento VARCHAR(50),
    jefe_departamento VARCHAR(100),
    curso_capacitacion VARCHAR(100),
    fecha_curso DATE
);

INSERT INTO tabla_sucia (nombre_empleado, departamento, jefe_departamento, curso_capacitacion, fecha_curso) VALUES
('Juan Perez', 'Ventas', 'Boss', 'Excel Avanzado', '2025-12-22'),
('Juan Perez', 'Ventas', 'Boss', 'Java', '2025-12-22'),
('Ana Gomez', 'IT', 'Tech', 'Android', '2025-12-22'),
('Ana Gomez', 'IT', 'Tech', 'iOS', '2025-12-22');

SELECT * FROM tabla_sucia;

-- Vamos a normalizar esa tabla_sucia
CREATE TABLE departamentos (
	id_depto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    jefe VARCHAR(100)
);

CREATE TABLE cursos (
	id_curso INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100)
);

CREATE TABLE empleados (
	id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    id_depto INT,
		
	CONSTRAINT fk_empleado_depto
		FOREIGN KEY (id_depto) 
        REFERENCES departamentos(id_depto)
);

CREATE TABLE capacitaciones (
	id_capacitacion INT AUTO_INCREMENT PRIMARY KEY,
    id_empleado INT NOT NULL,
    id_curso INT NOT NULL,
    fecha DATE,
    
    CONSTRAINT fk_capacitacion_empleado
		FOREIGN KEY (id_empleado)
        REFERENCES empleados(id_empleado),
        
	CONSTRAINT fk_capacitacion_curso
		FOREIGN KEY (id_curso)
        REFERENCES cursos(id_curso)
);
