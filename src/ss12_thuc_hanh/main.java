package ss12_thuc_hanh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nnhap phan tu bat ky: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu chi so  5" + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("khong ton tai");
        }

    }
}
