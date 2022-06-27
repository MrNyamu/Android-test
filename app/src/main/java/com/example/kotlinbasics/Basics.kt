package com.example.kotlinbasics

fun myFunction() {
    print("Called from myFunction")
}
            //Parameter (input)
fun addUp(a: Int, b: Int) : Int{
    //output
    return a+b
}

fun avg(a: Double, b: Double) : Double{
    return (a+b)/2
}

fun main() {
                    //Arguments
    //var result = addUp(5,2)
    //print("Result is $result")

    //var avg = avg(7.2,3.9)
    //print("Avg of two numbers is $avg")


    //name = null -> Compilation ERROR
    var nullableName : String? = "NYASH"
    //nullableName = null


    //var len2 = nullableName?.length

    val name = nullableName ?: "Guest"
    println("Name is $name")

    println(nullableName!!.lowercase())

    /*
    if(nullableName != null){
    var len2 = nullableName.length
    } else {
        null
    }
    */

}




