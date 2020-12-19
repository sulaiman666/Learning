package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int){
    val size: Int

    init{
        if(friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }
}

fun printFish(){
    val fish = Fish(true, 20)
    println("Is he friendly? ${fish.friendly}. How big the volume need to be? ${fish.size}")
    // if you call ${fish.volumeNeeded} you get an error because in class volume needed is not
    // initialize
}