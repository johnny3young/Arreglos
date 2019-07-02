package com.example.arreglos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

        println(weekDays.get(0))
        println(weekDays.get(1))
        println(weekDays.get(2))
        println(weekDays.get(3))
        println(weekDays.get(4))
        println(weekDays.get(5))
        println(weekDays.get(6))

        if (weekDays.size >= 8){
            println(weekDays.get(8))
        }else
            println("El número digitado no es válido")

        weekDays.set(0,"Lunes festivo, yupiiiiii.....")
        weekDays.set(4, "Viernes y el cuerpo lo sabe jajajaja...")

        println(weekDays.get(0))
        println(weekDays.get(4))

        for (posicion in weekDays.indices) {
            println(weekDays.get(posicion))
        }


        for ((position, valor) in weekDays.withIndex()){
            println("En la posición $position se encuentra el valor $valor")
    }

        for (weekDay in weekDays){
            println(weekDay)
        }

        val monthYears = listOf("Enero", "Febrero","Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto","Septiembre","Octubre","Noviembre", "Diciembre")
        monthYears.size //Muestra el tamaño de la lista
        monthYears.first() //Devuelve el primer valor
        monthYears.last() //Devuelve el último valor
        monthYears.get(2) //Devuelve el valor de la posición 2
        println(monthYears) //["Enero", "Febrero","Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto","Septiembre","Octubre","Noviembre", "Diciembre"]

        val filtro = monthYears.filter { it == "Lunes" || it == "Juernes"} //El .filter nos permite filtrar en la lista a través de una o varias condiciones que pongamos. Para ello llamamos a it (iterator) y buscaremos en la lista, si contiene la palabra “Lunes” o “Juernes“. En este caso solo pintará “Lunes“.

        val hermanos = mutableListOf("Johnny I", "Johnny II", "Johnny III", "Johnny IV", "Stefanny")
        println(hermanos)
        hermanos.add("Daysi")
        println(hermanos)

        hermanos.none() //Nos devuelve un true si está vacía la lista
        hermanos.firstOrNull() //Nos devolverá el primer campo, y si no hay, un null.
        hermanos.elementAtOrNull(2) //El elemento del índice 2, si no hay, devolverá un null
        hermanos.lastOrNull() //Último valor de la lista o null

        println(hermanos.none())

        for (contador in hermanos){
            println(contador)
        }

        for ((index, item) in hermanos.withIndex()){
            println("En el indice $index se encuentra el nombre $item")
            val totalNombres = hermanos.size
            println("En total hay $totalNombres nombres o registros")
        }

        val nuevaListaHermanos = mutableListOf<String>()
        hermanos.forEach {
            nuevaListaHermanos.add("$it:")
        }
        println(nuevaListaHermanos)
    }
}
