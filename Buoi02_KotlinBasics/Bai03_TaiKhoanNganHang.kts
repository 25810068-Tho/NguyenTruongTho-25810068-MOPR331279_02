// Họ và tên: Nguyễn Trường Thọ
// MSSV: 25810068

fun main() {
    val soDuBanDau: Long = 5000000
    var soDuHienTai: Long = soDuBanDau
    soDuHienTai += 2000000

    println("So du sau khi gui tien: $soDuHienTai VND")
    soDuHienTai -= 1500000
    println("So du sau khi rut tien: $soDuHienTai VND")
    println("So du ban dau: $soDuBanDau VND")
    //val: dùng cho số dư ban đầu vì không thay đổi.
    //var: dùng cho số dư hiện tại vì có thể thay đổi sau mỗi giao dịch.
}
main()