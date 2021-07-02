
fun main(args:Array<String>){
    var numbers = mutableListOf<Int>(5,3,6,2,10)
    var numbers1 = mutableListOf<Int>(50980,32345234,662345,22426,102345)
    println(selectionSort(numbers))
    println(selectionSort(numbers1))
}

fun findSmallest(arr:MutableList<Int>): Int{
    var smallest = arr[0]
    var smallest_index = 0

    for(i in 1 until arr.size){
        if (arr[i] < smallest){
            smallest = arr[i]
            smallest_index = i
        }
    }
    return smallest_index
}

fun selectionSort(arr: MutableList<Int>):List<Int>{
    var newArray = mutableListOf<Int>()
    for(i in 0 until arr.size){
        var smallest = findSmallest(arr)
        newArray.add(arr.removeAt(smallest))
    }
    return newArray
}