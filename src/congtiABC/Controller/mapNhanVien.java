package congtiABC.Controller;

import congtiABC.Model.NhanVien;
import congtiABC.Model.NhanVienCongNhat;
import congtiABC.Model.NhanVienQuanly;
import congtiABC.Model.NhanVienSanXuat;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapNhanVien {
    static Map<Integer, NhanVien> nhanVienMap = new LinkedHashMap<>();

    static {
        nhanVienMap.put(1, (new NhanVienCongNhat("nguyen huy thao", "da nang", 1997, 25)));
        nhanVienMap.put(2, new NhanVienQuanly(" nguyen viet hung", "da nang", 2000, 500, 2));
        nhanVienMap.put(3, new NhanVienSanXuat("sang tokuda", "da nang", 1997, 26));
    }

    public void dissplayMap() {
        for (Integer key : nhanVienMap.keySet()) {
            System.out.println(key + ":" + nhanVienMap.get(key));
        }

    }
}

