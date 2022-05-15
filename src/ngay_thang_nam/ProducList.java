package ngay_thang_nam;

import java.util.Scanner;

public class ProducList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("...product");
            System.out.println("1. display list product");
            System.out.println("2.Add new product");
            System.out.println("3.Search product ");
            System.out.println("4. delete product");
            System.out.println("5.update product");
            System.out.println("6.Exit");
            System.out.println("choose options");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("display list");
                    MainProduct.displayList();
                    break;
                case 2:
                    System.out.println("Add new");
                    MainProduct.NewListOfProducts();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (true);
    }


}
