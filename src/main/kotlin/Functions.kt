import java.math.BigDecimal

fun main() {
    val productPrices = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("4.99")
    )

    val totalPrice = sumProducts(productPrices)
    println("Total price is: ${totalPrice}")

    val name = "Israel"

    println("size name: ${name.count()}")
    println("size name: ${name.split("")}")
    println("size name: ${name.dropLast(4)}")
    println("size name: ${name.drop(4)}")
    println("size name: ${name.contains("i")}")

    productPrices.fold("") { acc, i -> "$acc $i" }
}

fun sumProducts(products: Array<BigDecimal>): BigDecimal {
    return products.sumOf { it }
}