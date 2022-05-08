package ss2_thuc_hanh;

import java.util.Scanner;

public class tien_lai_cho_vay {
    public static void main(String[] args) {
        double monney = 0 ;
        int month = 1;
        double intereet_rate =1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien vay ");
        monney = scanner.nextDouble();
        System.out.println("nhap so thang");
        month =scanner.nextInt();
        System.out.println("nhap lai suat ");
        intereet_rate= scanner.nextDouble();
        double total_intereet = 0;
        for (int i = 0 ;i< month; i++);
        {
            total_intereet = monney * (intereet_rate / 100 / 12) * month;
        }
        System.out.println("Total of intereet"+ total_intereet);
    }
}
