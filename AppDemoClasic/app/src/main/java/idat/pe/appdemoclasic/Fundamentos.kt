package idat.pe.appdemoclasic

import android.util.Log

class Fundamentos {

    var nombres = "Jose "
    var apellidos = "Pintado yamo"
    var edad: Int = 28
    var altura: Double = 1.65
    var activo: Boolean = true
    var color: Float = 4.5f


    fun ejemploDataClass(){
        val objProducto = Producto("Sony", 130.0, "0001", 30, false)

        val oblProducto2 = objProducto.copy(marca = "Samsung")
        val (marca, codigo) = oblProducto2

    }


    fun ejemploLambsa() {
        val numeros = intArrayOf(9, 10, 30, 40, 5)
        val numerosPares = numeros.filter {

            n -> if (n % 2 == 0) {
                 true
            }else{
                 false
            }

        }
        val miFuncionMultiplica = fun(n1: Int, n2: Int): Int{
            return n1 * n2
        }
        operaciones(10, 4, miFuncionMultiplica)
        operaciones(12, 8, { x, y -> x + y})
    }


    private fun operaciones(x: Int, z: Int, operacionLambda:(Int, Int) -> Int):Int{
        return operacionLambda(x, z)
    }


    fun doWhile(){
        var contador = 10
        while (contador > 1){

        }
        do {

        }while (contador > 3)
    }

    // BUCLES
    fun bucleFor(){
        val notas = intArrayOf(13, 20, 4, 6, 8, 10)

        for(nota: Int in notas){
            imprimir(nota.toString())
        }
        for((indice, valor) in notas.withIndex()){
            imprimir("Nota $indice es igual $valor")
        }
        for(numero in 5..15){
            imprimir("Número $numero")
        }



    }

    fun arreglosKotlin(){
        val arrayNumeros: IntArray = intArrayOf(12,12, 7, 3, 4,5)

        val paises = ArrayList<String>()
        paises.add("Perú")
        paises.add("Brasil")
    }

    // Funcion con parametros
    fun imprimir(mensaje: String){
        Log.i("Imprimir", mensaje)
    }

    // Retorna un valor en especifico y es una fun con n param.
    fun operacion(numero1: Int, numero2: Int, operador: String): String{
        // var resultado = 0
        val resultado = when (operador) {
            "+" -> numero1 + numero2
            "-" -> numero1 - numero2
            "/" -> numero1 / numero2
            "*" -> numero1 * numero2
            else -> 0
        }
        return "Resultado final $resultado"
    }

    fun validar(numero: Int): String {
        val resultado = when (numero % 2) {
            0 -> "Número par"
            else -> "Número impar"
        }
        return resultado
    }
}
