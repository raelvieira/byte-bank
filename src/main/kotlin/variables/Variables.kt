package variables

import java.math.BigDecimal

fun printVariables() {
    val byte: Byte = 1; // 8bits -128, 127
    val short: Short = 1; // 16 bits -32768, 32767
    val int: Int = 1; // 32 bits, -2,147,483,648 (-231) 2,147,483,647 (231 - 1)
    val long: Long = 1; // 64 bits, -9,223,372,036,854,775,808 (-2^63) 9,223,372,036,854,775,807 (2^63 - 1)

    val float: Float = 1.1F;
    val double: Double = 1.1; // garante uma precisão numérica maior
    val bigDecimal: BigDecimal = BigDecimal(1.1); // garante uma precisão numérica maior ainda.

    val array: Array<String> = arrayOf("Teste", "Do")

    var ownerFirstName = "ISRAEL";
    val ownerLastName: String = "VIEIRA"; // VAL é uma constante

    println("The owner name is: ${ownerFirstName} ${ownerLastName}");

    println(array[0]);
}