// Họ và tên: Nguyễn Trường Thọ
// MSSV: 25810068
fun main() {
    val diemTrungBinh: Double = 8.5
    val xepLoai = when (diemTrungBinh) {

        in 9.0..10.0 -> "Xuat sac"

        in 8.0..<9.0 -> "Gioi"

        in 6.5..<8.0 -> "Kha"

        in 5.0..<6.5 -> "Trung binh"

        in 0.0..<5.0 -> "Yeu"

        else -> "Diem khong hop le"
    }
    println("Diem trung binh: $diemTrungBinh")
    println("Xep loai hoc luc: $xepLoai")
}
main()