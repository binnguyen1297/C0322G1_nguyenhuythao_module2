package ss3_bai_tap;

import java.util.Scanner;

public class TinhTongCacCotOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size Col: ");
        int col = scanner.nextInt();
        System.out.print("Enter size Row: ");
        int row = scanner.nextInt();

        int[][] arr = new int[col][row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element Col " + i + " Row " + j + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Enter element index  : ");
        int index = scanner.nextInt();


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (index == j) {
                    sum += arr[i][index];
                }
            }
        }
        System.out.println("Sum of element with index = " + index + " : " + sum);
    }
}
