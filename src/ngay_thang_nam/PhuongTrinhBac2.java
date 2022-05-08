package ngay_thang_nam;

import java.util.List;
import java.util.Scanner;

public class PhuongTrinhBac2 {

    public static void main(String[] args) {
        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2();

        List<Double> heso = ptb2.nhapPhuongTrinhBac2(); // a = heso[0], b = heso[1], c = heso[2]
        List<Double> ketqua = ptb2.giaiPhuongTrinhBac2(heso.get(0), heso.get(1), heso.get(2));

        if (ketqua == null) {
            System.out.println("phuong trinh khong ton tai");
        } else {
            if (ketqua.isEmpty()) {
                System.out.println("phuong trinh vo nghiem");
            } else if (ketqua.size() == 1) {
                System.out.println("phuong trinh co nghiem kep x1 = x2 = " + ketqua.get(0));
            } else {
                System.out.println("phuong trinh co 2 nghiem la");
                System.out.println("x1 = " + ketqua.get(0));
                System.out.println("x2 = " + ketqua.get(1));
            }
        }
    }

    private List<Double> nhapPhuongTrinhBac2() {
        double a, b, c, x1, x2;
        Scanner Sc = new Scanner(System.in);
        System.out.println("nhap vao so a");
        a = Sc.nextInt();
        System.out.println("nhap vao so b");
        b = Sc.nextInt();
        System.out.println("nhap vao so c");
        c = Sc.nextInt();

        return List.of(a, b, c);
    }

    private List<Double> giaiPhuongTrinhBac2(Double a, Double b, Double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        double x1, x2;

        if (a == 0) {
            return null; // phuong trinh khong ton tai
        } else {
            if (delta < 0) {
                return List.of(); // phuong trinh vo nghiem
            } else if (delta == 0) {
                x1 = -b / (2 * a); // phuong trinh co nghiem kep x1 =x2
                return List.of(x1);
            } else {
                // phuong trinh co 2 nghiem rieng biet
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                return List.of(x1, x2);
            }
        }
    }
}
