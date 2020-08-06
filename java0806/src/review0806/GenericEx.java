package review0806;

import java.util.ArrayList;
import java.util.Date;

public class GenericEx {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        list1.add(100);
        list1.add("Jsp");
        list1.add(new Date());

        //바로 꺼내쓸 수 없다.
        //int obj1 = list1.get(0);
        Object obj2 = list1.get(0);
        if(obj2 instanceof Integer){
            System.out.println(("list1.get(0) => " + obj2 ));
        }

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Java");
        list2.add("Jsp");
        list2.add("Spring");

        String obj3 = list2.get(1);

        System.out.println(obj3);
    }
}
