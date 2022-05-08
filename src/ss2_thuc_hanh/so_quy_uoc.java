package ss2_thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class so_quy_uoc {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a");
        a = scanner.nextInt();
        System.out.println("nhap so b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("so quy uoc khong ton tai");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
            System.out.println("so quy uoc la: "+ a);
        }
    }
}

