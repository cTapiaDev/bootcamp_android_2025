# El Misterio del Dato Perdido (Persistencia)

---

Cuando giramos la pantalla, el sistema de Android <b>destruye</b> la actividad actual y crea una <b>nueva</b> para adaptar a su nuevo ancho, lo vimos durante la clase.
La ventaja es que si guarda los datos de componentes visuales (como textos escritos en EditText), pero <b>no guarda</b> los valores de nuestras variables globales en Kotlin.

### Desafío:
- Crea un `EditText`, un `Button` y un `TextView`.
- Crea una variable global llamada `var nombreUsuario: String = ''`
- Al presionar el botón, guarda el texto del `EditText` en la variable `nombreUsuario` y muéstralo en el `TextView`
- Escribe algo, presiona el botón. Verás tu nombre en el `TextView`. Ahora, <b>gira el teléfono</b>
- Observa cómo el `EditText` mantiene el texto, pero el `TextView` vuelve a su estado inicial
- Resuelve esto utilizando `onSaveInstanceState`
