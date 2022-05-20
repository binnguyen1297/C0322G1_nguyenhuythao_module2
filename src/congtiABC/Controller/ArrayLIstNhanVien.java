package congtiABC.Controller;

import congtiABC.Model.NhanVien;
import congtiABC.Model.NhanVienCongNhat;
import congtiABC.Model.NhanVienQuanly;
import congtiABC.Model.NhanVienSanXuat;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayLIstNhanVien {
    static List<NhanVien> nhanVienArrayList = new ArrayList<>();

    static {
        nhanVienArrayList.add(new NhanVienCongNhat("nguyen huy thao", "da nang", 1997, 25));
        nhanVienArrayList.add(new NhanVienQuanly( " nguyen viet hung","da nang",2000,500, 2));
        nhanVienArrayList.add(new NhanVienSanXuat("sang tokuda", "da nang", 1997, 26));
    }

    public void disspalayArraylist() {
        for (NhanVien item : nhanVienArrayList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

}
