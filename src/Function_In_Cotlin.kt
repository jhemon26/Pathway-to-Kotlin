
// this is our main function to call other function
// we can call them method as well
fun main (){
    // Here we are creating in instance of the method daysTemp
    // we are asking to pass two argument or parameter inside the daysTemp method
    var dayinstance = daysTemp("Monday", 30)

    // create in inline method instance
    var multiple = multiplication(5,5)
    println(multiple)

    var result = countmethod(numbercount)
}

// in this main funciton we will pass two parameter
fun daysTemp (Day: String, number: Int ){

    println ("$Day's Temperature is $number")
}
// Kotlin provides inline function as well
fun multiplication (num1: Int, num2: Int) = num1 * num2

// a for loop method example
var numbercount = 5;

fun countmethod (numbercout:Int){
    for (i in 1..numbercount){
        println ("Hello World")
    }

}