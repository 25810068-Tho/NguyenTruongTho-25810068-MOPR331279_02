// Họ và tên: Nguyễn Trường Thọ
// MSSV: 25810068

fun main() {
    val diemSinhVien = arrayOf(
        8.5, 7.0, 9.0, 6.5, 5.5,
        8.0, 7.5, 9.5, 6.0, 10.0
    )
    var tongDiem: Double = 0.0
    var diemCaoNhat: Double = diemSinhVien[0]
    var diemThapNhat: Double = diemSinhVien[0]
    for (diem in diemSinhVien) {
        tongDiem += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }
    val diemTrungBinh = tongDiem / diemSinhVien.size
    println("Tong so sinh vien: ${diemSinhVien.size}")
    println("Diem trung binh: $diemTrungBinh")
    println("Diem cao nhat: $diemCaoNhat")
    println("Diem thap nhat: $diemThapNhat")
}
main()