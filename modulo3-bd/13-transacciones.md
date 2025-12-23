-- Transacciones

CREATE TABLE cuentas (
	id_cuenta INT PRIMARY KEY,
    titular VARCHAR(50),
    saldo DECIMAL(10, 2)
);

INSERT INTO cuentas VALUES 
(1, 'Juan (Origen)', 1000.00),
(2, 'Maria (Destino)', 0.00);

SELECT * FROM cuentas;

-- Una Transacción positiva
START TRANSACTION;

UPDATE cuentas
SET saldo = saldo - 200
WHERE id_cuenta = 1;

UPDATE cuentas
SET saldo = saldo + 200
WHERE id_cuenta = 2;

COMMIT;

SELECT * FROM cuentas;

-- Una Transacción que falla
START TRANSACTION;

UPDATE cuentas
SET saldo = saldo - 500
WHERE id_cuenta = 1;

SELECT * FROM cuentas;

UPDATE cuentas
SET saldo = saldo + 500
WHERE id_cuenta = 99;

ROLLBACK;

SELECT * FROM cuentas;
