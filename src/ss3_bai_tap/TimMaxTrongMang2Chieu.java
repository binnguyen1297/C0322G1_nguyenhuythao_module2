package ss3_bai_tap;

import java.util.List;
import java.util.Scanner;

public class TimMaxTrongMang2Chieu {

    public static void main(String[] args) {
        TimMaxTrongMang2Chieu tm2c = new TimMaxTrongMang2Chieu();

//        double[][] dauvao = {
//                {3, 4, 5},
//                {9, 7, 9},
//                {4, 9, 2}
//        };
        double[][] dauvao = tm2c.nhapMang2Chieu();
        List<Double> ketqua = tm2c.timMaxTrrongMang2Chieu(dauvao);
        System.out.println("Max = " + ketqua.get(0));
        System.out.println("Toa do = [" + ketqua.get(1).intValue() + "], [" + ketqua.get(2).intValue() + "]");
    }

    private double[][] nhapMang2Chieu() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("nhap do dai mang");
        a = scanner.nextInt();
        System.out.println("nhap phan tu trong");
        b = scanner.nextInt();

        double arr[][] = new double[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return arr;
    }

    private List<Double> timMaxTrrongMang2Chieu(double arr[][]) {
        double max = arr[0][0];
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        return List.of(max, (double) a, (double) b);
    }
}

