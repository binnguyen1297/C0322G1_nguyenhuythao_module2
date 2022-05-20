package congtiABC.Controller;

import congtiABC.Model.NhanVien;
import congtiABC.Model.NhanVienCongNhat;
import congtiABC.Model.NhanVienQuanly;
import congtiABC.Model.NhanVienSanXuat;

import java.util.Scanner;

public class EmploymamentManager {
    public static NhanVien[] nhanVien = new NhanVien[1000];

    static {
        nhanVien[0] = new NhanVienQuanly("nguyen huy thao", "da nang", 1997, 500, 1.3);
        nhanVien[1] = new NhanVienSanXuat("nguyen viet hung", "nguyen van thoai", 2000, 50);
        nhanVien[2] = new NhanVienCongNhat("sang tokuda", "nhat ban", 1997, 27);

    }

    public void dissplay() {
        //XUẤT NHÂN VIÊN QUẢN LÝ
        System.out.println(" ========= XUẤT NHÂN VIÊN QUẢN LÝ =========");
        for (NhanVien item : nhanVien) {
            if (item instanceof NhanVienQuanly){
                System.out.println(item);
            }
        }

        //XUẤT NHÂN VIÊN SẢN XUẤT
        System.out.println(" ========= XUẤT NHÂN VIÊN SẢN XUẤT =========");
        for (NhanVien item : nhanVien) {
            if (item instanceof NhanVienSanXuat){
                System.out.println(item);
            }
        }
        //XUẤT NHÂN VIÊN CÔNG NHẬT
        System.out.println(" ========= XUẤT NHÂN VIÊN CÔNG NHẬT =========");
        for (NhanVien item : nhanVien) {
            if (item instanceof NhanVienCongNhat){
                System.out.println(item);
            }
        }
    }


}



