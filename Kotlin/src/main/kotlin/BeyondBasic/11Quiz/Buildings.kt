package BeyondBasic.`11Quiz`

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

fun main(args: Array<String>){
    Building(Wood()).build()
    Building(Brick()).build()
    Building(BaseBuildingMaterial()).build()
}