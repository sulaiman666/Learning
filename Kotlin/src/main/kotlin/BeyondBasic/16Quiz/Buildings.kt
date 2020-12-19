package BeyondBasic.`16Quiz`

open class BaseBuildingMaterial(){
    open val numberNeeded = 1
}

class Wood: BaseBuildingMaterial(){
    override val numberNeeded = 4
}

class Brick: BaseBuildingMaterial(){
    override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T){
    val baseMaterialNeeded = 100
    val actualMaterialNeeded = buildingMaterial.numberNeeded * baseMaterialNeeded

    fun build(){
        println("$actualMaterialNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun<R: BaseBuildingMaterial> isSmallBuilding(building: Building<R>){
    if (building.actualMaterialNeeded < 500) println("Small Building")
    else println("Large Building")
}

fun main(args: Array<String>){
    Building(Wood()).build()
    Building(Brick()).build()
    Building(BaseBuildingMaterial()).build()
    isSmallBuilding(Building(Brick()))
    isSmallBuilding(Building(Wood()))
}