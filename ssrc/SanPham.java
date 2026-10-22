import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuongTon;

    public SanPham(){
        this("chua co ma","chua co ten",0,0);
    }
    public SanPham(String maSP, String tenSP){
        this(maSP,tenSP,0,0);
    }
    public SanPham(String maSP, String tenSP,double donGia, int soLuongTon){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;

    }

    public String getTenSP() {
        return tenSP;
    }
    public String getMaSP() {
        return maSP;
    }
    public double getDonGia() {
        return donGia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    public static String dinhDangTien(double soTien){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.###", symbols);
        return df.format(soTien);
    }
    public void hienThi(){
        System.out.printf("%-5s %-16s %8s ton %d\n",
                this.maSP, this.tenSP,dinhDangTien(this.donGia),this.soLuongTon);
    }
}
