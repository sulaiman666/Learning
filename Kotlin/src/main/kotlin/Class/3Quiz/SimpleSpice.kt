package Class.`3Quiz`

class SimpleSpice {
    var name: String = "curry"
    var levelSpice: String = "mild"
    var heat: Int = when (levelSpice) {
        "mild" -> 5
        else -> 0
    }
    val heat1: Int
        get(){return 5}
}