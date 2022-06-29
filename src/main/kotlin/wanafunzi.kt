class wanafunzi(val name:String ,val Gender:String,var Phoneno:Int ,val coursetaken:String){

}

fun main(args: Array<String>) {
    val obj=wanafunzi("Simon","Male",712614623 ,"Python")
    val objt=wanafunzi("Simon","Male",712614623,"Java Script" )


    println("The student name is " +obj.name)
    println("The Gender is " +obj.Gender)
    println("The Phone number is " +obj.Phoneno)

    println("The Students Name is ${objt.name} ,gender is ${objt.Gender} ,${objt.name} is taking ${objt.coursetaken} ,${objt.name} phone no is ${objt.Phoneno}")
}
