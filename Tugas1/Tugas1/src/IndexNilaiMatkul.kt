class IndeksNilaiMatkul(private val nilai: Int) {
    fun hitungIndeks(): String {
        return when {
            nilai in 80..100 -> "A"
            nilai in 70..79 -> "AB"
            nilai in 60..69 -> "B"
            nilai in 50..59 -> "BC"
            nilai in 40..49 -> "C"
            nilai in 30..39 -> "D"
            nilai in 0..29 -> "E"
            else -> "Nilai di luar jangkauan"
        }
    }
}

fun main() {
    println("Masukkan nilai Matkul : ")
    val input = readLine()

    if (input.isNullOrBlank()) {
        println("Nilai harus diisi")
        return
    }

    val nilaiAkhir = input.toIntOrNull()

    if (nilaiAkhir == null || nilaiAkhir !in 0..100) {
        println("Nilai di luar jangkauan")
        return
    }

    val indeksNilaiMatkul = IndeksNilaiMatkul(nilaiAkhir)
    println("Indeks: ${indeksNilaiMatkul.hitungIndeks()}")
}