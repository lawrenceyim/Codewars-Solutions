package solution

object BuyCar {
    fun nbMonths(
        startPriceOld: Int,
        startPriceNew: Int,
        savingperMonth: Int,
        percentLossByMonth: Double
    ): Pair<Int, Int> {
        if (startPriceOld >= startPriceNew) return Pair(0, startPriceOld - startPriceNew)
        var money = 0
        var months = 0
        var oldPrice: Double = startPriceOld.toDouble()
        var newPrice: Double = startPriceNew.toDouble()
        var loss = percentLossByMonth
        var lossPercent = 1 - loss / 100
        while (money < (newPrice - oldPrice)) {
            months++
            if (months % 2 == 0) {
                loss += 0.5
                lossPercent = 1 - loss / 100
            }
            money += savingperMonth
            newPrice *= lossPercent
            oldPrice *= lossPercent
        }
        return Pair(months, (Math.round(money - (newPrice - oldPrice))).toInt())
    }
}