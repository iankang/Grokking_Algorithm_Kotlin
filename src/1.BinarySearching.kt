import kotlin.math.roundToInt

fun main(args: Array<String>) {
    var numbers = listOf(1,3,5,7,9)
    println(binarySearching(numbers,3))
    println(binarySearching(numbers, -1))
}

fun binarySearching(list: List<Int>, item: Int): Int? {
    var low = 0
    var high = list.size.minus(1)

    while (low <= high) {
        var mid = low.plus(high).div(2.0).roundToInt()
        var guess = list[mid]

        when{
            guess == item -> return mid
            guess > item -> high = mid - 1
            else -> low = mid + 1
        }
    }
    return null
}