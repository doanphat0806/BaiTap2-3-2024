package model;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return " Mã Tài Liệu :" + getMaTaiLieu() + "Tên nhà xuất bản :" + getTenNhaXuatBan() + "Số xuất bản " + getSoBanPhatHanh() + "Tên tác giả :" + tenTacGia + "Số Trang :" + soTrang;
    }
}
