public class Main2 {
     static void main(String[] args) {
        SanPham banPhim  = new SanPham("SP01","ban phim co",450000,20);
        SanPham chuot =  new SanPham("Sp02","chuot khong day",20000,50);
        SanPham taiNghe =   new SanPham("SP03","Tai Nghe");
        taiNghe.setDonGia(350000);
        taiNghe.setSoLuongTon(10);
        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        banPhim.hienThi();
        chuot.hienThi();
        taiNghe.hienThi();
        System.out.println();

        DonHang don1 = new DonHang("An", banPhim, 2);
        DonHang don2 = new DonHang("Bình", chuot, 5);
        DonHang don3 = new DonHang("Chi", taiNghe, 0);


        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-5s %-16s %-3s %s\n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        don1.inDonHang();
        don2.inDonHang();
        don3.inDonHang();
    }
}
