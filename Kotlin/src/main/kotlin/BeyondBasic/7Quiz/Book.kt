package BeyondBasic.`7Quiz`

const val MAKS_BOOK = 10

class Book(val title: String, val author: String, val year: String) {
    fun canBorrow(hasBook: Int): Boolean{
        return(hasBook <= MAKS_BOOK)
    }
    object Constants{
        const val BASE_URL = "https://www.Crimson.net/"
    }
    fun printUrl(){
        println(Constants.BASE_URL + title + ".html")
    }

    companion object{
        val BASE_URL = "https://www.Crimson.net/" //Stored only in book class
    }

    fun printUrlObject(){
        println(BASE_URL+ title + ".html")
    }
}