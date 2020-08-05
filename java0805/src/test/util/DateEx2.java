package test.util;

import java.util.Calendar;
import java.util.Date;

public class DateEx2 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();

        //필드값을 상수로 사용하고 대문자로 이용하기 때문에 잘 사용하지 않는다.
        int y = cal.get(Calendar.YEAR);
        //현재 년도 - 1900 년도로 리턴 => 1900을 더해줘야한다.
        int yy = date.getYear() + 1900;

        System.out.println(y + "년");
        System.out.println(yy + "년");
    }
}
