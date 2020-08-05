package collection;

import java.util.*;
class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();
        List list = new ArrayList(length/LIMIT + 10);
        //i 는 LIMIT 만큼 증가 ( i += 10)
        for(int i=0; i < length; i+=LIMIT) {
            if(i+LIMIT < length )
                //0 ~ 9까지 잘라서 더한다. => 10 ~ 19까지 잘라서 더한다.
                list.add(source.substring(i, i+LIMIT));
            else
                list.add(source.substring(i));
        }
        //리스트를 차례대로 출력
        for(int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
} 
 