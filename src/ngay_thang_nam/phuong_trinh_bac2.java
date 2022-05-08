package ngay_thang_nam;

import java.util.List;
import java.util.Scanner;

public class phuong_trinh_bac2 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner Sc = new Scanner(System.in);
        System.out.println("nhap vao so a");
        a = Sc.nextInt();
        System.out.println("nhap vao so b");
        b = Sc.nextInt();
        System.out.println("nhap vao so c");
        c = Sc.nextInt();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("phuong trinh khong ton tai");
        } else {
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("phuong trinh co nghiem kep x1 =x2" + x1);

            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co nghiem la");
                System.out.println("x1" + x1);
                System.out.println("x2" + x2);
            }
        }
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
