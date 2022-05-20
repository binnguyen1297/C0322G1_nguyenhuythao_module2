package congtiABC.Controller;

import congtiABC.Model.NhanVien;
import congtiABC.Model.NhanVienCongNhat;
import congtiABC.Model.NhanVienQuanly;
import congtiABC.Model.NhanVienSanXuat;

import java.util.LinkedList;
import java.util.List;

public class LinkedListNhanVien {
    static List<NhanVien> linkedListNhanVien = new LinkedList<>();

    static {
        linkedListNhanVien.add(new NhanVienCongNhat("nguyen huy thao", "da nang", 1997, 25));
        linkedListNhanVien.add(new NhanVienQuanly(" nguyen viet hung", "da nang", 2000, 500, 2));
        linkedListNhanVien.add(new NhanVienSanXuat("sang tokuda", "da nang", 1997, 26));
    }

    public void disspalayLinkedList() {
        for (NhanVien item : linkedListNhanVien) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}
