// Giao diện đầu tiên
interface Chay {
    // Phương thức trừu tượng
    void chay();
}

// Giao diện thứ hai
interface Nhay {
    // Phương thức trừu tượng
    void nhay();
}

// Lớp thực hiện đa kế thừa thông qua giao diện
class DongVat implements Chay, Nhay {
    // Thuộc tính tên động vật
    private String ten;

    // Hàm tạo để khởi tạo tên động vật
    public DongVat(String ten) {
        this.ten = ten;
    }

    // Triển khai phương thức chay() từ giao diện Chay
    @Override
    public void chay() {
        System.out.println(ten + " đang chạy");
    }

    // Triển khai phương thức nhay() từ giao diện Nhay
    @Override
    public void nhay() {
        System.out.println(ten + " đang nhảy");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Tạo đối tượng của lớp DongVat
        DongVat cho = new DongVat("Chó");
        DongVat meo = new DongVat("Mèo");

        // Gọi các phương thức từ hai giao diện
        cho.chay();  // Gọi phương thức từ giao diện Chay
        cho.nhay();  // Gọi phương thức từ giao diện Nhay

        meo.chay();  // Gọi phương thức từ giao diện Chay
        meo.nhay();  // Gọi phương thức từ giao diện Nhay
    }
}

