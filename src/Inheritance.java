// Lớp cha (Lớp cơ sở)
class XeDap {
    // Thuộc tính của lớp cha
    protected int banhRang;
    protected int tocDo;
    // Hàm tạo của lớp cha
    public XeDap(int banhRang, int tocDo) {
        this.banhRang = banhRang;
        this.tocDo = tocDo;
    }
    // Phương thức của lớp cha
    public void dapXe(int giaToc) {
        tocDo += giaToc;
        System.out.println("Tăng tốc độ xe đạp. Tốc độ hiện tại: " + tocDo + " km/h");
    }
    public void phanhXe(int giamToc) {
        tocDo -= giamToc;
        System.out.println("Giảm tốc độ xe đạp. Tốc độ hiện tại: " + tocDo + " km/h");
    }
}
// Lớp con (Lớp kế thừa từ lớp cha)
class XeDapLeoNui extends XeDap {
    // Thuộc tính mới của lớp con
    private int chieuCaoGhe;
    // Hàm tạo của lớp con, sử dụng từ khóa 'super' để gọi hàm tạo của lớp cha
    public XeDapLeoNui(int banhRang, int tocDo, int chieuCaoGhe) {
        super(banhRang, tocDo); // Gọi hàm tạo của lớp cha
        this.chieuCaoGhe = chieuCaoGhe;
    }
    // Phương thức mới của lớp con
    public void dieuChinhGhe(int chieuCaoMoi) {
        chieuCaoGhe = chieuCaoMoi;
        System.out.println("Đã điều chỉnh chiều cao ghế: " + chieuCaoGhe + " cm");
    }
    // Ghi đè phương thức của lớp cha
    @Override
    public void dapXe(int giaToc) {
        tocDo += giaToc * 2; // Tăng tốc nhanh hơn
        System.out.println("Xe đạp leo núi tăng tốc nhanh hơn. Tốc độ hiện tại: " + tocDo + " km/h");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // Tạo đối tượng từ lớp cha
        XeDap xeDapThuong = new XeDap(5, 10);
        xeDapThuong.dapXe(5);
        xeDapThuong.phanhXe(3);
        // Tạo đối tượng từ lớp con
        XeDapLeoNui xeDapLeoNui = new XeDapLeoNui(6, 15, 50);
        xeDapLeoNui.dapXe(5); // Gọi phương thức ghi đè
        xeDapLeoNui.phanhXe(4); // Gọi phương thức của lớp cha
        xeDapLeoNui.dieuChinhGhe(60); // Gọi phương thức của lớp con
    }
}
