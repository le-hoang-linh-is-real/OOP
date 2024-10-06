import java.util.Scanner;  // Thư viện Scanner để nhập dữ liệu từ bàn phím
class MayTinh {
    public double cong(double a, double b) {
        return a + b;
    }
    public double tru(double a, double b) {
        return a - b;
    }
    public double nhan(double a, double b) {
        return a * b;
    }
    public double chia(double a, double b) {
        if (b == 0) {
            System.out.println("Lỗi: Không thể chia cho 0.");
            return 0;
        }
        return a / b;
    }
}
public class Calculater {
    public static void main(String[] args) {
        MayTinh mayTinh = new MayTinh();
        Scanner scanner = new Scanner(System.in);  // Tạo đối tượng Scanner để nhập từ bàn phím
        System.out.print("Nhập số thứ nhất: ");
        double so1 = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double so2 = scanner.nextDouble();
        System.out.println("Cộng: " + mayTinh.cong(so1, so2));
        System.out.println("Trừ: " + mayTinh.tru(so1, so2));
        System.out.println("Nhân: " + mayTinh.nhan(so1, so2));
        System.out.println("Chia: " + mayTinh.chia(so1, so2));
    }
}
