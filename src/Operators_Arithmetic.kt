fun main (){

    var num1 = 15;
    var num2 = 7;

    println(num1 + num2); //Addition
    println(num1 - num2); //Sub
    println(num1 * num2); //Mul
    println(num1 % num2); // Mod

    // One interesting thing to note here
    // This will give us 1 as both types are int
    // so we need to convert either of the num to float or Double to get exact result
    println(num1 / num2); //Div -> would give us 2
    println(num1.toDouble() / num2); // would give us 2.14....


    // Relational Operators
    println(num1 > num2); // true
    println(num1 < num2); // false
    println(num1 == num2);// false
    println(num1 >= num2);
    println(num1 <= num2);
    println(num1 != num2);


    // Increment / Decrement
    var num3 = 1 ;
    // when num3 = 1, increase the value of num3 by 1
    num3 += num3
    println(num3);

    var num4 = 10 ;
    // when num4 = 10, decrease the value of num4 by 2
    num4 -= 2;
    println(num4);

    var num5 = 10 ;
    // writen by like this means increment the value by 1
    // can be writen like --,
    num5 ++
    println(num5);

    // One important thing
    var num6 = 5;

    // pre-increment
    // println(++num6); // this will increase value of num6 by 1 first then print
    println(num6++) // this will change num6 from 5 to 6 but won't print yet
    println(num6)   // now it will print "6" as its post increment


    // Logical Operation
    // Change any to see what happens
    val above80 = true;
    var haveSkill = false;
    var NoSkill = true;


    // would pass?
    val pass = above80 || haveSkill;
    val fail = above80 && NoSkill;
    println("Going to pass? $pass")
    println("Going to fail? $fail")



}