import java.awt.Color
import kotlin.math.sqrt

fun calculate(){
    var num1 =56
    var num2 =92
    println("The sum of $num1 and $num2 is " + (num1+num2))
    println("The product of $num1 and $num2 is "+(num1*num2))
    println("The difference of $num1 and $num2 is "+(num1-num2))
    println("The Quotient of $num1 and $num2 is "+(num1%num2))

}
fun main(args: Array<String>) {
    calculate()
    jina()
   println (sqrt(54.54))
    cars("Toyota" ,  "Skyblue" , 2022)
    cars("Mercedes", "Pink", 2021)
}


fun jina(){
    println("My Name is Simon")
}
fun cars(name:String, color:String ,year: Int ){
    println("My car model is $name, its $color in color and was manufuctured $year.")

}
