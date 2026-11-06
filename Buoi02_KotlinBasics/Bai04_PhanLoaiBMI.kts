// Họ và tên: Nguyễn Trường Thọ
// MSSV: 25810068

fun main() {
    val canNang: Double = 79.0
    val chieuCao: Double = 1.75
    val bmi: Double = canNang / (chieuCao * chieuCao)
    if (bmi < 18.5) {

        println("Phan loai: Gay")

    } else if (bmi < 25.0) {

        println("Phan loai: Binh thuong")

    } else if (bmi < 30.0) {

        println("Phan loai: Thua can")

    } else {

        println("Phan loai: Beo phi")
    }
    println("Chi so BMI: %.2f".format(bmi))
}
main()