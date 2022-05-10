package ss3_bai_tap;

import java.util.Scanner;

public class DemKiTuTrongChuoi {
    public static void main(String[] args) {
        String str = "nhap vao chuoi";

        Scanner sc = new Scanner(System.in);

        System.out.print("nhap ki tu can tim : ");
        char main = sc.nextLine().charAt(0);

        int count=0;

        for(int i=0; i< str.length(); i++){
            if(main == str.charAt(i)){
                count++;
            }
        }
        System.out.print("in ra so ki tu la: "+ count);
    }

}
