fun main() {
    print("Ширина: ")
    val w = readln().toDouble()
    print("Высота: ")
    val h = readln().toDouble()

    val area = w * h
    val perimeter = 2 * (w + h)
    println("Площадь: %.2f".format(area))
    println("Периметр: %.2f".format(perimeter))
}