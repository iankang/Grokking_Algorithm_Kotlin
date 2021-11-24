
fun main(){
    var numbers = mutableListOf(5,3,6,2,10)
    println("sumRecursion: ${sumRecursion(mutableListOf(5,3,6,2,10))}")
    println("countRecursion: ${countRecursion(mutableListOf(5,3,6,2,10,8,7,56,34))}")
    println("largestRecursion: ${largestRecursion(mutableListOf(5,3,6,2,10,8,7,56,34))}")
}

/*
* this gets the sum of the array by recursion*/
fun sumRecursion(array:MutableList<Int>): Int {
    var index = array.size
    if(index != 0){
        return array[array.lastIndex]+ sumRecursion(array.apply { removeAt(index - 1) })
    }
    return 0
}

/*
* this gets the count of the array by recursion*/
fun countRecursion(array: MutableList<Int>):Int{
    var index = array.size
    if(array.isEmpty()){
        return 0
    }else{
       return 1 + countRecursion(array.apply { removeAt(index - 1) })
    }
}

fun largestRecursion(array: MutableList<Int>):Int{
    var index = array.size
    if(array.isEmpty()){
        return 0
    }
    else{
        var largest = array.lastOrNull()
        if(largestRecursion(array.apply { removeAt(index - 1) })> largest!!){
            largest = array.get(index)
            return largest
        }
    }
    return 0
}