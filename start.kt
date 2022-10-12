import java.lang.Exception

fun main(){

    // Hello World

//    println("Hello World !")



    // Variables and Data types

//    var x : Int = 3
//    println("The value of x is $x")
//    x = 4
//    println("The value of x now is $x")

//    val wholeNumber = 3
//    val bigNumber = 3L
//    val preciseDecimal = 3.33
//    val decimal = 3.33f
//    val iLoveVegetables = true
//    val iLovePizza = false
//    val iAmALetter = 'a'



    // Arithmetic Operators

//    val x = 3 * 4
//    println("The value of x is $x")

//    val x = 3f / 4f
//    println("The value of x is $x")

//    val x = 10 % 2
//    println("The value of x is $x")

//    val amIAnAdult = true
//    val amIAProgrammer = true
////    val amIAnAdultProgrammer = amIAnAdult && amIAProgrammer
////    println(amIAnAdultProgrammer)
//    val amIAnAdultProgrammer = !(amIAProgrammer !== amIAnAdult)
//    println(amIAnAdultProgrammer)


    // Strings

//    val string = "Kotlin is the best language"
//    println(string.toUpperCase())



    // IF-Conditions

//    val x = 1 + 3
//    if(x == 2) {
//        println("x is true")
//    } else if(x == 3){
//        println("x is 3")
//    } else {
//        println("x is not 2 or 3")
//    }
//    val y = if(x == 2) 2 else 3
//



    // NULL VALUES

//    val x:Int? = null
//    val userInput = readLine()
//    val number1 = readln() ?: "0"
//    val number2 = readln() ?: "0"
//    // //val result = number1!!.toInt() + number2!!.toInt()
//    val result = number1!!.toInt() + number2!!.toInt()
//    println(result)



    // LISTS

//    val shoppingList = listOf<String>("Lamborghini", "Penthouse", "Rolex")
//    println(shoppingList[2])

//    val shoppingList = mutableListOf("Lamborghini", "Penthouse", "Rolex")
//    shoppingList.add("Ferrari")
    // println(shoppingList[3])



    // while-Loop

//    var counter = 0
//    while(counter < shoppingList.size) {
//        println(shoppingList[counter])
//        counter++ // counter = counter + 1
//    }



    // for-Loop

//    for(shoppingItem in shoppingList) {
//        println(shoppingItem)
//    }

//    for(i in 1..100) {
//        println(i)
//    }

//    val x = 3
//    when(x) {
//        in 1..2 -> println("x is between 1 and 2")
//        in 3..10 -> println("x is between 3 and 10")
//        else -> {
//            println("x is not in the range of 1 to 10")
//        }
//    }




// Functions
//
//    print10Numbers()

//    val x = isEven(5)
//    val y = 3
//    println(x)
//    println(y.isOdd())


    // CLASS
//
//    val dog = Dog()
//    dog.bark()
//    val cat = Cat()
//    cat.meow()
//



    // ABSTRACT CLASS

//    val dog = Dog()
//    dog.bark()
//    val cat = Cat()
//    cat.meow()
//    val animal = Animal()



    // ANONYMOUS CLASS

//    val bear = object : Animal("Camembear"){
//        override fun makeSound() {
//            println("ROOOAAARR")
//        }
//    }



//     TRY AND CATCH

//    val number = readLine() ?: "0"
//    val parsedNumber = try {
//        number.toInt()
//    } catch(e: Exception) {
//        0
//    }
//    println(parsedNumber)



//  LAMBDA FUNCTIONS

    val list = listOf("Kotlin", "is", "fun")
    val count = list.count { currentString ->
    currentString.length >= 3
    }
    println(count)

}

        // FUNCTIONS

        fun Int.isOdd(): Boolean {
            return this % 2==1
        }


        fun isEven(number: Int): Boolean {
            return (number % 2 == 0)
        }

        fun print10Numbers() {
            for(i in 1..10) {
                println(i)
            }
        }


// LAMBDA FUNCTIONS

fun List<String>.customCount(function: (String) -> Boolean): Int {
    var counter = 0
    for(string in this) {
        if(function(string)) {
            counter++
        }
    }
    return counter
}
