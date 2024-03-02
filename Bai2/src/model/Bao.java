package model;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return " Mã Tài Liệu :"+getMaTaiLieu()+"Tên nhà xuất bản :"+getTenNhaXuatBan()+"Số xuất bản "+getSoBanPhatHanh()+"Ngày ban hành :" +ngayPhatHanh;
    }
}
