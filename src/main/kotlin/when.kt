//fun main(args: Array<String>) {
//    var car ="Toyot"
//
//    when(car) {
//        "Nissan" -> println("My car is nissan")
//        "Mercedes" -> println("My car is mercedes")
//        "Toyota" -> println("My car is Toyota")
//        else -> println("Invalid input")
//
//    }
//}
/**
 * created by Chaitanya for Beginnersbook.com
 */
package beginnersbook

fun main(args : Array<String>){

    var ch = 'A'

    when(ch){

        'A' -> println("A is a Vowel")
        'E' -> println("E is a Vowel")
        'I' -> println("I is a Vowel")
        'O' -> println("O is a Vowel")
        'U' -> println("U is a Vowel")

        else -> println("$ch is a Consonant")
    }
}

