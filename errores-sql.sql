-- 1. Actualización Destructiva (DML)
Update empleados SET salario = 5000 WHERE id_empleado = 12;

-- 2. Vulnerabilidad de inyección SQL
ContentValues valores = new ContentValues();
valores.put("nombre", inputNombre);
db.insert("usuarios", null, valores);

-- 3. Agrupación sin función de agregación
SELECT departamento, COUNT(nombre) as total_empleados FROM empleados GROUP BY departamento;

-- 4. Iteración insegura de cursores
if (cursor.moveToFirst()) {
    String dato = cursor.getString(0);
}

-- 5. Pérdida de transacciones múltiples
db.beginTransaction();
try {
    db.execSQL("DELETE FROM logs");
    db.setTransactionSuccessful(); -- COMMIT
} finally {
    db.endTransaction();
}

-- 6. Bingind de Parámetros en Room DAO
@Query("SELECT * FROM usuarios WHERE id = :paramId")
fun obtenerUsuario(paramId: Int): Usuario