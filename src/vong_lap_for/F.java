package vong_lap_for;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong");
        double rong = scanner.nextDouble();
        System.out.println("nhap chieu dai");
        double dai = scanner.nextDouble();
        for (int i = 1; i <= dai; i++) {
            for (int j = 1; j <= rong; j++) {
                if (i == 1 || i == dai || j == 1 || j == rong) {
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }

            }System.out.println("");

        }


    }
}