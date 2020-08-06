package collection;

import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Java", "1234");
        map.put("asdf", "1111");
        //key 값이 같으면 value를 덮어쓴다.
        map.put("asdf", "1234");
        //Generic 과 맞지 않는 타입
        //map.put(100, "abcd");
    }
}
