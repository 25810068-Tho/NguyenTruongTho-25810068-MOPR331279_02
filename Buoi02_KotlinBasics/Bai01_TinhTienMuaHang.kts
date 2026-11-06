// Họ và tên: Nguyễn Trường Thọ
// MSSV: 25810068
fun main()
{
    val soLuong: Int = 5
    val donGia: Double = 25000.0
    val tienHang: Double = soLuong.toDouble() * donGia
    val tienThue: Double = tienHang * 0.08
    val tongTien: Double = tienHang + tienThue

    println("So luong: $soLuong")
    println("Don gia: $donGia VND")
    println("Tien hang: $tienHang VND")
    println("Tien thue: $tienThue VND")
    println("Tong tien phai tra: $tongTien VND")
}
main()