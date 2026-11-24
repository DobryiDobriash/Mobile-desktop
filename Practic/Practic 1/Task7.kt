const val COMMISSION_PERCENT: Double = 1.5

fun main() {
    print("Сумма в рублях: ")
    val amountInput = readLine()?.trim()?.replace(',', '.')
    val amount = amountInput?.toDoubleOrNull()

    print("Курс (руб. за 1 $): ")
    val rateInput = readLine()?.trim()?.replace(',', '.')
    val rate = rateInput?.toDoubleOrNull()

    if (amount == null || amount <= 0.0) {
        println("Ошибка: сумма должна быть положительным числом. Введено: \"$amountInput\"")
        return
    }
    if (rate == null || rate <= 0.0) {
        println("Ошибка: курс должен быть положительным числом. Введено: \"$rateInput\"")
        return
    }

    val commission = amount * COMMISSION_PERCENT / 100.0
    val netRubles = amount - commission
    val dollars = netRubles / rate

    println("Сумма:       ${"%.2f".format(amount)} ₽")
    println("Комиссия:    ${"%.2f".format(commission)} ₽ ($COMMISSION_PERCENT %)")
    println("К получению: ${"%.2f".format(netRubles)} ₽")
    println("В долларах:  ${"%.2f".format(dollars)} $")
}