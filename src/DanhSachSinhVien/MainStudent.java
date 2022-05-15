package DanhSachSinhVien;

import ngay_thang_nam.MainProduct;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" student");
            System.out.println(" display student");
            System.out.println(" add student");
            System.out.println("search student");
            System.out.println("delete Student");
            System.out.println("update student");
            System.out.println("exit");
            System.out.println("choose");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("display list");

                    StudentDao.disslayStudent();

                    break;
                case 2:
                    System.out.println("Add new");
//                   MainStudent.NewStudentss();
                    StudentDao.addStudent();
                    break;

                case 6:
                    System.exit(0);
                    break;
            }
        } while (true) ;
    }
    private static void NewStudentss() {

    }
    private  static void addStudent(){

    }
}