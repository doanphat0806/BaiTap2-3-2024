package model;

public class CongNhan extends CanBo{
    private int bac;
    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return " Tên nhân viên :"+getHoTen()+" Tuổi :"+getTuoi()+" Giới tính :"+getGioiTinh()+" Địa chỉ :"+getDiaChi()+" Bậc : "+bac;
    }
}
