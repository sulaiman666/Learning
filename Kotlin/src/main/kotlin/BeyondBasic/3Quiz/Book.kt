package BeyondBasic.`3Quiz`

class Book(val title: String, val author: String, val year: String) {
    fun pair(): Pair<String, String>{
        return (title to author)
    }

    fun triple(): Triple<String, String, String>{
        return Triple(title, author, year)
    }
}

fun main(args: Array<String>){
    val book = Book("Bible", "Jesus", "between 1200 and 165 BC")

    val pair = book.pair()
    println(pair)

    val triple = book.triple()
    println(triple)

    println("Here is your book ${pair.first} written by ${triple.second} in ${triple.third}")
    println("Here is your book ${pair.first} written by ${pair.second} in ${triple.third}")
}