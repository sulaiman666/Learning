fun main(args: Array<String>) {
    var x = doubleArrayOf(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
    println(gps(20, x))
    x = doubleArrayOf(0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25)
    println(gps(12, x))
}

fun gps(s:Int, x:DoubleArray):Int {
    var array: IntArray = IntArray(x.size)
    return if (x[x.size - 1] - x[0] > 1) {
        for (it in 1 .. x.size - 2) {
            array[it] = ((3600 * (x[it + 1] - x[it])) / s).toInt()
        }
        array.max()!!
    } else 0
}
