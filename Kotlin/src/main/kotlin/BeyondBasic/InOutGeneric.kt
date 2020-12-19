package BeyondBasic

open class WaterSupply(var needsProcessed: Boolean)

class TapWater: WaterSupply(true){
    fun addChemicalCleaners() = apply { needsProcessed = false }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true){
    fun filter() = apply { needsProcessed = false }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T){
    fun addWater(cleaner: Cleaner<T>){
        if(waterSupply.needsProcessed){
            cleaner.clean(waterSupply)
        }

        println("adding water from $waterSupply")
    }
}

interface Cleaner<in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater>{
    override fun clean(waterSupply: TapWater){
        waterSupply.addChemicalCleaners()
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun inOutGenericExample(){
    val cleaner = TapWaterCleaner()
    val aquarium: Aquarium<TapWater> = Aquarium(TapWater())
    aquarium.addWater(cleaner)
}

fun main(args: Array<String>){
    inOutGenericExample()
}