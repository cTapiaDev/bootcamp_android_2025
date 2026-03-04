// DESARROLLO INTERFAZ USUARIO ANDROID

// 1. Unidades de Medida Rígidas
<TextView android:layout_width="100dp" android:textSize="14sp" />

// 2. Vistas sin restricciones
<Button 
    android:id="@+id/btn"
    app:layout_constraintTop_toTopOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
/>

// 3. Textos codificados
<Button android:text="@string/btn_aceptar" />

// 4. Anidamiento de reciclaje
<androidx.recyclerview.widget.RecyclerView />

// 5. ViewBinding incompleto
setContentView(binding.root)

// 6. Actualización de UI desde background
runOnUiThread { textView.text = "Completado" }

-----------------------------------------
// ARQUITECTURA Y CICLO DE VIDA ANDROID

1. Memory Leak en ViewModel
class MiViewModel(private val repositorio: Repositorio) : ViewModel() {}

2. Mutación insegura de LiveData
viewModelScope.launch(Dispatchers.IO) {
    liveData.postValue("Datos")
}

3. Corrutinas Globales no controladas
viewModelScope.launch { descargarArchivo() }

4. Excepción por Lateinit no inicializado
lateinit var config: string
fun usar() {
    if (::config.isInitialized) {
        println(config.length)
    }
}

5. Uso inseguro de nulos
val usuario: Usuario? = obtenerUsuario()
usuario?.let { u -> println(u.nombre) }

6. Bloqueo del Hilo Principal
suspend fun procesar() {
    delay(3000L)
}

-----------------------------------------
// APPS EMPRESARIALES ANDROID

1. Retrofit: Conflicto de Verbos HTTP y Payload
@POST("/api/usuarios")

2. Room: Entidad sin llave primaria
@PrimaryKey(autoGenerate = true) val id: Int = 0,

3. Bloqueo de Room en el MainThread
val db = Room.databaseBuilder(context, AppDb::class.java, "db").build()

4. Retrofit: Ausencia de convertidor JSON
val retrofit = Retrofit.Builder()
    .baseUrl("https://api.com")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

5. Room: Tipos de Datos complejos no soportados
class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? = value?.let { Date(it) }
    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? = date?.time
}

6. Exposición critica de API Keys
val apiKey = BuildConfig.API_KEY

