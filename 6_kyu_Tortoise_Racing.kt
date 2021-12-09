package tortoise

import kotlin.math.*

// return [] if v1 >= v2
fun race(v1:Int, v2:Int, g:Int):IntArray {
    var arr = IntArray(3)
    if (v1 >= v2) return IntArray(0)
    var speed: Double = (v2 - v1).toDouble()
    speed /= 3600
    var time = floor(g / speed)
    arr[0] = floor(time / 3600).toInt()
    time = time % 3600
    arr[1] = floor(time / 60).toInt()
    time = time % 60
    arr[2] = time.toInt()
    return arr
}