package model;

public class KhoiC extends ThiSinh{
    public KhoiC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return" SBD : "+getSoBaoDanh()+" - Họ tên : "+getHoTen()+" - Địa chỉ : "+getDiaChi()+
                " - Muc ưu tiên : "+ getMucUuTien()+"- Thí sinh khối A thi các môn: Văn , Sử , Địa";
    }
}
