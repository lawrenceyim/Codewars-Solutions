object Solution {
    
    fun nameValue(arr: Array<String>): IntArray {
        var nums = IntArray(arr.size)
        for (i in arr.indices) {
            var value = 0
            for (j in 0..arr[i].length - 1) {
                if (arr[i].get(j).isLetter()) {
                    value += arr[i].get(j).toInt() - 96
                }
            }
            value *= i + 1
            nums[i] = value
        }
        return nums
    }
}