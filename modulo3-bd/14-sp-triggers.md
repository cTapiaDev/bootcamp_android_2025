-- Stored Procedures (SP) 

-- Tenemos que actualizar el delimitador. Actualmente es ; y lo cambiaremos a //
DELIMITER //

CREATE PROCEDURE sp_aumento_masivo_precios(IN categoria_input VARCHAR(50), IN porcentaje INT)
BEGIN

	UPDATE productos
    SET precio = precio * (1 + (porcentaje / 100))
    WHERE categoria = categoria_input;
    
    SELECT CONCAT("Se actualizaron los precios de ", categoria_input) AS mensaje;
    
END //

DELIMITER ;

SELECT * FROM productos
WHERE categoria = 'Audio';

CALL sp_aumento_masivo_precios('Audio', 10);

DELIMITER //

CREATE PROCEDURE sp_reporte_stock(IN id_producto_buscado INT)
BEGIN
	
    DECLARE stock_actual INT;
    DECLARE nombre_prod VARCHAR(100);
    DECLARE mensaje_estado VARCHAR(100);
    
    SELECT stock, nombre INTO stock_actual, nombre_prod
    FROM productos
    WHERE id_producto = id_producto_buscado;
    
    IF stock_actual = 0 THEN
		SET mensaje_estado = 'AGOTADO: Urgente reponer';
	ELSEIF stock_actual < 5 THEN
		SET mensaje_estado = 'ALERTA: Queda poco stock';
	ELSE
		SET mensaje_estado = 'OK';
	END IF;
    
    SELECT nombre_prod, stock_actual, mensaje_estado;

END //

DELIMITER ;

CALL sp_reporte_stock(1);


-- TRIGGER

CREATE TABLE historial_precios (
	id_log INT AUTO_INCREMENT PRIMARY KEY,
    id_producto INT,
    precio_anterior DECIMAL(10, 2),
    precio_nuevo DECIMAL(10, 2),
    usuario_responsable VARCHAR(100),
    fecha_cambio DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- TRIGGER AFTER
DELIMITER //

CREATE TRIGGER trg_auditoria_precio
AFTER UPDATE ON productos
FOR EACH ROW
BEGIN

	IF OLD.precio <> NEW.precio THEN
		INSERT INTO historial_precios
        (id_producto, precio_anterior, precio_nuevo, usuario_responsable)
        VALUES
        (OLD.id_producto, OLD.precio, NEW.precio, USER());
    END IF;

END //

DELIMITER ;

UPDATE productos
SET precio = 999.9
WHERE id_producto = 1;

SELECT * FROM historial_precios;

-- TRIGGER BEFORE
DELIMITER //

CREATE TRIGGER trg_validar_stock
BEFORE INSERT ON productos
FOR EACH ROW
BEGIN
	
    IF NEW.stock < 0 THEN
		SET NEW.stock = 0;
	END IF;
    
END //

DELIMITER ;

INSERT INTO productos (nombre, categoria, precio, stock)
VALUES ('Producto Malo', 'Test', 10.00, -500);

SELECT * FROM productos;
