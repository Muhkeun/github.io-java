package collection;

import java.util.TreeSet;

public class HashSetLotto {
    public static void main(String[] args) {
        //순서가 없고 들어가는 데로 정렬 해준다.
        TreeSet set = new TreeSet();
        //size가 6개가 될 때까지 반복 => 중복 값이 나오면 사이즈가 늘어나지 않는다.
        for (int i = 0; set.size() < 6 ; i ++){
        int num = (int)(Math.random()*45)+1;
        set.add(new Integer(num));
        }
        System.out.println(set);
    }
}
