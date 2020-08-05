package test.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.*; => java.util의 모든 클래스를 모두 다 import

public class DateEx1 {
    public static void main(String[] args) {
        //java.util.Date day = new java.util.Date();
        //java.util.Date를 임포트 하면 Date로 바로 생성 가능
        //Date 클래스: 날짜를 표현하는 클래스, 날짜 정보를 객체간에 주고 받을 때 주로 사

        Date day = new Date();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //date - 메서드로 연산해서 정보를 리턴
        //cla - 시간에 모든 정보를 값으로 다 가지고 있다.
        System.out.println(day.toString());
        System.out.println(cal.toString());
        //포맷메서드에 데이트 객체를 넣어서 출력
        System.out.println(sdf.format(day));
    }
}
