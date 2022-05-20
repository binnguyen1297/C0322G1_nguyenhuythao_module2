package congtiABC.Model;

public class NhanVienQuanly extends NhanVien {
  private double luongCoBan;
  private double heSoLuong;

    public NhanVienQuanly() {
    }

    @Override
    public double tinhLuong() {
        return luongCoBan*heSoLuong;
    }

    public NhanVienQuanly(int luongCoBan, int heSoLuong) {
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public NhanVienQuanly(String hoTen, String diaChi, int ngaySinh, double luongCoBan, double heSoLuong) {
        super(hoTen, diaChi, ngaySinh);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }


    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "NhanVienQuanly{" +
                "luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong +
                '}';
    }
}
