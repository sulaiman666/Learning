package Aquarium

fun main(args: Array<String>){
    buildAquarium()
    makeFish()
    feedFish(Shark())
}

fun buildAquarium(){
    val myAquarium = Aquarium()
    val smallAquarium = Aquarium(30, 60, 110)

    println("Length: ${myAquarium.length} cm " +
            "Width: ${myAquarium.width} cm " +
            "Height: ${myAquarium.height} cm ")

    myAquarium.height = 80
    println("New aquarium height: ${myAquarium.height} cm")

    println("Aquarium volume: ${myAquarium.volume()} liters")
    println("Aquarium volume: ${myAquarium.volume1()} liters")
    println("Aquarium volume: ${myAquarium.volume2} liters")
    println("Aquarium volume: ${myAquarium.volume3} liters")

    println("Aquarium new height: ${myAquarium.volume2} liters")

    println("Arguments aquarium: ${smallAquarium.volume2} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    val myTowerTank = TowerTank()

    println("Small aquarium volume: ${myAquarium2.volume2} " +
            "Small aquarium length: ${myAquarium2.length} cm " +
            "Small aquarium width: ${myAquarium2.width} cm " +
            "Small aquarium height: ${myAquarium2.height} cm ")

    println("Tank aquarium volume: ${myTowerTank.volume3} " +
            "Tank aquarium water: ${myTowerTank.water} cm ")
}

fun feedFish(fish: FishAction){
    //make some food then
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostonus()

    println("Shark had ${shark.color} color\nPlecostonus has ${pleco.color} color")

    shark.eat()
    pleco.eat()
}