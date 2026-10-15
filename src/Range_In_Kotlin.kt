fun main () {

    var number = 10;

    // we are check if numebr 10 is comes inside range 1 to 7
    var result1 = number in 1..7;

    // comes inside range 3 to 11!
    var result2 = number in 3..11;

    // would print false
    println(result1)
    // wwould print true as it comes under 3 to 11
    println(result2)

    // we can write it without including last index
    // this would print false as we are not including 10 itself (counts form 1 to 9)
    var result3 = number in 1 until 10;
    println(result3)

}