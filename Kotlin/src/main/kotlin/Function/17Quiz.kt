
fun main(args: Array<String>){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(sort(spices))
    println(specificChar0(spices))
    println(specificChar1(spices))
    println(rangeFilter(spices))
}

fun sort(spices: List<String>): List<String>{
    val hasilSort:List<String> = spices.filter { it.contains("curry") }.sortedBy { it.length }
    return hasilSort
}

fun specificChar0(spices: List<String>): List<String>{
    val hasilChar0: List<String> = spices.filter { it.startsWith('c') && it.endsWith('e') }
    return hasilChar0
}

fun specificChar1(spices: List<String>): List<String>{
    val hasilChar0: List<String> = spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }
    return hasilChar0
}

fun rangeFilter(spices: List<String>): List<String>{
    val hasilRange: List<String> = spices.take(3).filter { it.startsWith('c') }
    return hasilRange
}