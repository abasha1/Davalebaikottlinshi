fun sashualo(array: List<Int>): Int {

    val last_array = arrayListOf<Int>()

    for (i in array.indices){

        if (i % 2 == 0) last_array.add(array[i])
    }


    return last_array.sum() / last_array.size
}
