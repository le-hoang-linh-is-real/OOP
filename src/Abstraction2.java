// Giao diện (interface)
interface HinhHoc {
    // Phương thức trừu tượng
    double tinhDienTich();
    double tinhChuVi();
}
// Lớp triển khai giao diện HinhHoc
class HinhChuNhat implements HinhHoc {
    private double chieuDai;
    private double chieuRong;
    // Hàm tạo
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    // Triển khai phương thức tinhDienTich
    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    // Triển khai phương thức tinhChuVi
    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
}
// Lớp triển khai giao diện HinhHoc
class HinhTron implements HinhHoc {
    private double banKinh;
    // Hàm tạo
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    // Triển khai phương thức tinhDienTich
    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
    // Triển khai phương thức tinhChuVi
    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        // Tạo đối tượng HinhChuNhat
        HinhHoc hcn = new HinhChuNhat(5, 3);
        System.out.println("Diện tích hình chữ nhật: " + hcn.tinhDienTich());
        System.out.println("Chu vi hình chữ nhật: " + hcn.tinhChuVi());
        // Tạo đối tượng HinhTron
        HinhHoc ht = new HinhTron(4);
        System.out.println("Diện tích hình tròn: " + ht.tinhDienTich());
        System.out.println("Chu vi hình tròn: " + ht.tinhChuVi());
    }
}
