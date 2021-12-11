fun argsCount(vararg args: Any): Int {
    var count = 0
    for (i in args) count++
    return count
}