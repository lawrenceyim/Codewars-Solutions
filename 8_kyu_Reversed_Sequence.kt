fun reverseSeq(n: Int): List<Int> {
    var list = mutableListOf<Int>()
    for (i in n downTo 1) list.add(i)
    return list
}