package ngay_thang_nam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class thoi_gian {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("thoi gian hien tai la"+ date);
        SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("thoi gian sau khi doi la" +sp.format(date));



    }
}
