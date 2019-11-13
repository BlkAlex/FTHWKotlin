class ReverseNumbers
fun main() {
    val input = readLine();
    if (input == null || input.toIntOrNull() == null){
        println("Введены некорректные данные")
    }
    else{
        print(getReverseNum(input));
    }
}

internal fun getReverseNum(num: String): String {
    val number = num.toInt()
    return when (checkCountNumbers(number)) {
        true -> reverseNumber(number)
        false -> "Количество разрядов числа $num не равно 3"
    }
}

private fun checkCountNumbers(num: Int): Boolean = num in 100..999
private fun reverseNumber(num: Int): String = num.toString().reversed()