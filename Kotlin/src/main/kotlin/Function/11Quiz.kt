fun main(args: Array<String>){
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}
//
//fun canAddFish(tankSize: Double, currentFish: List<Int> = listOf(0), fishSize: Int = 2, hasDecorations: Boolean = true) : Boolean{
//    var sumFish = 0
//    for (i in 0..2){
//        sumFish += currentFish[i]
//    }
//    sumFish = sumFish + fishSize
//    var trueTank: Double = 0.0
//    if (hasDecorations) {
//        trueTank = tankSize * 0.8
//    } else{
//        trueTank = tankSize
//    }
////    println(sumFish)
////    println(trueTank)
//    if (sumFish<=trueTank){
//        return true
//    }
//    return false
//}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}