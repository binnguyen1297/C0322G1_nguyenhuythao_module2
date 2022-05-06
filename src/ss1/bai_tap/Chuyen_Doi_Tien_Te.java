package ss1.bai_tap;

import java.util.Scanner;

public class Chuyen_Doi_Tien_Te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner Sc = new Scanner(System.in);
        System.out.println("nhap tien usd ");
        vnd = Sc.nextDouble();
        double quydoi = vnd*23000;
        System.out.println("vnd" + quydoi);
    }
}
