import java.util.Scanner;  // Thư viện Scanner để nhập dữ liệu từ bàn phím
// Lớp ATM mô phỏng các chức năng cơ bản
class CreateATM {
    private double soDu; // Biến lưu trữ số dư của tài khoản
    public CreateATM(double soDuBanDau) {
        this.soDu = soDuBanDau;
    }
    public double kiemTraSoDu() {
        return soDu;
    }
    public void rutTien(double soTien) {
        if (soTien > soDu) {
            System.out.println("Lỗi: Số dư không đủ để rút tiền.");
        } else {
            soDu -= soTien;
            System.out.println("Rút thành công: " + soTien + " VND. Số dư còn lại: " + soDu + " VND.");
        }
    }
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gửi thành công: " + soTien + " VND. Số dư mới: " + soDu + " VND.");
        } else {
            System.out.println("Lỗi: Số tiền gửi phải lớn hơn 0.");
        }
    }
}
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Tạo đối tượng Scanner để nhập từ bàn phím
        // Tạo đối tượng ATM với số dư ban đầu
        System.out.print("Nhập số dư ban đầu: ");
        double soDuBanDau = scanner.nextDouble();
        CreateATM atm = new CreateATM(soDuBanDau);
        boolean tiepTuc = true;
        while (tiepTuc) {
            System.out.println("\nChọn thao tác:");
            System.out.println("1. Kiểm tra số dư");
            System.out.println("2. Gửi tiền");
            System.out.println("3. Rút tiền");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Số dư hiện tại: " + atm.kiemTraSoDu() + " VND");
                    break;
                case 2:
                    System.out.print("Nhập số tiền muốn gửi: ");
                    double soTienGui = scanner.nextDouble();
                    atm.guiTien(soTienGui);
                    break;
                case 3:
                    System.out.print("Nhập số tiền muốn rút: ");
                    double soTienRut = scanner.nextDouble();
                    atm.rutTien(soTienRut);
                    break;
                case 4:
                    tiepTuc = false;
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
        scanner.close();  // Đóng đối tượng Scanner
    }
}
