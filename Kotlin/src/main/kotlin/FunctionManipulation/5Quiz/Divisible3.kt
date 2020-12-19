package FunctionManipulation.`5Quiz`

fun List<Int>.devisibleBy(block: (Int) -> Int) : List<Int>{
    val result = mutableListOf<Int>()
    for (item in this){
        if (block(item) == 0){
            result.add(item)
        }
    }
    return result
}

fun main(args: Array<String>){
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    println(numbers.devisibleBy {
        it.rem(3 )
    })
}