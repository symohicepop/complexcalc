fun main(args: Array<String>) {
    var myarr= arrayOf("kenya","Tanzania","Uganda",23,24.42,true)
    var intarr= arrayOf<Int>(3,78,590,345)
    var strarr= arrayOf<String>("kenya","Tanzania","Uganda")
    myarr[2]="Burundi"
    println("My country is "+ myarr[2])

    println("The size of my array is " + myarr.size)

}