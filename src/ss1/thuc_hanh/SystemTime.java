package ss1.thuc_hanh;

import java.util.Calendar;
import java.util.Date;

public class SystemTime {
    public static void main(String[] args) {
      //  Date now = new Date();
      //  System.out.println("Now is:" + now);
        Calendar calendar= Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("thoi gian hien tai " + date);
    }
}
