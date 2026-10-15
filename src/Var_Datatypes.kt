fun main (){

    // Reassignable
    var score = 4;

    // One thing to consider, if a value is assigned as INT then cannot change to any other data type
    // score = 10; // this is okay
    // score = 10.5; // tis is not okay as we are doing INT -> FLOAT

    // Not reassignable
    val message = "Your score is $score";

    // Would throw conflicting error
    /*
    val message = "Would throw an error as we are trying to reassign"
    */
    // Print output
    println(message)

    // Example of all data type
    // INT
    val IntNumber : Int = 20;
    // DOUBLE/FLOAT
    val DoubleNumber : Double = 3.14;
    // BOOLEAN
    var IsSunny : Boolean = true;
    // CHAR
    var myString = "Happy day to everyone!";

    // Printing
    println("Today is $IntNumber Degree Celsius so i have walked $DoubleNumber Miles.")
    println("IS tomorrow is also sunny Mimi? Mimi says it's $IsSunny so we say $myString" )






}