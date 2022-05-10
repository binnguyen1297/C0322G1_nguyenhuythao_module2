package ss3_bai_tap;

import java.util.List;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap do dai mang: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n];
        System.out.println("nhap phan tu cho mang: ");
        for (i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("nhap so nguyen k: ");
        int k = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (A[i] != k) {
                A[c] = A[i];
                c++;
            }
        }
        n = c;
        System.out.println("mang con lai sau khi xoa " + k + " la: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }

}
