package variables

fun main() {
    val lista = listOf<Int>(1, 2, 3, 4, 5) //imutável

    val arrayList = arrayListOf<Int>(1, 2, 3, 4, 5)
    val mutableList = mutableListOf<Int>(1, 2, 3, 4, 5)

    mutableList.add(10)
}