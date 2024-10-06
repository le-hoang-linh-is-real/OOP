// Lớp mô tả một SinhVien
class SinhVien {
    // Các thuộc tính được đặt là private để bảo vệ dữ liệu
    private String ten;
    private int tuoi;
    private String diaChi;
    // Hàm tạo của lớp để khởi tạo các giá trị cho đối tượng SinhVien
    public SinhVien(String ten, int tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }
    // Getter và Setter để truy cập và cập nhật giá trị thuộc tính 'ten'
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    // Getter và Setter để truy cập và cập nhật giá trị thuộc tính 'tuoi'
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        if (tuoi > 0) { // Kiểm tra tính hợp lệ của dữ liệu
            this.tuoi = tuoi;
        } else {
            System.out.println("Tuổi không hợp lệ!");
        }
    }
    // Getter và Setter để truy cập và cập nhật giá trị thuộc tính 'diaChi'
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    // Phương thức hiển thị thông tin sinh viên
    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Địa chỉ: " + diaChi);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        // Tạo đối tượng SinhVien
        SinhVien sv = new SinhVien("Nguyen Van A", 20, "123 Đường ABC, TP HCM");
        // Truy cập và hiển thị thông tin sinh viên qua phương thức đóng gói
        sv.hienThiThongTin();
        // Thay đổi các thuộc tính thông qua setter
        sv.setTen("Tran Thi B");
        sv.setTuoi(22);
        sv.setDiaChi("456 Đường XYZ, Hà Nội");
        // Hiển thị lại thông tin sau khi đã thay đổi
        System.out.println("Sau khi cập nhật thông tin:");
        sv.hienThiThongTin();
        // Thử thay đổi tuổi với giá trị không hợp lệ
        sv.setTuoi(-5); // Sẽ in ra "Tuổi không hợp lệ!"
    }
}
