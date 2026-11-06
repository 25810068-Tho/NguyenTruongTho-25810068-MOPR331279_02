// Họ và tên: Nguyễn Trường Thọ
// MSSV: 25810068
fun main() {
    var soThuNhat: Int = 0
    var soThuHai: Int = 1
    for (viTri in 0..20) {
        if (soThuNhat >= 100) {
            break
        }
        println("Vi tri $viTri: $soThuNhat")
        val soTiepTheo = soThuNhat + soThuHai
        soThuNhat = soThuHai
        soThuHai = soTiepTheo
    }
}
main()