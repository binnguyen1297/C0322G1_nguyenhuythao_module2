package ngay_thang_nam;

import java.util.Scanner;

public class MainProduct {
    public  static  ListOfProducts[] MainProduct= new ListOfProducts[100];
    public  static  int count;
    static Scanner scanner = new Scanner(System.in);

    static {
        System.out.println("Block static");
        MainProduct[0]= new ListOfProducts(1,"Iphone",1000,10,"Apple");
        MainProduct[1]= new ListOfProducts(2,"S22 Ultra",1000,10,"Korea");
        MainProduct[2]= new ListOfProducts(3,"xiami",1000,10,"China");
        MainProduct[3]= new ListOfProducts(4,"macbook",1000,10,"Apple");
        MainProduct[4]= new ListOfProducts(5,"Dell",1000,10,"Sony");
        count = 5;
    }
    public static  void  NewListOfProducts() {
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap gia");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so luong");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap nha san xuat");
        String production = scanner.nextLine();
        MainProduct[count] = new ListOfProducts(count + 1, name, price, amount, production);
        count++;
    }
    public  static  void displayList(){
        for (ListOfProducts item: MainProduct) {
            if (item!= null){
                System.out.println(item);
            }
        }


    }
}
