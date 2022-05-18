package vong_lap_for;

import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chieucao;
        System.out.println("nhap chieu cao");
        chieucao = scanner.nextInt();
//       for (int i = 0; i < chieucao; i++) {
//           for (int j = 0; j <=i ; j++) {
//               System.out.print("*");
//           }
//            System.out.println("");
//       }
//        System.out.println("\n----------------------------------");




//        for (int i = 0; i <= chieucao; i++) {
//            for (int j = chieucao; j >= i; j--) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//



//        for (int i = chieucao; i >= 0; i--) {
//            for (int j = chieucao-i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            for (int j = i; j > 0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//
//    }
//}
        for (int i = 0; i < chieucao ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {

            }
        }



    }
}