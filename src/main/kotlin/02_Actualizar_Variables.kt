package org.example

/*En la función principal de un programa, haz lo siguiente:

Crea una variable de número entero cartTotal que comience en el valor 0.
El usuario agrega un suéter que cuesta USD 20 a su carrito de compras.
Actualiza la variable cartTotal a 20, que es el costo actual de los artículos de su carrito de compras.
Imprime el costo total de los artículos de su carrito, que es la variable cartTotal, en el resultado.*/

fun main() {
    var cartTotal = 0  // El valor de la variable puede cambiar
    println("Total articulos carrito $cartTotal USD")
    val costeSueter = 20 // No esperas que el valor de la variable cambie
    cartTotal = cartTotal+costeSueter
    println("Total articulos carrito $cartTotal USD")
}