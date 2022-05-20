package congtiABC.Model;

public class NhanVienCongNhat extends NhanVien {
    private int soNgayCong;

    public NhanVienCongNhat() {
    }

    @Override
    public double tinhLuong() {
        return soNgayCong *120000;
    }

    public NhanVienCongNhat(int songayCong) {
        soNgayCong = songayCong;
    }

    public NhanVienCongNhat(String hoTen, String diaChi, int ngaySinh, int songayCong) {
        super(hoTen, diaChi, ngaySinh);
        soNgayCong = songayCong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    @Override
    public String toString() {
        return "NhanVienCongNhat{" +
                "SongayCong=" + soNgayCong +
                '}';
    }
}