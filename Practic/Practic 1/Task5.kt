fun main() {
    print("Числа через пробел: ")
    val nums = readln()
        .trim()
        .split(Regex("\\s+"))
        .map { it.toDouble() }

    val sum = nums.sum()
    val avg = if (nums.isEmpty()) 0.0 else sum / nums.size

    println("Сумма: $sum")
    println("Среднее: %.2f".format(avg))
}