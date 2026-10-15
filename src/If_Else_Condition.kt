
var num1 = 10;
var num2 = 20;
var num3 = 10;

fun main () {


    // Concept is "if (this) then {run this code block} else {run this code block}"

    // Checks if num2 is == to num2
    if (num1 == num2) {
        println ("$num1 is equal to $num2")}
    // Else we say it's not equal
    else{
        print ("$num1 is not equal to $num2\n")
        }


    // Second example is 10 smaller than 10
    if (num1 < num3) {

        // if so then print this
        println ("$num1 is less than $num2")}

    // or else if 10 is greater than 10?
    else if (num1 > num3){
        // then print this
        println ("$num1 is greater than $num2")}
    // if nothing on top then print this
    else {
        println ("$num1 equal to $num3")}


    // in kotlin we can store this conditional statement and results in a var
    // example
    var number = 5;
    // So here we are storing conditionals inside a var
    val result = if (number % 2 == 0){"Even"}else{"Odd"}
    println(result);



}
