// Họ và tên: Nguyễn Trường Thọ
// MSSV: 25810068
fun main() {
    val tenKhachHang: String? = null

    val doDaiTen: Int? = tenKhachHang?.length
    println("Do dai ten khach hang: $doDaiTen")

    val tenHienThi: String = tenKhachHang ?: "Khach vang lai"
    println("Ten khach hang: $tenHienThi")

    val tenChacChan: String? = "Nguyen Truong Tho"
    val doDaiTenChacChan: Int = tenChacChan!!.length
    println("Do dai ten chac chan: $doDaiTenChacChan")
    /*
        Lưu ý:
        Chỉ dùng Toán tử !! khi chắc chắn biến không null.
        Nếu biến có giá trị null, chương trình sẽ bị lỗi khi chạy.
        Không nên sử dụng Toán tử !! nếu không chắc chắn biến có giá trị.
      */
}
main()