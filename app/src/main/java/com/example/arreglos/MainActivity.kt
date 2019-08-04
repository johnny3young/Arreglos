package com.example.arreglos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var totalNames : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hermanachos = mutableListOf("Johnny I", "Johnny II", "Johnny III", "Johnny IV", "Stefanny")

        println("*******************************************************************************")
        println("ARRAYS")
        println("Showing data of the arrays:")
        println(hermanachos.get(0))
        println(hermanachos.get(1))
        println(hermanachos.get(2))
        println(hermanachos.get(3))
        println(hermanachos.get(4))
        println("*******************************************************************************")

        println("Print all data of the array with cycle For:")
        for (storageBrothers in hermanachos){
            println(storageBrothers)
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

        println("Showing the data updates in array:")
        println(hermanachos[0])
        println(hermanachos[3])
        println("*******************************************************************************")

        println("Printing all the array with the news data:")
        for (storage in hermanachos.indices) {
            println(hermanachos.get(storage))
        }
        println("*******************************************************************************")

        println("Printing each position and value of the array:")
        for ((position, value) in hermanachos.withIndex()){
            println("In the index or position $position the value found is $value")
        }
        println("*******************************************************************************")

        hermanachos.size //Show size of the list
        hermanachos.first() //Return first value
        hermanachos.last() //Return last value
        hermanachos.get(2) //Return value of the position 2

        println(hermanachos) //["Johnny I", "Johnny II", "Johnny III", "Johnny IV", "Stefanny"]
        println("*******************************************************************************")

        println("Adding or update an element (By default add in the end):")
        hermanachos.add("Daysi")
        hermanachos.add(0,"Naruto")
        hermanachos.add(7,"Luffy")
        hermanachos.add(4,"Ace")
        println(hermanachos)
        println("*******************************************************************************")

        hermanachos.none() //Nos devuelve un true si está vacía la lista
        hermanachos.firstOrNull() //Nos devolverá el primer campo, y si no hay, un null.
        hermanachos.elementAtOrNull(2) //El elemento del índice 2, si no hay, devolverá un null
        hermanachos.lastOrNull() //Último value de la lista o null

        //The .filter our let filter in the list though of one o many conditions that we set. We call a it (iterator)
        println("We find out in the list if contents the word “Yohnny” o “Stefanny“. In this case draws “Stefanny")
        val filter = hermanachos.filter { it == "Yohnny" || it == "Stefanny"}
        println(filter)
        println("*******************************************************************************")

        println("Showing data of the array without element Daysi removed:")
        hermanachos.remove("Daysi")
        println(hermanachos)
        println("*******************************************************************************")

        for ((index, item) in hermanachos.withIndex()){
            println("In the index $index the value found is $item")
            totalNames = hermanachos.size

        }
        println("Ther is $totalNames names o registries in total")
        println("*******************************************************************************")

        //Copy an array and can modify
        val newListBrothers = mutableListOf<String>()
        hermanachos.forEach {
            newListBrothers.add("$it:")
        }
        println("The new list modified is:")
        println(newListBrothers)
        println("*******************************************************************************")
        println("LIST")

        val weekDays = listOf("Lunes","Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
        println("Showing all data of the List:")
        println(weekDays)
        println("*******************************************************************************")

        println("Showing data with cycle For:")
        for (storageWeekDays in weekDays){
            println(storageWeekDays)
        }
        println("*******************************************************************************")

        println("Showing data with cycle For but with UpperCase:")
        for (storageWeekDays in weekDays){
            println(storageWeekDays.toUpperCase())
        }
        println("*******************************************************************************")

        val camelCase = listOf("naruto shipuden", "mokey Luffy", "zoro ronoroa")

        println("Showing data with cycle For but with CamelCase:")
        for (storageWeekDays in camelCase){
            println(storageWeekDays)
        }

    }

}