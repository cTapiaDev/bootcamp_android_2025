# Proyecto Integrador: "TicketMaster Clone"
Una empresa de entretenmiento te ha contratado para crear el prototipo de su aplicación móvil para venta de entradas. Necesitan una navegación fluida, un diseño atractivo y un listado de eventos funcionales.

## Requerimientos Técnicos.
1. Lenguaje: Java
2. UI: XML
3. Binding: No olvidar integrar ViewBinding.
4. Datos: Crear datos de prueba ficticios.

## Estructura de Pantallas
### Login:
Diseño:
- Logo de app (ImageView).
- Campo Email.
- Campo Password.
- Botón Ingresar.

Lógica:
- Validar que los campos no estén vacíos.
- Validación simulada: Si el usuario es "alumno@dev.com" y pass "1234", se loguea. Si no, muestra un error (Puede ser un Toast).
- Al ingresar, navegar a Dashboard y matar el proceso del activity con finish().

---

### Dashboard:
Diseño:
- Header con el texto "Bienvenido, [Nombre del Usuario]" (Lo deben enviar desde el Login).
- Diseño central con 3 categorías: Conciertos - Deportes - Teatro (Pueden ser Fragment, Cards, etc.)

Lógica:
- Al dar clic en alguna de las categorías, debe navegar a una Lista de Eventos (asociados a la categoría).

---

### Lista de Eventos (RecyclerView)
Diseño:
- Título de la categoría (ej. Próximos Conciertos).
- RecyclerView que ocupe toda la pantalla.

Item:
- Imagen del evento.
- Título.
- Fecha.
- Precio.

Lógica:
- Crear el modelo del evento con los datos requeridos (nombre, fecha, lugar, precio, imagen, descripción).
- Implementar un adaptador.
- Generar una lista falsa de conciertos, juegos deportivos y obras de teatro. (5 por cada uno al menos).
- Click Listener: al tocar un evento, debe llevarnos al detalle del mismo.

---

### Detalle del Evento
Diseño:
- Imagen grande como header (puede ser la misma de antes u otra).
- Título y precio.
- Descripción del evento.
- Botón para comprar ticket.

Lógica:
- Recibir todos los datos mediante un intent.
- El botón de compra debe abrir wsp o alguna vía para compartir la información.
