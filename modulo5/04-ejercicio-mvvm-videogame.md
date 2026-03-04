# GameLibrary: La Evolución a MVVM
La empresa está contenta con la aplicación que muestra la lista de videojuegos, pero los usuarios han reportado un problema grave: <b>"Cada vez que giro el celular para ver mejor el contenido, la lista desaparece y se vuelve a cargar todo de cero".</b>

El equipo de arquitectura ha decidido que la estructura actual (MVC) es insostenible. Se te ha asignado la misión de <b>refactorizar</b> la aplicación para implementar el patrón <b>MVVM (Model-View-ViewModel)</b>.

---

## Requerimientos Técnicos

#### 1. Desacoplar la lógica
- La `MainActivity` ya no debe tener acceso directo al `GameRepository`.

#### 2. Persistencia de Estado
- La lista de juegos y el estado de carga (`ProgressBar`) deben sobrevivir a la rotación de pantalla.

#### 3. Reactividad
- La interfaz debe actualizarse automáticamente observando los cambios en los datos (`LiveData`).

---

## Paso a Paso
1. Asegúrate de tener las librerías de ciclo de vida en tu `build.gradle (Module: app)`.
2. Crea el ViewModel
   - Instancia `GameRepository` dentro del ViewModel.
   - Crea los LiveData: `_games` para la lista de juegos y `_isLoading` para mostrar/ocultar el ProgressBar.
3. Migra la función de carga:
   - Crea una función `fetchGames()`
   - Usa `viewModelScope.launch`
   - Dentro de la corrutina activa la carga, llama al repositorio, actualiza los `LiveData` y desactiva la carga.
4. Limpia la vista (Activity)
   - Refactoriza tu `MainActivity`
   - No olvides inyectar el viewModel y configurar los Observadores.
   - El botón de carga ahora solo debe llamar al `viewModel.fetchGames()`
  
---

## Prueba de Fuego
- <b>Mientras el ProgressBar está girando</b>, rota la pantalla de tu celular a horizontal.
- El `ProgressBar` NO debe desaparecer.
- La carga NO se reinicia.
- Cuando termina la carga, la lista aparece automáticamente en la pantalla horizontal.

---

## Bonus por Puntos
Implementar un manejo de errores Reactivo:
1. Agrega un `LiveData<String>` en el ViewModel llamado `errorMessage`.
2. En el Repository, simula un fallo aleatorio (ej: `if ((1..5).random() == 1) return Error`)
3. En el ViewModel, captura ese error y postéalo en el LiveData.
4. En la Activity, observa `errorMessage` y muestra un `Toast` solo cuando ocurra un error.
