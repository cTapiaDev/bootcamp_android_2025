# Desafío Pro: VideoGame Library (MVC Pattern)

### Contexto
Una tienda de videojuegos te ha pedido desarrollar el prototipo de su catálogo móvil. El objetivo es que la aplicación sea <b>escalable</b>, por lo que han exigido que se utilice estrictamente el patrón de arquitectura <b>MVC (Model-View-Controller)</b>.

La aplicación debe mostrar de forma aleatoria un juego de una base de datos local cada vez que el usuario presione un botón.

---

## Requerimientos Técnicos

#### 1. Organización del Proyecto
Debes crear una estructura de paquetes profesional. No se aceptarán archivos sueltos en el paquete principal:
- `tu.paquete.model`: Para la lógica de datos.
- `tu.paquete.ui`: Para el controlador (Activity).

#### 2. Capa Modelo
- <b>Clase de Datos (`VideoGame`):</b> Debe contener al menos: Título (String), Consola/Plataforma (String) y una referencia a la imagen (Int).
- <b>Repositorio (`GameRepository`):</b>
  - Debe contener una lista privada (`List`) con al menos 5 videojuegos.
  - Debe tener una función llamada `getRandomGame()` que devuelva un objeto `VideoGame` al azar.
  - <b>Regla de Oro:</b> Esta capa no puede importar nada que empiece con `android.widget` o `android.view`. Es Kotlin puro.

#### 3. Capa Vista
Diseña el archivo `activity_main.xml` una interfaz que incluya:
- Un `ImageView` para la portada del juego.
- Un `TextView` para el título (en negrita y tamaño grande).
- Un `TextView` para la plataforma (color gris y tamaño menor).
- Un `Button` con el texto "Siguente Juego".

#### 4. Capa Controlador
En tu `MainActivity`:
- Debes inicializar el `ViewBinding`.
- Debes tener una instancia del `Repository`.
- Al presionar el botón, el controlador debe:
  1. Pedirle al modelo un juego aleatorio.
  2. Actualizar los elementos de la vista con la información recibida.
 
---

## Pasos Sugeridos
1. <b>Recursos:</b> Busca 5 imágenes de juegos en Google. Cámbiales el nombre a minúsculas, sin espacios(ej: `zelda_botw.jpg`) y pégalas en `res/drawable`.
2. <b>Modelo:</b> Crea la `data class` y el `Repository`. Asegúrate de que el repositorio use los IDs de las imágenes que guardaste (ej: `R.drawable.zelda_botw`).
3. <b>Layout:</b> Construye el XML usando un `LinearLayout` vertical y centra los elementos.
4. <b>Binding:</b> Activa el `viewBingind` en tu archivo `build.gradle` (Module: app).
5. <b>Control:</b> Une las piezas en la `MainActivity`.

---

## Reto de Oro para Puntos Extras
Una vez que tu app funcione:
- Agrega un campo extra al modelo llamado `anioLanzamiento` (Int).
- Actualiza el repositorio para incluir los años de cada juego.
- Muestra el año en la pantalla debajo de la plataforma.
- <i>Responde en un readme: ¿Tuviste que cambiar la lógica de los botones para agregar este dato o solo el flujo de información?</i>
