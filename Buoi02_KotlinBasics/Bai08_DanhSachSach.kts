// Họ và tên: Nguyễn Trường Thọ
// MSSV: 25810068

fun main() {
    val danhSachSach = mutableListOf(
        "Lap trinh Kotlin",
        "Java co ban",
        "Python co ban",
        "Cau truc du lieu",
        "Lap trinh Android"
    )
    println("===== DANH SACH BAN DAU =====")

    for (sach in danhSachSach) {
        println(sach)
    }
    danhSachSach.add("Lap trinh C++")
    danhSachSach.add("Co so du lieu")
    danhSachSach.remove("Java co ban")
    danhSachSach.sort()
    println("\n===== DANH SACH SAU KHI XU LY =====")
    for (sach in danhSachSach) {
        println(sach)
    }
}
main()