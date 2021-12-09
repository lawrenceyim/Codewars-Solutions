fun duplicateCount(text: String): Int {
    var s = text.toLowerCase()
    var set = mutableSetOf<Char>()
    var duplicated = mutableSetOf<Char>()
    var count = 0
    s.forEach {
        if (!set.contains(it)) {
            set.add(it)
        } else if (set.contains(it) && 
                !duplicated.contains(it)) {
            duplicated.add(it)
            count++
        }
    }
    return count
}