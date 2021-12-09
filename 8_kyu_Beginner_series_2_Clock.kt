fun past(h: Int, m: Int, s: Int): Int {
    var time = 0
    time += h * 3600
    time += m * 60
    time += s
    time *= 1000
    return time
}