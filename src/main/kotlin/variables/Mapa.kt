package variables

fun main() {
    var mapa1 = mapOf<Int, String>(
        1 to "muito ruim",
        2 to "ruim",
        3 to "bom",
        4 to "muito bom",
    );

    var mapa2 = mutableMapOf(
        1 to "muito ruim",
        2 to "ruim",
        3 to "bom",
        4 to "muito bom",
    );

    mapa2[5] = "exelente!"

    println(mapa1.get(1))
    println(mapa2[4])
}