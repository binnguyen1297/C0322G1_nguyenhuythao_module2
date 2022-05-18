package vong_lap_for;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong");
        double rong = scanner.nextDouble();
        System.out.println("nhap chieu dai");
        double dai = scanner.nextDouble();
        for (int i = 1; i <= rong; i++) {
            for (int j = 1; j <= dai; j++) {

                System.out.print("*");
            }System.out.println("  ");
        }
    }
}