fun main (){

    // print index from 1 to 6
    for (i in 1..6) {
        println(i)
    }
    println("================")
    // print index from 1 until 6 , won't print 6
    for (i in 1 until 6){
        println(i)
    }
    println("================")
    // we can use steps to skip between index
    // step 2 means jump every 2 index
    // also we can say indexing from top to bottom or bottom to up
    for (i in 6 downTo  1 step 2){
        println(i)
    }
}