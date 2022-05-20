package ProductManagement;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IProductService productService = new ProductService();

        do {
            System.out.println("-------------Product Management------------");
            System.out.println("1. Display list Product");
            System.out.println("2. Add new Product");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Update Product");
            System.out.println("6. Exit");
            System.out.println("Choose options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {

                case 1:
                    productService.displayListProduct();
                    break;
                case 2:
                    productService.addNewProduct();
                    break;
                case 3:
                    productService.findProductByName();
                    break;
                case 4:
                    productService.removeProductById();
                    break;
                case 5:
                    productService.UpdateProduct();
                case 6:
                    return;
            }
        } while (true);

    }
}