fun main() {
    print("Товар: ")
    val title = readln()
    print("Цена: ")
    val price = readln().toDouble()

    val priceStr = "%.2f ₽".format(price)
    val dots = ".".repeat((30 - title.length - priceStr.length).coerceAtLeast(0))

    println("""
        |==============================
        |$title$dots$priceStr
        |==============================
    """.trimMargin())
}