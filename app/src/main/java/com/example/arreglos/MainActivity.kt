package com.example.arreglos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var totalNombres : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hermanachos = mutableListOf("Johnny I", "Johnny II", "Johnny III", "Johnny IV", "Stefanny")

        println("*******************************************************************************")
        println(hermanachos.get(0))
        println(hermanachos.get(1))
        println(hermanachos.get(2))
        println(hermanachos.get(3))
        println(hermanachos.get(4))
        println("*******************************************************************************")

        //Print all data of the array with cycle For
        for (storage in hermanachos){
            println(storage)
        }
        println("*******************************************************************************")

        if (hermanachos.size >= 6){
            println(hermanachos.get(8))
        }else
            println("Number typed is not valid")
            println("*******************************************************************************")

        //Update data in array
        hermanachos.set(0,"The lawyer of the family")
        hermanachos.set(3, "The younger brother")

        //Showing the new data in array
        println(hermanachos.get(0))
        println(hermanachos.get(3))
        println("*******************************************************************************")

        //Printing all the array with the new in data
        for (posicion in hermanachos.indices) {
            println(hermanachos.get(posicion))
        }
        println("*******************************************************************************")

        //Printing each position and value of the array
        for ((position, valor) in hermanachos.withIndex()){
            println("In the position $position the value found is $valor")
        }
        println("*******************************************************************************")

        hermanachos.size //Muestra el tamaño de la lista
        hermanachos.first() //Devuelve el primer valor
        hermanachos.last() //Devuelve el último valor
        hermanachos.get(2) //Devuelve el valor de la posición 2

        println(hermanachos) //["Johnny I", "Johnny II", "Johnny III", "Johnny IV", "Stefanny"]
        println("*******************************************************************************")

        //Adding or update an element (By default add in the end)
        hermanachos.add("Daysi")
        hermanachos.add(0,"Naruto")
        hermanachos.add(7,"Luffy")
        hermanachos.add(4,"Ace")
        println(hermanachos)
        println("*******************************************************************************")

        hermanachos.none() //Nos devuelve un true si está vacía la lista
        hermanachos.firstOrNull() //Nos devolverá el primer campo, y si no hay, un null.
        hermanachos.elementAtOrNull(2) //El elemento del índice 2, si no hay, devolverá un null
        hermanachos.lastOrNull() //Último valor de la lista o null

        //El .filter nos permite filtrar en la lista a través de una o varias condiciones que pongamos.
        // Para ello llamamos a it (iterator) y buscaremos en la lista, si contiene la palabra “Yohnny” o “Stefanny“. En este caso solo pintará “Stefanny“.
        val filtro = hermanachos.filter { it == "Yohnny" || it == "Stefanny"}
        println(filtro)
        println("*******************************************************************************")

        //Removing an element
        hermanachos.remove("Daysi")
        println(hermanachos)
        println("*******************************************************************************")

        for ((index, item) in hermanachos.withIndex()){
            println("En el indice $index se encuentra el nombre $item")
            totalNombres = hermanachos.size

        }
        println("En total hay $totalNombres nombres o registros")
        println("*******************************************************************************")

        //Copy an array and can modify
        val nuevaListaHermanos = mutableListOf<String>()
        hermanachos.forEach {
            nuevaListaHermanos.add("$it:")
        }
        println(nuevaListaHermanos)
        println("*******************************************************************************")
    }
}
