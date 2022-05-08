package ss2_bai_tap;

import java.util.Scanner;

public class ve_hinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println('\n');
                    }
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {

                            System.out.print(" * ");
                        }
                        System.out.print('\n');
                    }
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j -- ) {

                            System.out.print(" * ");
                        }
                        System.out.print('\n');

                    }
            }
        }
    }
}