-- INNER JOIN 

-- Quiero traer los datos del usuario y de la orden al mismo tiempo
SELECT * FROM usuarios
INNER JOIN ordenes
ON usuarios.id_usuario = ordenes.id_usuario;

-- Lo que se debería hacer siempre, es limpiar una consulta con Alias
SELECT 
	u.nombre, 
	u.email, 
    o.id_orden, 
    o.total, 
    o.fecha_compra
FROM usuarios AS u
INNER JOIN ordenes AS o
ON u.id_usuario = o.id_usuario;


SELECT o.id_usuario, o.total
FROM usuarios AS u
INNER JOIN ordenes AS o
ON u.id_usuario = o.id_usuario;
