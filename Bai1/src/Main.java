import model.CongNhan;
import model.KySu;
import model.NhanVien;

public class Main {
    public static void main(String[] args) {
        CongNhan congNhan = new CongNhan("Nguyễn Văn A", 30, "Nam", "Hà Nội");
        congNhan.setBac(5);
        KySu kySu = new KySu("Nguyễn Thị B", 28, "Nữ", "Hải Phòng");
        kySu.setNganhDaoTao("Kỹ thuật công nghệ thông tin");
        NhanVien nhanVien = new NhanVien("Trần Văn C", 25, "Nam", "Đà Nẵng");
        nhanVien.setCongViec("Quản lý");
        System.out.println("Thông tin Công nhân:");
        System.out.println(congNhan);

        System.out.println("\nThông tin Kỹ sư:");
        System.out.println(kySu);

        System.out.println("\nThông tin Nhân viên:");
        System.out.println(nhanVien);
    }
}
