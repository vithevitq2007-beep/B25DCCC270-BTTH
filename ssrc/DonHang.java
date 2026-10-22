public class DonHang {
    private String tenKH;
    private SanPham sanPham;
    private int soLuong;
    public DonHang(String tenKH, SanPham sanPham, int soLuong) {
        this.tenKH = tenKH;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        if(soLuong < 1){
            this.soLuong = 1;
        } else{
            this.soLuong = soLuong;
        }
    }
    public double tinhThanhTien(){
        double tongTien = this.sanPham.getDonGia() * this.soLuong;
        if(this.soLuong > 5){
            tongTien = tongTien * 0.9;
        }
        return tongTien;
    }
    public void inDonHang(){
        System.out.printf("%-5s %-16s %-3d %8s  %d\n",
        this.tenKH, this.sanPham.getTenSP(), this.soLuong,SanPham.dinhDangTien(this.tinhThanhTien()));
        if(this.soLuong > 5){
            System.out.printf("%-5s %-16s\n","","(da giam 10%)");
        }
    }





}
