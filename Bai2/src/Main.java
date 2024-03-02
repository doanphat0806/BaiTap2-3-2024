import model.Bao;
import model.Sach;
import model.TapChi;

public class Main {
    public static void main(String[] args) {
        Sach sach = new Sach("S001", "NXB ABC", 100, "Nguyễn Văn X", 200);
        System.out.println("Thông tin sách:");
        System.out.println(sach);
        TapChi tapChi = new TapChi("T001", "NXB XYZ", 50, 10, 5);
        System.out.println("\nThông tin tạp chí:");
        System.out.println(tapChi);
        Bao bao = new Bao("B001", "NXB DEF", 200, "2024-02-28");
        System.out.println("\nThông tin báo:");
        System.out.println(bao);
    }
}
