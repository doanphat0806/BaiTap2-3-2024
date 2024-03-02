package model;

public class KySu extends CanBo{
    private String nganhDaoTao;
    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return " Tên nhân viên :"+getHoTen()+" Tuổi :"+getTuoi()+" Giới tính :"+getGioiTinh()+" Địa chỉ :"+getDiaChi()+" Bậc : "+nganhDaoTao;
    }
}
