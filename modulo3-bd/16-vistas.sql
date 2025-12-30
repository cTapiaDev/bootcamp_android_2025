CREATE DATABASE IF NOT EXISTS edu_manager;
USE edu_manager;

CREATE TABLE profesores (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    especialidad VARCHAR(100)
);

CREATE TABLE alumnos (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100) UNIQUE
);

CREATE TABLE cursos (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    cupo INT NOT NULL,
    profesor_id INT,
    FOREIGN KEY (profesor_id) REFERENCES profesores(id)
);

CREATE TABLE inscripciones(
	id INT AUTO_INCREMENT PRIMARY KEY,
    curso_id INT,
    alumno_id INT,
    fecha_inscripcion DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (curso_id) REFERENCES cursos(id),
    FOREIGN KEY (alumno_id) REFERENCES alumnos(id),
    UNIQUE(curso_id, alumno_id)
);

DELIMITER //

CREATE PROCEDURE sp_inscribir_alumno(
	IN p_alumno_id INT,
    IN p_curso_id INT
)
BEGIN

	DECLARE v_cupo_max INT;
    DECLARE v_inscritos INT;
    DECLARE v_mensaje VARCHAR(100);
    
    SELECT cupo INTO v_cupo_max
    FROM cursos WHERE id = p_curso_id;
    
    SELECT COUNT(*) INTO v_inscritos
    FROM inscripciones WHERE curso_id = p_curso_id;
    
    IF v_inscritos < v_cupo_max THEN
		INSERT INTO inscripciones (curso_id, alumno_id)
        VALUES (p_curso_id, p_alumno_id);
        
        SELECT 'Inscripción realizada con éxito.' AS mensaje;
	ELSE
		SIGNAL SQLSTATE '35000'
        SET MESSAGE_TEXT = 'ERROR: el curso alcanzó su cupo máximo.';
	END IF;

END //

DELIMITER ;



INSERT INTO profesores (nombre, especialidad) VALUES
('Ana Lovelace', 'Algoritmos'),
('Alan Turing', 'Criptografía'),
('Grace Hopper', 'Compiladores');

INSERT INTO alumnos (nombre, email) VALUES
('Estudiante Uno', 'uno@escuela.com'),
('Estudiante Dos', 'dos@escuela.com'),
('Estudiante Tres', 'tres@escuela.com'),
('Estudiante Cuatro', 'cuatro@escuela.com'),
('Estudiante Cinco', 'cinco@escuela.com');

INSERT INTO cursos (nombre, cupo, profesor_id) VALUES
('Desarrollo Móvil Android', 20, 1),
('Base de Datos', 20, 2),
('Inteligencia Artificial', 1, 3);

CALL sp_inscribir_alumno(1, 3);

SELECT * FROM inscripciones;

CALL sp_inscribir_alumno(2, 3);

CALL sp_inscribir_alumno(2, 1);


CREATE OR REPLACE VIEW vista_detalle_inscripciones AS
SELECT
	i.fecha_inscripcion,
    c.nombre AS curso,
    p.nombre AS profesor,
    a.nombre AS alumno,
    a.email AS contacto_alumno
FROM inscripciones i
INNER JOIN cursos c ON i.curso_id = c.id
INNER JOIN profesores p ON c.profesor_id = p.id
INNER JOIN alumnos a ON i.alumno_id = a.id
ORDER BY c.nombre ASC, a.nombre ASC;

SELECT * FROM vista_detalle_inscripciones;

SELECT alumno, contacto_alumno, curso
FROM vista_detalle_inscripciones
WHERE profesor LIKE '%Turing%';

SELECT * FROM vista_detalle_inscripciones
WHERE DATE(fecha_inscripcion) = CURDATE();
