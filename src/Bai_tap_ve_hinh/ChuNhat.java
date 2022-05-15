package Bai_tap_ve_hinh;

import java.util.Scanner;

public class ChuNhat {
    public static void main(String[] args) {
        int dai;
        int Rong;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu cao");
        dai = scanner.nextInt();
        System.out.println("nhap chieu rong");
        Rong = scanner.nextInt();
        for (int j = 0; j <= dai; j++) {
            for (int k = 0; k < Rong; k++) {
                System.out.print(" * ");

            }
System.out.println("");
        }
    }
}
