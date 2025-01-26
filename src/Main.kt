fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list)

    /*
    Дан список целых чисел.
    Вывести в консоль первый элемент списка двумя способами: обратившись по индексу, через стандартную функцию first().
    */
    println(list[0])
    println(list.first())
    println()

    /*
    Дан список целых чисел.
    Вывести в консоль среднее арифметическое элементов списка двумя способами: в ручную – через цикл,
    с применением стандартной функции average().
    */
    println(averageList(list))
    println(list.average())
    println()

    /*
    Дан список целых чисел.
    Вывести в консоль сумму элементов списка двумя способами: в ручную – через цикл,
    с применением стандартной функции sum().
    */
    println(sum(list))
    println(list.sum())
    println()

    /*
    Дан список целых чисел.
    Вывести в консоль количество элементов списка двумя способами: в ручную – через цикл,
    с применением стандартной функции count().
    */
    println(count(list))
    println(list.count())
    println()

    /*
    Дан список целых чисел.
    Вывести в консоль сумму двух последних элементов списка двумя способами: в ручную – через цикл,
    с применением стандартной функции takeLast().
    */
    println(sumOfLastTwoElementsOfList(list))
    println(list.takeLast(2).sum())
    println()

    /*
    Дан список целых чисел.
    Вывести в консоль сумму индексов элементов списка двумя способами: в ручную – через цикл,
    с применением стандартной функции indices().
    */
    println(sumOfListElementIndices(list))
    println(list.indices.sum())
}

fun averageList(list: List<Int>): Double {
    var temp = 0.0
    for (a in list) temp += a.toDouble()
    return temp / list.size
}

fun sum(list: List<Int>): Int {
    var temp = 0
    for (a in list) temp += a
    return temp
}

fun count(list: List<Int>): Int {
    var temp = 0
    for (a in list) temp++
    return temp
}

fun sumOfLastTwoElementsOfList(list: List<Int>): Int {
    var tempOne = 0
    var tempTwo = 0
    for (a in list.indices){
        if (a == list.size - 2) tempOne = list[a]
        if (a == list.size - 1) tempTwo = list[a]
    }
    return tempOne + tempTwo
}

fun sumOfListElementIndices(list: List<Int>): Int {
    var temp = 0
    for (a in list.indices) temp += a
    return temp
}