class hesabu {
    //data member
    var num1 :Int=76
    var num2 :Int=42

    //MEMBER FUNCTION
    fun arithmetic():Int{
        return num1*num2
    }
}

fun main(args: Array<String>) {
    //creating an object
    val myobj=hesabu()
    println(myobj.arithmetic())
}