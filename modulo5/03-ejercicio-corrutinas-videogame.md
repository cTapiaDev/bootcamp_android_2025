# VideoGame "Cloud" Library (Coroutines Edition)
La tienda de videojuegos ha decidido mover su catálogo a la "nube". Ahora , al solicitar un juego, la aplicación debe simular una conexión con un servidor remoto. Como el servidor puede estar saturado, debemos implementar un sistema asíncrono robusto para no congelar la experiencia del usuario.

---

## Requerimientos Técnicos

#### 1. Capa Modelo
Modifica tu `GameRepository` para simular latencia de red
- La función principal debe cambiar a `suspend`
- Debe utilizar `withContext(Dispatchers.IO)`
- Debe incluir un `delay` aleatorio entre <b>2000 y 5000 milisegundos</b>
- Debe tener un <b>20% de probabilidad de fallo</b> (usando `Result<VideoGame>`) para simular errores de conexión

#### 2. Capa Vista
Actualizar `activity_main.xml` para manejar los estados de carga:
- Agrega un `ProgressBar` <b>circular</b> que se muestre solo mientras se "descarga" el juego.
- Agrega un `TextView` <b>de estado</b> (ej: "Conectando...", "Descargando...", "Error de red...", etc.).
- Agrega un <b>Botón de "Carga Masiva"</b> que intente traer 3 juegos al mismo tiempo.

#### 3. Capa Controlador
En tu `MainActivity`, implementa lo siguiente:
- Al presionar "Siguiente Juego", usa `lifecycleScope` para llamar al modelo. Mientras carga, el botón debe desactivarse y el `ProgressBar` debe girar.
- Si el modelo devuelve un error, muestra un `Toast` informativo y cambia el color del texto de estado a rojo.
- Al presionar "Carga Masiva", usa `async` y `awaitAll` para solicitar 3 juegos simultáneamente.
  - Los 3 juegos deben pedirse al mismo tiempo y la carga total no debe superar los 5 segundos.
- Si el servidor tarda más de <b>4 segundos</b>, la corrutina debe cancelarse automáticamente y mostrar el mensaje: "Servidor fuera de servicio por lentitud. Intentalo más tarde".

---

## Pasos sugeridos
1. Cambia tu función de retorno simple por una `suspend fun` con `delay`
2. No olvides envolver la lógica del repositorio en `withContext(Dispatchers.IO)`
3. En la activity, usa `lifecycleScope.launch` para abrir el puente entre la UI y la suspensión.
4. Implementa un bloque `try/catch` especifico para manejar el `TimeoutCancellationException`

---

## Puntos Extras
Crea una pequeña barra de progreso horizontal que se llene de 0 a 100 mientras el juego se descarga
- Usa un `launch` secundario dentro de tu corrutina principal que actualice la barra cada 50ms, mientras el `witchContext(Dispatchers.IO)` está "descargando" el juego real.
