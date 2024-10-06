// Giao diện đầu tiên
interface Chay1 {
    void chay(); // Phương thức trừu tượng
}
// Giao diện thứ hai
interface Nhay1 {
    void nhay(); // Phương thức trừu tượng
}
// Lớp DongVat thực hiện đa kế thừa thông qua các giao diện Chay và Nhay
class DongVat1 implements Chay1, Nhay1 {
    // Triển khai phương thức chay() từ giao diện Chay
    @Override
    public void chay() {
        System.out.println("Động vật đang chạy");
    }
    // Triển khai phương thức nhay() từ giao diện Nhay
    @Override
    public void nhay() {
        System.out.println("Động vật đang nhảy");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        // Tạo đối tượng của lớp DongVat
        DongVat1 dv = new DongVat1();
        // Gọi các phương thức từ hai giao diện
        dv.chay();  // Gọi phương thức từ giao diện Chay
        dv.nhay();  // Gọi phương thức từ giao diện Nhay
    }
}
