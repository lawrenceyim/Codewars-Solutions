fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int{
    var age = age1 * age1 + age2 * age2 + age3 * age3 + 
            age4 * age4 + age5 * age5 + age6 * age6 + age7 * age7 + 
            age8 * age8
    return (Math.sqrt(age.toDouble()) / 2).toInt()
}
