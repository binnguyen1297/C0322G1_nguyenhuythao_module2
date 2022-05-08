package ss2_bai_tap;

import java.util.Scanner;

public class tim_so_nguyen_to {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap number  = ");
        int number = scanner.nextInt();
        System.out.printf(" 20 so nguyen to dau tien la: \n", number);
        int count = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (count < number ) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static boolean isPrimeNumber(int number) { // so nguyen n < 2 khong phai la so nguyen to
        if (number < 2) {
            return false;
        } // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}





