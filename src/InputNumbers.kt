class InputNumbers

fun main() {
    print(checkNumber(readLine()))
}

fun checkNumber(input: String?): String {
    return when (input?.toIntOrNull()) {
        null -> "Вы ввели не число"
        else -> "Вы ввели число $input"
    }
}