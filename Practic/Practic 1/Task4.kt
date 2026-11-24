fun main() {
    print("Ваш возраст: ")
    val age = readln().toIntOrNull()

    if (age == null) {
        println("Некорректный ввод")
    } else if (age >= 18) {
        println("Вы совершеннолетний")
    } else {
        println("Ещё нет")
    }
}