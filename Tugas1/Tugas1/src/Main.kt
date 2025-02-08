import java.util.Scanner

class PersegiPanjang(private val panjang: Double, private val lebar: Double) {
    fun hitungLuas(): Double {
        return panjang * lebar
    }

    fun hitungKeliling(): Double {
        return 2 * (panjang + lebar)
    }
}


fun main() {
    val Scanner = Scanner(System.`in`)

    print ("Masukkan nilai panjang : ")
    val panjang = Scanner.nextDouble()

    print ("Masukkan nilai lebar : ")
    val lebar = Scanner.nextDouble()

    val persegiPanjang = PersegiPanjang(panjang, lebar)

    println("Panjang persegi : $panjang")
    println("Lebar persegi : $lebar")
    println("Luas persegi : ${persegiPanjang.hitungLuas()}")
    println("Keliling persegi : ${persegiPanjang.hitungKeliling()}")
    }