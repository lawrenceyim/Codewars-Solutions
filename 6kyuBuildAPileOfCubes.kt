package solution

import kotlin.math.pow

object ASum {
    fun findNb(m: Long): Long {
        var n: Long = 1
        var volume: Long = 1
        while (volume < m) {
            n++
            volume += n * n * n
        }
        if (volume == m) return n
        return -1
    }
}