package model;

public class NhanVien extends CanBo{
    private String congViec;
    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return " Tên nhân viên :"+getHoTen()+" Tuổi :"+getTuoi()+" Giới tính :"+getGioiTinh()+" Địa chỉ :"+getDiaChi()+" Bậc : "+congViec;
    }
}
