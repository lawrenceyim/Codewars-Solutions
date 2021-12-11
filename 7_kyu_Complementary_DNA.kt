package dna

fun makeComplement(dna : String) : String {
    var complement = ""
    dna.forEach {
        when (it) {
            'C' -> complement += "G"
            'G' -> complement += "C"
            'A' -> complement += "T"
            'T' -> complement += "A"
        }
    }
    return complement
}