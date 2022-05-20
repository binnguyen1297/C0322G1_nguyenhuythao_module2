package congtiABC.View;

import CRUD.OfficeStaffManager;
import congtiABC.Model.NhanVien;

import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {




        boolean flag = true;
        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.print("Your choice: ");
            choice = (Integer.parseInt((new Scanner(System.in)).nextLine()));
            switch (choice) {
                case 1:
                   NhanVien.add();
                    break;
                case 2:
                  NhanVien.display();
                    break;
                case 3:
                   NhanVien.edit();
                    break;
                case 4:
                   NhanVien.delete();
                    break;
                case 5:
                   NhanVien.search();
                    break;
                default:
                    flag = false;
                    break;
            }
        }
        while (flag);
    }
}


