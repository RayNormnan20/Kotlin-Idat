package idat.pe.appdemoclasic

data class Producto(
    var marca: String,
    var precio: Double,
    var codigo: String,
    var cantidad: Int,
    var descontinuado: Boolean
)
