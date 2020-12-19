package BeyondBasic

open class WaterSupply0(var needProcessed: Boolean)

class TapWater0: WaterSupply0(true){
    fun addChemicalCleaners(){
        needProcessed = false
    }
}

class FishStoreWater0: WaterSupply0(false)

class LakeWater0: WaterSupply0(true){
    fun filter(){
        needProcessed = false
    }
}

class Aquarium0<T: WaterSupply0>(val waterSupply: T){
    fun addWater(){
        check(!waterSupply.needProcessed){"Water supply need processed"}
        println("adding water from $waterSupply")
    }
}

fun genericExample(){
    val aquarium0: Aquarium0<TapWater0> = Aquarium0(TapWater0())
    aquarium0.waterSupply.addChemicalCleaners()

    val aquarium1: Aquarium0<LakeWater0> = Aquarium0(LakeWater0())
    aquarium1.waterSupply.filter()
    aquarium1.addWater()

//    val aquarium2 = Aquarium("string")
}

fun main(args: Array<String>){
    genericExample()
}