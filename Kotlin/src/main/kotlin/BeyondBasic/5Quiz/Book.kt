package BeyondBasic.`5Quiz`

class Book(val title: String, val author: String, val year: String) {
    fun pair(): Pair<String, String>{
        return (title to author)
    }

    fun triple(): Triple<String, String, String>{
        return Triple(title, author, year)
    }
}

fun main(args: Array<String>){
    val allBook: Set<String> = setOf("Shakesphere: Poems", "Dramatic Works", "Soneta 18", "Hamlet")
    val library: Map<String, Set<String>> = mapOf("William Shakesphere" to allBook)
    println(library.any {it.value.contains("Hamlet")})

    val moreBooks: MutableMap<String, String> = mutableMapOf("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") {"Kipling"}
    moreBooks.getOrPut("Hamlet") {"Shakesphere"}
    println(moreBooks)
}