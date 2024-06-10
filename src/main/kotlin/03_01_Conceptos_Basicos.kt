package org.example

fun main(){
    // Ejercicio Punto 2
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

    // Ejercicio Punto 3
    println("New chat message from a friend")

    // Ejercicio Punto 4
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)

    // Ejercicio Punto 5
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

    // Ejercicio Punto 6 - Formato de los mensajes
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    // Ejercicio Punto 7 - Implementación de operaciones matemáticas básicas
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")

    val thirdNumber = 8

    val result2 = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result2")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val result3 = substract(firstNumber, secondNumber)
    val result4 = substract(firstNumber, thirdNumber)
    println("$firstNumber - $secondNumber = $result3")
    println("$firstNumber - $thirdNumber = $result4")



    // Ejercicio Punto 8 - Parámetros predeterminados
    println(displayAlertMessage("Chrome OS","sample@gmail.com"))

    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
    println(displayAlertMessage(emailId = "user"))
    println(displayAlertMessage("MAC OS", emailId))

    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

    // Ejercicio Punto 9 - Podómetro
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")

    // Ejercicio Punto 10 - Comparación de dos números
    println(compareTime(300,250)) // true
    println(compareTime(300,300)) // false
    println(compareTime(200,220)) // false

    // Ejercicio Punto 11 - Movimiento del código duplicado a una función
    println(climateDetailsToString("Ankara",27,31,82))
    println(climateDetailsToString("Tokio",32,36,10))
    println(climateDetailsToString("Cape Town",59,64,2))
    println(climateDetailsToString("Guatemala City",50,55,7))
}

// Define add() function below this line
fun add(num1:Int,num2:Int):Int{
    return num1+num2
}

// ¿Puedes implementar la función subtract() de la misma manera en que implementaste la función add()?
fun substract(num1:Int,num2:Int):Int{
    return num1-num2
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId:String):String{
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

fun compareTime(timeSpentToday:Int,timeSpentYesterday:Int):Boolean{
    return (timeSpentToday>timeSpentYesterday)
}

fun climateDetailsToString(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int):String{
    return "City: $city\nLow temperature: $lowTemperature, High temperature: $highTemperature\nChance of rain: $chanceOfRain% \n"
}