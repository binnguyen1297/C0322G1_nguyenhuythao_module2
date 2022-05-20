package congtiABC.Model;

import CRUD.OfficeStaff;

public abstract class NhanVien {
    private String hoTen;
    private String     diaChi;
    private int ngaySinh;

    public  NhanVien() {
    }

    public NhanVien(String hoTen, String diaChi, int ngaySinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public static void add() {

    }

    public static void display() {
    }

    public static void edit() {
    }

    public static void delete() {
    }

    public static void search() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public abstract double tinhLuong();
}
