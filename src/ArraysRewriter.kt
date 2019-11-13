fun main() {
    val arrayOfInteger = arrayOf(-3, 0, 98, 12, 0, -83)
    println(rewriteArray(arrayOfInteger).joinToString())
}

fun rewriteArray(array: Array<Int>): Array<Int> {
    val outArray = Array(array.size) { 0 }
    var i = 0
    var j = array.size - 1
    for (number in array) {
        if (number < 0) {
            outArray[i] = number
            i++
        } else {
            outArray[j] = number
            j--
        }
    }
    return outArray
}