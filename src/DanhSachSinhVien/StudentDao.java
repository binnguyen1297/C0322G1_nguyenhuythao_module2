package DanhSachSinhVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentDao {
    public static Studentss[] StudentDao = new Studentss[50];
    public static int count;
    static Scanner scanner = new Scanner(System.in);

    static {
        System.out.println("block static");
        StudentDao[0] = new Studentss("1234", "NguyenVanA", "nguyenvan14@gmail.com", "113", "danang", 1);
        StudentDao[1] = new Studentss("12345", "NguyenVanB", "nguyenvanb@gmail.com", "114", "hue", 2);
        StudentDao[2] = new Studentss("1235", "NguyenVanC", "nguyenvanc@gmail.com", "115", "oita", 3);
        StudentDao[3] = new Studentss("1236", "NguyenVanD", "nguyenvand@gmail.com", "116", "hanoi", 1);
        StudentDao[4] = new Studentss("1237", "NguyenVanE", "nguyenvane@gmail.com", "117", "HCM", 1);
        StudentDao[5] = new Studentss("1238", "NguyenVanF", "nguyenvanf@gmail.com", "118", "fukuoka", 25);
        count = 6;
    }

    public static void NewStudentss() {
        System.out.println("nhap ma SV");
        String maSv = scanner.nextLine();
        System.out.println("nhap ho ten");
        String hoTen = scanner.nextLine();
        System.out.println("nhap email");
        String email = scanner.nextLine();
        System.out.println("nhap SDT");
        String soDT = scanner.nextLine();
        System.out.println("nhap dia chi");
        String diachi = scanner.nextLine();
        System.out.println("nhap gioi tinh");
        int gioitinh = scanner.nextInt();
        StudentDao[count] = new Studentss(maSv, hoTen, email, soDT, diachi, 1);
        count++;

    }

    public static void disslayStudent() {
        for (Studentss item : StudentDao) {
            if (item != null) {
                System.out.println(item);
            }

        }
    }
     public  static  void addStudent(){
         for (int i = 0; i <StudentDao.length ; i++) {
             if (StudentDao[i]==null){
                 System.out.println("nhap ma SV");
                 String maSv = scanner.nextLine();
                 System.out.println("nhap ho ten");
                 String hoTen = scanner.nextLine();
                 System.out.println("nhap email");
                 String email = scanner.nextLine();
                 System.out.println("nhap SDT");
                 String soDT = scanner.nextLine();
                 System.out.println("nhap dia chi");
                 String diachi = scanner.nextLine();
                 System.out.println("nhap gioi tinh");
                 int gioitinh = scanner.nextInt();
             StudentDao[i]=new Studentss(maSv,hoTen,email,soDT,diachi,gioitinh);
             System.out.println("......");
             }

         }
     }
}