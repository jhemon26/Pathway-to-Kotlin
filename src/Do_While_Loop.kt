fun main () {

    // take a variable count and assign a value 4
    var count = 4;

    // while our count value is greater or equal to 1 we are going to print count value
    // we need to write increment or decrement based on our while condition
    // else the program is going to be stuck in an infinity loop

    // decrement example
    while (count >= 1){
        println("Now count is $count")
        // safety barer so it does not stuck in an infinity loop
        count--
    }

    // increment example
    while (count <= 4){
        println("Now count is $count")
        count++
    }

    // lets see the table of 3
    var num1 = 3
    var index = 1
    while (index <=10){
        println("$num1 * $index is  ${num1 * index}")
        index++
    }

    // lets se do while loop
    var num3 = 5;
    var num4 = 6;

    do {
        println("$num3")
        num3 ++



    }
    while (num3 < num4)


}
