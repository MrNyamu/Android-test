package com.example.kotlinbasics

fun main() {
    /*var me = person("Wesley", "Muriithi")
    var you = person()
    var johnPeterson = person(lastName = "Peterson")
     */

    var SamsungGalaxyS20Ultra = MobilePhone("IOS" , "Iphone",  "Iphone 11")
    var Iphone = MobilePhone()
    var modelChange = MobilePhone(model = "Samsung galaxy note 20 ultra")
}

class person (firstName: String = "John", lastName: String = "Doe"){

    init {//Initializer block: Called once an object is created
        println("Person Created is  $firstName  $lastName")
    }

}

class MobilePhone (OsName : String = "Android" , brand : String = "Samsung" , model : String = "Galaxy s20 Ultra"){
    init {
        println("The best phoneOS is $OsName with the phone being $brand and the model being the $model"  )

    }

}