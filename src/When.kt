fun main () {

    // let's write an if,else cond
    var fruit = "Apple"

    if (fruit == "Apple"){
        println("The fruit is apple")
    }
    else if (fruit != "Apple"){
        println("The fruit isn't apple")
    }
    else {
        println("Fruit has not been found")
    }

    // We can do the same thing with more simpler and clearer approach with "WHEN"
    // Can also be stored in a variable
    when (fruit) {
        "Pear" -> println("The fruit is Pear")
        "Berry" -> println("The fruit is berry")
        "orange" -> println("The fruit is orange")
        // would exicute this line of code as fruit is not match to any of the above
        else -> println("The fruit has not been found")
    }



}