fun main() {
    print("Градусы Цельсия: ")
    val c = readln().toDouble()

    val f = c * 9.0 / 5.0 + 32.0
    println("%.1f °C = %.1f °F".format(c, f))
}