package FunctionManipulation

data class Fish(var name: String)

fun fishExample(){
    val fish = Fish("splashy")

    // Without inline an object created ever call
    myWith(fish.name){
        println(capitalize())
    }

    println(fish.run {name})

    println(fish.apply{})

    val fish2 = Fish("splashy").apply { name = "Sharky" }
    println(fish2.name)

    println(fish.let{ it.name.capitalize()}
        .let{it + "fish"}
        .let{it.length}
        .let{it + 31})

    // With inline no object is created, and lambda body is inlined here
    println(fish.name.capitalize())
}

inline fun myWith(name: String, block:String.() -> Unit){
    name.block()
}

fun main(args: Array<String>){
    fishExample()
}