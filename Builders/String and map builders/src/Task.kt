import java.util.HashMap

fun buildMap(map: HashMap<Int, String>.() -> Unit): HashMap<Int, String> {
    val mapBuilder = HashMap<Int, String>()
    mapBuilder.map()
    return mapBuilder
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
