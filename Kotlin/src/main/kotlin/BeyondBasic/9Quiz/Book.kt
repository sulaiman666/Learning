package BeyondBasic.`9Quiz`

import kotlin.random.Random

class Book(val title: String, val author: String, val year: Int, var pages: Int)

fun Book.weight() : Double = pages * 1.5

fun Book.tornPages(tornPage: Int) = if (pages >= tornPage) pages -= tornPage else pages = 0

class Puppy(){
    fun playWithBook(book: Book){
        book.tornPages(Random.nextInt(12))
    }
}

fun main(args: Array<String>){
    val puppy = Puppy()
    val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)

    println("${book.title} this book weight is ${book.weight()} gram")

    while (book.pages > 0){
        puppy.playWithBook(book)
        println("There is ${book.pages} pages left in ${book.title}")
    }

    println("Sad puppy, no more pages in ${book.title}")
}