package BeyondBasic

fun main(args: Array<String>){
    val cures: Map<String, String> = mapOf("white spot" to "ich", "red sores" to "hole disease")

    println(cures.get("white spot"))
    println(cures["white spot"])

    println(cures.getOrDefault("bloating", "sorry I don't know"))

    println(cures.getOrElse("bloating") {"No cure for this"})

    val inventory: MutableMap<String, Int> = mutableMapOf("fish net" to 1)

    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")

    println(inventory.get("tank scrubber"))
    println(inventory.get("fish net"))
}