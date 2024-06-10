package org.example

fun main(){
    // Hola Mundo
    // https://kotlinlang.org/docs/kotlin-tour-hello-world.html#variables
    // https://www.youtube.com/watch?v=T3ugOYTRF7c&t=2060s

    /* Comentario de varias líneas */
    println("Hello Kotlin!")

    // Variables String
    var myString = "Esto es una cadena de texto"
    myString = "Ahora cambio el valor"
    println(myString)

    // Variables enteros
    var myInt = 6
    myInt = myInt + 4;println(myInt)
    println(myInt-1) // No guardamos el resultado de esto, solo lo mostramos
    println(myInt)

    var myDouble: Double = 7.7 // Si queremos tipar los datos ponemos dos puntos y el tipo de variable
    var myFloat: Float = 6.4F // Siempre que podamos evitar tipar es mejor no tipar
    println(myDouble)
    myDouble = 6.0 // Si no ponemos el decimal da error

    var myBoolean = true // Definición de booleano

    // Se recomienda declarar las variables como read-only a menos que necesiten ser cambiadas
    val myConst = "Mi propiedad constante"
    //myConst = "Mi nueva constante" // Esto da error, una constante no puede modificarse

    myInt = 11
    myString = "Hola"
    // Control de flujo
    if ( myInt == 10 && myString == "Hola") {
        println("MyInt es igual a $myInt y myString es Hola")
    }
    else if (myInt == 11 || myString == "Hola") println("MyInt es igual a 11 o myString es Hola")
    else println("MyInt no es igual ni a 10 ni a 11")

    // Estructuras
    // Lista (funciona también sin tipado) var myList = listOf<String>("Manzana","Pera","Cereza")
    val myList = listOf("Manzana","Pera","Cereza")
    println(myList)
    println(myList[0]) // Se empieza a contar desde la posición 0

    // Por defecto en Kotlin las estructuras se crean de forma inmutable
    var misFrutas = mutableListOf("Manzana","Pera","Cereza")
    misFrutas.add("Naranja")
    println(misFrutas)

    // Set (el set es muy rápido pero es desordenado y no admite duplicados
    val mySet = setOf("Manzana","Pera","Cereza","Manzana")
    println(mySet)
    val mySetofInts = setOf(1,2,4) // El sistema lo reconoce como enteros
    val mySetofNumbers = setOf(1,2,4.0) // Al meter un double en la definición es de números

    // Mapas - Nos permite guardar diferentes propiedades de tipo clave-valor
    // Podría ser por ejemplo el precio de las frutas
    val myMap = mutableMapOf("Manzana" to 0.9, "Pera" to 0.8, "Cereza" to 4)
    myMap.put("Naranja",1)
    myMap["Piña"] = 3
    println("Precio Manzanas " + myMap["Manzana"] + " euros/kg")
    println(myMap)

    // Bucles
    for (value in myList){
        println(value)
    }

    for (value in mySet){
        println(value)
    }

    for (value in myMap){
        println(value)
    }

    // While
    var myCounter = 0
    while(myCounter < myList.count()){
        println(""+myCounter+" "+myList[myCounter])
        myCounter++
    }

    // Opcionales
    var myOptional:String? = null // Poniendo la interrogación entiende que es un String y puede ser null
    println(myOptional)

    // Funciones
    myFunction()

    var myClass = MyClass("Paco",43) // Le tenemos que pasar los dos parámetros
    println("Nombre: " +myClass.name + " Edad: " + myClass.age)

}

fun myFunction(){
    println("Esto es una función")
}

// Se le pueden pasar parámetros (no hace falta crear un constructor como en Java
class MyClass(val name: String, val age: Int)

// También podemos abrir llaves y meter métodos dentro