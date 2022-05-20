package congtiABC.Model;

public class NhanVienSanXuat extends NhanVien {
    private int soSanPham;

    public NhanVienSanXuat() {
    }

    @Override
    public double tinhLuong() {
        return soSanPham *50000;
    }

    public NhanVienSanXuat(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public NhanVienSanXuat(String hoTen, String diaChi, int ngaySinh, int soSanPham) {
        super(hoTen, diaChi, ngaySinh);
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    @Override
    public String toString() {
        return "NhanVienSanXuat{" +
                "SoSanPham=" + soSanPham +
                '}';
    }
}
